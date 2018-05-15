package com.example.macbook.bloomwalls.Fragments;



import android.app.Fragment;
import android.app.FragmentTransaction;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.macbook.bloomwalls.MainActivity;
import com.example.macbook.bloomwalls.R;
import com.example.macbook.bloomwalls.Utils.Fonts;


/**
 * A simple {@link Fragment} subclass.
 */
public class CreateAccountFragment extends Fragment implements View.OnClickListener {

    private ImageView createAccountBloomwallsIcon;
    private TextView createAccountTxt1;
    private TextView createAccountTxt2;
    private TextView createAccountTxt3;
    private Button createAccountButton;


    public CreateAccountFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.layout_create_account, container, false);
        final Context context = getActivity();

        String loginLink = getString(R.string.login_link);
        String allString = getString(R.string.acount_availibility, loginLink);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(allString);
        final StyleSpan bolding = new StyleSpan(android.graphics.Typeface.BOLD);



        createAccountBloomwallsIcon = view.findViewById(R.id.create_account_bloomwalls_icon);
        createAccountTxt1 = view.findViewById(R.id.create_account_txt1);
        createAccountTxt1.setTypeface(Fonts.getTpfRegular(context));
        createAccountTxt2 = view.findViewById(R.id.create_account_txt2);
        createAccountTxt2.setTypeface(Fonts.getTpfRegular(context));
        createAccountTxt3 = view.findViewById(R.id.create_account_txt3);
        createAccountButton = view.findViewById(R.id.create_account_btn);
        createAccountButton.setOnClickListener(this);

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
        createAccountTxt3.setText(spannableStringBuilder, TextView.BufferType.SPANNABLE);
        createAccountTxt3.setTypeface(Fonts.getTpfRegular(context));
        createAccountTxt3.setMovementMethod(LinkMovementMethod.getInstance());
        return view;
    }

    @Override
    public void onClick(View v) {


        Transact(new CollabTypeFragment());

    }

    public  void Transact(Fragment fragment) {

        FragmentTransaction transaction = getFragmentManager().beginTransaction();
        transaction.add(R.id.main_activity, fragment);
        transaction.commit();
    }
}
