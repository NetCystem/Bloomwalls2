package com.example.macbook.bloomwalls.Fragments;


import android.app.Fragment;
import android.app.FragmentTransaction;
import android.content.Context;
import android.os.Bundle;

import android.support.design.widget.TextInputLayout;
import android.text.InputType;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.text.style.StyleSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

import com.example.macbook.bloomwalls.R;
import com.example.macbook.bloomwalls.Utils.Fonts;

import static android.graphics.Typeface.BOLD;
import static android.text.InputType.TYPE_TEXT_VARIATION_EMAIL_ADDRESS;

/**
 * A simple {@link Fragment} subclass.
 */
public class SignupFragment extends Fragment implements View.OnClickListener {

    private Context context;
    private Button signupCreateAccountBtn;
    private ImageButton signupBackBtn;
    private TextView signupToWork, signupTermsOfServiceLink, signupLoginLink;
    private TextInputLayout signupEmail, signupPhoneNumber, signupPassword;
    private EditText signupInputEmail, signupInputPhoneNumber, signupInputPassword;
    private String signupLoginString, signupLoginAllString, signupTermsOfServiceString;


    public SignupFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.layout_signup_fragment, container, false);
        context = getActivity();

        signupBackBtn = view.findViewById(R.id.signup_back_btn);
        signupToWork = view.findViewById(R.id.signup_to_work);
        signupToWork.setTypeface(Fonts.getTpfBold(context));
        signupTermsOfServiceLink = view.findViewById(R.id.signup_terms_of_service_link);
        signupLoginLink = view.findViewById(R.id.signup_login_link);
        signupEmail = view.findViewById(R.id.signup_email);
        signupEmail.setTypeface(Fonts.getTpfBold(context));
        signupPhoneNumber = view.findViewById(R.id.signup_phone_number);
        signupPhoneNumber.setTypeface(Fonts.getTpfBold(context));
        signupPassword = view.findViewById(R.id.signup_password);
        signupPassword.setTypeface(Fonts.getTpfBold(context));
        signupInputEmail = view.findViewById(R.id.signup_input_email);
        signupInputEmail.setTypeface(Fonts.getTpfRegular(context));
        signupInputEmail.setInputType(InputType.TYPE_CLASS_TEXT | TYPE_TEXT_VARIATION_EMAIL_ADDRESS);
        signupInputPhoneNumber = view.findViewById(R.id.signup_input_phone_number);
        signupInputPhoneNumber.setTypeface(Fonts.getTpfRegular(context));
        signupInputPhoneNumber.setInputType(InputType.TYPE_CLASS_PHONE);
        signupInputPassword = view.findViewById(R.id.signup_input_password);
        signupInputPassword.setTypeface(Fonts.getTpfRegular(context));
        signupInputPassword.setInputType(InputType.TYPE_CLASS_TEXT | InputType.TYPE_TEXT_VARIATION_PASSWORD);
        signupCreateAccountBtn = view.findViewById(R.id.signup_create_account_btn);
        signupCreateAccountBtn.setTypeface(Fonts.getTpfBold(context));
        signupCreateAccountBtn.setOnClickListener(this);


        signupLoginString = getString(R.string.login_link);
        signupLoginAllString = getString(R.string.acount_availibility,signupLoginString);
        signupTermsOfServiceString = getString(R.string.terms_of_service);
        SpannableStringBuilder signupStringBuilder = new SpannableStringBuilder(signupLoginAllString);
        SpannableStringBuilder signupStringBuilder2 = new SpannableStringBuilder(signupTermsOfServiceString);
        final StyleSpan signupBoldSpan = new StyleSpan(BOLD);

        ClickableSpan signupLoginClickableSpan = new ClickableSpan() {
            @Override
            public void onClick(View widget) {

            }
        };

        ClickableSpan signupTermsClickableSpan = new ClickableSpan() {
            @Override
            public void onClick(View widget) {

            }
        };

        signupStringBuilder.setSpan(signupLoginClickableSpan, 25, 30, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
        signupStringBuilder2.setSpan(signupTermsClickableSpan, 53, 69, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
        signupStringBuilder.setSpan(signupBoldSpan, 25, 30, Spannable.SPAN_INCLUSIVE_INCLUSIVE);
        signupStringBuilder2.setSpan(signupBoldSpan, 53, 69, Spannable.SPAN_INCLUSIVE_INCLUSIVE);
        signupLoginLink.setText(signupStringBuilder, TextView.BufferType.SPANNABLE);
        signupTermsOfServiceLink.setText(signupStringBuilder2, TextView.BufferType.SPANNABLE);
        signupLoginLink.setTypeface(Fonts.getTpfRegular(context));
        signupTermsOfServiceLink.setTypeface(Fonts.getTpfRegular(context));
        signupLoginLink.setMovementMethod(LinkMovementMethod.getInstance());
        signupTermsOfServiceLink.setMovementMethod(LinkMovementMethod.getInstance());

        return view;

    }

    @Override
    public void onClick(View v) {

        FragmentTransaction transaction = getFragmentManager().beginTransaction();
        transaction.replace(R.id.main_frame, new PersonalInformationFragment());
        transaction.commit();

    }

}
