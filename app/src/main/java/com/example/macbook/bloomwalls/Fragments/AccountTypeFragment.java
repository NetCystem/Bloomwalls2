package com.example.macbook.bloomwalls.Fragments;


import android.app.Fragment;
import android.app.FragmentTransaction;
import android.content.Context;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.example.macbook.bloomwalls.R;
import com.example.macbook.bloomwalls.Utils.Fonts;

/**
 * A simple {@link Fragment} subclass.
 */
public class AccountTypeFragment extends Fragment implements View.OnClickListener{
    Context context;
    TextView accountTypeLoginTxtx;
    CardView accountTypeHireCard;


    public AccountTypeFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.layout_account_type_fragment,container,false);
        context = getActivity();

        accountTypeHireCard = view.findViewById(R.id.account_type_hire_card);
        accountTypeHireCard.setOnClickListener(this);

        String loginLink = getString(R.string.login_link);
        String allString = getString(R.string.acount_availibility, loginLink);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(allString);
        final StyleSpan bolding = new StyleSpan(android.graphics.Typeface.BOLD);

        accountTypeLoginTxtx = view.findViewById(R.id.acount_type_login_txt);

        ClickableSpan clickableSpan = new ClickableSpan() {
            @Override
            public void onClick(View widget) {
                Toast.makeText(context, "Your toast message",
                        Toast.LENGTH_LONG).show();

            }
        };

        spannableStringBuilder.setSpan(clickableSpan, 25, 30, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
        spannableStringBuilder.setSpan(new ForegroundColorSpan(getResources().getColor(R.color.bloomWhite)), 25, 30, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
        spannableStringBuilder.setSpan(bolding, 25, 30, Spannable.SPAN_INCLUSIVE_INCLUSIVE);
        accountTypeLoginTxtx.setText(spannableStringBuilder, TextView.BufferType.SPANNABLE);
        accountTypeLoginTxtx.setTypeface(Fonts.getTpfRegular(context));
        accountTypeLoginTxtx.setMovementMethod(LinkMovementMethod.getInstance());

        return view;
    }

    @Override
    public void onClick(View v) {

        FragmentTransaction transaction = getFragmentManager().beginTransaction();
        transaction.replace(R.id.main_activity, new SignupFragment());
        transaction.commit();
    }
}
