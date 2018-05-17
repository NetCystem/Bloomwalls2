package com.example.macbook.bloomwalls.Fragments;


import android.app.Fragment;
import android.app.FragmentTransaction;
import android.content.Context;
import android.os.Bundle;
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
import android.widget.TextView;
import android.widget.Toast;

import com.example.macbook.bloomwalls.R;
import com.example.macbook.bloomwalls.Utils.Fonts;

import static android.graphics.Typeface.BOLD;

/**
 * A simple {@link Fragment} subclass.
 */
public class VerificationFragment extends Fragment implements View.OnClickListener {

    private Context context;
    private TextView verificationLoginLink;
    private TextView verificationResendCodeLink;
    private TextView verificationForgotPasswordLink;
    private Button verificationButtonNext;
    private String verificationLoginString, verificationLoginAllString, verificationResendCodeString, verificationForgotPasswordString;


    public VerificationFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.layout_verification_fragment,container,false);

        context = getActivity();

        verificationForgotPasswordString = getString(R.string.forgot_password);
        verificationResendCodeString = getString(R.string.resend_code);
        verificationLoginString = getString(R.string.login_link);
        verificationLoginAllString = getString(R.string.acount_availibility, verificationLoginString);
        SpannableStringBuilder verificationStringBuilder = new SpannableStringBuilder(verificationLoginAllString);
        SpannableStringBuilder verificationStringBuilder2 = new SpannableStringBuilder(verificationResendCodeString);
        SpannableStringBuilder verificationStringBuilder3 = new SpannableStringBuilder(verificationForgotPasswordString);
        final StyleSpan verificationBoldSpan = new StyleSpan(BOLD);

        verificationLoginLink = view.findViewById(R.id.verification_login_link);
        verificationResendCodeLink = view.findViewById(R.id.verification_resend_code_link);
        verificationForgotPasswordLink = view.findViewById(R.id.verification_forgot_password_link);
        verificationButtonNext = view.findViewById(R.id.verification_button_next);
        verificationButtonNext.setOnClickListener(this);


        ClickableSpan verificationLoginClickableSpan = new ClickableSpan() {
            @Override
            public void onClick(View widget) {
                Toast.makeText(context, "Your toast message",
                        Toast.LENGTH_LONG).show();

            }
        };

        ClickableSpan verificationResendClickableSpan = new ClickableSpan() {
            @Override
            public void onClick(View widget) {
                Toast.makeText(context, "Your toast message",
                        Toast.LENGTH_LONG).show();

            }
        };

        ClickableSpan verificationForgotClickableSpan = new ClickableSpan() {
            @Override
            public void onClick(View widget) {
                Toast.makeText(context, "Your toast message",
                        Toast.LENGTH_LONG).show();

            }
        };

        verificationStringBuilder.setSpan(verificationLoginClickableSpan, 25, 30, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
        verificationStringBuilder2.setSpan(verificationResendClickableSpan, 41, 52, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
        verificationStringBuilder3.setSpan(verificationForgotClickableSpan, 0, 16, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
        verificationStringBuilder.setSpan(verificationBoldSpan, 25, 30, Spannable.SPAN_INCLUSIVE_INCLUSIVE);
        verificationStringBuilder2.setSpan(verificationBoldSpan, 41, 52, Spannable.SPAN_INCLUSIVE_INCLUSIVE);
        verificationLoginLink.setText(verificationStringBuilder, TextView.BufferType.SPANNABLE);
        verificationResendCodeLink.setText(verificationStringBuilder2, TextView.BufferType.SPANNABLE);
        verificationForgotPasswordLink.setText(verificationStringBuilder3, TextView.BufferType.SPANNABLE);
        verificationLoginLink.setTypeface(Fonts.getTpfRegular(context));
        verificationResendCodeLink.setTypeface(Fonts.getTpfRegular(context));
        verificationForgotPasswordLink.setTypeface(Fonts.getTpfRegular(context));
        verificationLoginLink.setMovementMethod(LinkMovementMethod.getInstance());
        verificationResendCodeLink.setMovementMethod(LinkMovementMethod.getInstance());
        verificationForgotPasswordLink.setMovementMethod(LinkMovementMethod.getInstance());

        return view;

    }

    @Override
    public void onClick(View v) {
        FragmentTransaction transaction = getFragmentManager().beginTransaction();
        transaction.replace(R.id.main_frame, new CreateAccountFragment());
        transaction.commit();
    }
}
