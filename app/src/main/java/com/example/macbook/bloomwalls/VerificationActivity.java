package com.example.macbook.bloomwalls;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;

public class VerificationActivity extends AppCompatActivity {
    ImageButton backBtn5;
    TextView forgotPassword;
    TextView verificationTxt;
    TextView codeInputmethodTxt;
    TextView resendCodeLink;
    TextView verificationLoginLink;
    LinearLayout linearVerification;
    Button verificationEmail;
    Button verificationSms;
    Button next_button;
    EditText input_code;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.verification_layout);

        backBtn5 = findViewById(R.id.back_btn5);
        forgotPassword = findViewById(R.id.forgot_password);
        verificationTxt = findViewById(R.id.verification);
        codeInputmethodTxt = findViewById(R.id.code_input_method);
        resendCodeLink = findViewById(R.id.resend_code_link);
        verificationLoginLink = findViewById(R.id.verification_login_link);
        linearVerification = findViewById(R.id.linear_verification);
        verificationEmail = findViewById(R.id.verification_email);
        verificationSms = findViewById(R.id.verification_sms);
        next_button = findViewById(R.id.button_next);
        input_code = findViewById(R.id.code_input);
    }
}
