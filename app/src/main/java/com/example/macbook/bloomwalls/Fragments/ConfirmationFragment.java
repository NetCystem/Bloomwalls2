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
public class ConfirmationFragment extends Fragment implements View.OnClickListener {

    private Context context;
    private TextView confirmationLoginLink;
    private TextView confirmationResendCodeLink;
    private Button confirmationButtonFinish;
    private String confirmationLoginString, confirmationLoginAllString, confirmationResendCodeString;

    public ConfirmationFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.layout_confirmation_fragment,container,false);

        context = getActivity();

        confirmationResendCodeString = getString(R.string.resend_code);
        confirmationLoginString = getString(R.string.login_link);
        confirmationLoginAllString = getString(R.string.acount_availibility, confirmationLoginString);
        SpannableStringBuilder confirmationStringBuilder = new SpannableStringBuilder(confirmationLoginAllString);
        SpannableStringBuilder confirmationStringBuilder2 = new SpannableStringBuilder(confirmationResendCodeString);

        final StyleSpan verificationBoldSpan = new StyleSpan(BOLD);

        confirmationLoginLink = view.findViewById(R.id.confirmation_login_link);
        confirmationResendCodeLink = view.findViewById(R.id.confirmation_resend_code_link);
        confirmationButtonFinish = view.findViewById(R.id.confirmation_button_finish);
        confirmationButtonFinish.setOnClickListener(this);


        ClickableSpan confirmatioLoginClickableSpan = new ClickableSpan() {
            @Override
            public void onClick(View widget) {
                Toast.makeText(context, "Your toast message",
                        Toast.LENGTH_LONG).show();

            }
        };

        ClickableSpan confirmatioResendClickableSpan = new ClickableSpan() {
            @Override
            public void onClick(View widget) {
                Toast.makeText(context, "Your toast message",
                        Toast.LENGTH_LONG).show();

            }
        };



        confirmationStringBuilder.setSpan(confirmatioLoginClickableSpan, 25, 30, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
        confirmationStringBuilder2.setSpan(confirmatioResendClickableSpan, 41, 52, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);

        confirmationStringBuilder.setSpan(verificationBoldSpan, 25, 30, Spannable.SPAN_INCLUSIVE_INCLUSIVE);
        confirmationStringBuilder2.setSpan(verificationBoldSpan, 41, 52, Spannable.SPAN_INCLUSIVE_INCLUSIVE);

        confirmationLoginLink.setText(confirmationStringBuilder, TextView.BufferType.SPANNABLE);
        confirmationResendCodeLink.setText(confirmationStringBuilder2, TextView.BufferType.SPANNABLE);

        confirmationLoginLink.setTypeface(Fonts.getTpfRegular(context));
        confirmationResendCodeLink.setTypeface(Fonts.getTpfRegular(context));

        confirmationLoginLink.setMovementMethod(LinkMovementMethod.getInstance());
        confirmationResendCodeLink.setMovementMethod(LinkMovementMethod.getInstance());


        return view;
    }

    @Override
    public void onClick(View v) {

        FragmentTransaction transaction = getFragmentManager().beginTransaction();
        transaction.replace(R.id.main_frame, new ForgotPasswordFragment());
        transaction.commit();
    }
}
