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

import static android.graphics.Typeface.BOLD;

/**
 * A simple {@link Fragment} subclass.
 */
public class AccountTypeFragment extends Fragment implements View.OnClickListener {
    private Context context;
    private TextView accountTypeLoginLink, accountTypeTitle, accountTypeSubTitle, accountTypeHireTitle, accountTypeWorkTitle;
    private CardView accountTypeHireCard;
    private String accountTypeLoginString, accountTypeLoginAllString;


    public AccountTypeFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.layout_account_type_fragment, container, false);
        context = getActivity();

        accountTypeTitle = view.findViewById(R.id.account_type_title);
        accountTypeTitle.setTypeface(Fonts.getTpfBold(context));
        accountTypeSubTitle = view.findViewById(R.id.account_type_sub_title);
        accountTypeSubTitle.setTypeface(Fonts.getTpfRegular(context));
        accountTypeHireTitle = view.findViewById(R.id.account_type_hire_title);
        accountTypeHireTitle.setTypeface(Fonts.getTpfBold(context));
        accountTypeWorkTitle = view.findViewById(R.id.account_type_work_title);
        accountTypeWorkTitle.setTypeface(Fonts.getTpfBold(context));
        accountTypeHireCard = view.findViewById(R.id.account_type_hire_card);
        accountTypeHireCard.setOnClickListener(this);
        accountTypeLoginString = getString(R.string.login_link);
        accountTypeLoginAllString = getString(R.string.acount_availibility, accountTypeLoginString);
        accountTypeLoginLink = view.findViewById(R.id.acount_type_login_link);

        SpannableStringBuilder accountTypeStringBuilder = new SpannableStringBuilder(accountTypeLoginAllString);


        ClickableSpan accountTypeClickableSpan = new ClickableSpan() {
            @Override
            public void onClick(View widget) {
                Toast.makeText(context, "Your toast message",
                        Toast.LENGTH_LONG).show();

            }
        };

        accountTypeStringBuilder.setSpan(accountTypeClickableSpan, 25, 30, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
        accountTypeStringBuilder.setSpan(new StyleSpan(BOLD), 25, 30, Spannable.SPAN_INCLUSIVE_INCLUSIVE);
        accountTypeLoginLink.setText(accountTypeStringBuilder, TextView.BufferType.SPANNABLE);
        accountTypeLoginLink.setTypeface(Fonts.getTpfRegular(context));
        accountTypeLoginLink.setMovementMethod(LinkMovementMethod.getInstance());

        return view;
    }

    @Override
    public void onClick(View v) {

        FragmentTransaction transaction = getFragmentManager().beginTransaction();
        transaction.replace(R.id.main_frame, new SignupFragment());
        transaction.commit();
    }
}
