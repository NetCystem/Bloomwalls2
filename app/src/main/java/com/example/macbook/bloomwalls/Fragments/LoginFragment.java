package com.example.macbook.bloomwalls.Fragments;


import android.app.Fragment;
import android.content.Context;
import android.os.Bundle;
import android.support.design.widget.TextInputEditText;
import android.support.design.widget.TextInputLayout;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.text.style.StyleSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

import com.example.macbook.bloomwalls.R;
import com.example.macbook.bloomwalls.Utils.Fonts;

import static android.graphics.Typeface.BOLD;

/**
 * A simple {@link Fragment} subclass.
 */
public class LoginFragment extends Fragment implements View.OnClickListener {

    private Context context;
    private ImageButton loginBackBtn;
    private Button loginGetStartedBtn;
    private TextView loginTitle;
    private TextView loginLoginLink;
    private TextView loginForgotPasswordLink;
    private TextInputLayout loginPassword;
    private TextInputLayout loginEmailOrPhone;
    private String loginSignupString;
    private String loginForgotPasswordString;


    public LoginFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.layout_login_fragment, container, false);

        context = getActivity();

        loginBackBtn = view.findViewById(R.id.login_back_btn);
        loginGetStartedBtn = view.findViewById(R.id.login_get_started_btn);
        loginGetStartedBtn.setTypeface(Fonts.getTpfBold(context));
        loginGetStartedBtn.setOnClickListener(this);
        loginTitle = view.findViewById(R.id.login_title);
        loginTitle.setTypeface(Fonts.getTpfBold(context));
        loginPassword = view.findViewById(R.id.login_password);
        loginPassword.setTypeface(Fonts.getTpfBold(context));
        loginEmailOrPhone = view.findViewById(R.id.login_enail_or_phone);
        loginEmailOrPhone.setTypeface(Fonts.getTpfBold(context));
        loginLoginLink = view.findViewById(R.id.login_login_link);
        loginForgotPasswordLink = view.findViewById(R.id.login_forgot_password_link);

        loginSignupString = getString(R.string.not_a_member_yet_sign_up);
        SpannableStringBuilder loginSpannableStringBuilder = new SpannableStringBuilder(loginSignupString);

        loginForgotPasswordString = getString(R.string.forgot_password);
        SpannableStringBuilder loginSpannableStringBuilder2 = new SpannableStringBuilder(loginForgotPasswordString);

        final StyleSpan loginBoldSpan = new StyleSpan(BOLD);

        ClickableSpan loginClickableSpan = new ClickableSpan() {
            @Override
            public void onClick(View widget) {

            }
        };

        ClickableSpan loginForgotClickableSpan = new ClickableSpan() {
            @Override
            public void onClick(View widget) {

            }
        };

        loginSpannableStringBuilder.setSpan(loginClickableSpan, 18, 25, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        loginSpannableStringBuilder.setSpan(loginBoldSpan, 18, 25, Spanned.SPAN_INCLUSIVE_EXCLUSIVE);
        loginLoginLink.setText(loginSpannableStringBuilder, TextView.BufferType.SPANNABLE);
        loginLoginLink.setTypeface(Fonts.getTpfRegular(context));
        loginLoginLink.setMovementMethod(LinkMovementMethod.getInstance());

        loginSpannableStringBuilder2.setSpan(loginForgotClickableSpan, 0, 16, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        loginSpannableStringBuilder2.setSpan(loginBoldSpan, 0, 16, Spanned.SPAN_INCLUSIVE_EXCLUSIVE);
        loginForgotPasswordLink.setText(loginSpannableStringBuilder2, TextView.BufferType.SPANNABLE);
        loginForgotPasswordLink.setTypeface(Fonts.getTpfRegular(context));
        loginForgotPasswordLink.setMovementMethod(LinkMovementMethod.getInstance());

        return view;
    }

    @Override
    public void onClick(View v) {

    }
}
