package com.example.macbook.bloomwalls;

import android.content.Intent;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.support.design.widget.TextInputLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.Html;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

public class SignupActivity extends AppCompatActivity {

    private ImageButton signupFormBackBtn;
    private TextView signupToWork, signupTermsOfService, signupAccountAvailibility, signupLoginLink;
    private TextInputLayout signupEmail, signupPhoneNumber, signupPassword;
    private EditText signupInputEmail, signupInputPhoneNumber, signupInputPassword;
    private Button signupCreateAccountBtn;
    private Typeface tpfRegular, tpfBold;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.signup_to_work_layout);

        String termsOfService = "By clicking ''Create Account'' I agree to BloomWalls <u>Terms of Service</u>";


        tpfRegular = Typeface.createFromAsset(getAssets(),
                "fonts/sf_ui_display_regular.otf");
        tpfBold = Typeface.createFromAsset(getAssets(),
                "fonts/sf_ui_display_bold.otf");

        signupFormBackBtn = findViewById(R.id.back_btn3);
        signupToWork = findViewById(R.id.signup_to_work);
        signupToWork.setTypeface(tpfBold);
        signupEmail = findViewById(R.id.signup_email);
        signupEmail.setTypeface(tpfBold);
        signupPhoneNumber = findViewById(R.id.signup_phone_number);
        signupPhoneNumber.setTypeface(tpfBold);
        signupPassword = findViewById(R.id.signup_password);
        signupPassword.setTypeface(tpfBold);
        signupInputEmail = findViewById(R.id.signup_input_email);
        signupInputEmail.setTypeface(tpfBold);
        signupInputPhoneNumber = findViewById(R.id.signup_input_phone_number);
        signupInputPhoneNumber.setTypeface(tpfBold);
        signupInputPassword = findViewById(R.id.signup_input_password);
        signupInputPassword.setTypeface(tpfBold);
        signupCreateAccountBtn = findViewById(R.id.signup_create_account_btn);
        signupCreateAccountBtn.setTypeface(tpfBold);
        signupTermsOfService = findViewById(R.id.signup_terms_of_service);
        signupTermsOfService.setText(Html.fromHtml(termsOfService));
        signupTermsOfService.setTypeface(tpfRegular);
        signupAccountAvailibility = findViewById(R.id.signup_acount_availibility);
        signupAccountAvailibility.setTypeface(tpfRegular);
        signupLoginLink = findViewById(R.id.signup_login_link);
        signupLoginLink.setTypeface(tpfBold);
        signupLoginLink.setPaintFlags(signupLoginLink.getPaintFlags()| Paint.UNDERLINE_TEXT_FLAG);
        signupLoginLink.setLineSpacing(0.0f, 1.1f);
        signupLoginLink.setMovementMethod(LinkMovementMethod.getInstance());

        signupCreateAccountBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(SignupActivity.this, VerificationActivity.class));
            }
        });






    }


    private void submitForm() {
        if (!validateEmail()) {
            return;
        }

        if (!validatePhoneNumber()) {
            return;
        }

        if (!validatePassword()) {
            return;
        }

        Toast.makeText(getApplicationContext(), "Thank You!", Toast.LENGTH_SHORT).show();
    }

    private boolean validateEmail() {
        if (signupInputEmail.getText().toString().trim().isEmpty()) {
            signupEmail.setError(getString(R.string.err_msg_email));
            requestFocus(signupInputEmail);
            return false;
        } else {
            signupEmail.setErrorEnabled(false);
        }

        return true;
    }

    private boolean validatePhoneNumber() {
        String email = signupInputPhoneNumber.getText().toString().trim();

        if (email.isEmpty() || !isValidEmail(email)) {
            signupPhoneNumber.setError(getString(R.string.err_msg_phone));
            requestFocus(signupInputPhoneNumber);
            return false;
        } else {
            signupPhoneNumber.setErrorEnabled(false);
        }

        return true;
    }

    private boolean validatePassword() {
        if (signupInputPassword.getText().toString().trim().isEmpty()) {
            signupPassword.setError(getString(R.string.err_msg_password));
            requestFocus(signupInputPassword);
            return false;
        } else {
            signupPassword.setErrorEnabled(false);
        }

        return true;
    }

    private static boolean isValidEmail(String email) {
        return !TextUtils.isEmpty(email) && android.util.Patterns.EMAIL_ADDRESS.matcher(email).matches();
    }

    private void requestFocus(View view) {
        if (view.requestFocus()) {
            getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_ALWAYS_VISIBLE);
        }
    }

    private class MyTextWatcher implements TextWatcher {

        private View view;

        private MyTextWatcher(View view) {
            this.view = view;
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
        }

        public void afterTextChanged(Editable editable) {
            switch (view.getId()) {
                case R.id.signup_input_email:
                    validateEmail();
                    break;
                case R.id.signup_input_phone_number:
                    validateEmail();
                    break;
                case R.id.signup_input_password:
                    validatePassword();
                    break;
            }
        }
    }
}
