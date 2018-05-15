package com.example.macbook.bloomwalls.Activities;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

//import com.example.macbook.bloomwalls.Fragments.PersonalInformationFragment;
import com.example.macbook.bloomwalls.R;
import com.example.macbook.bloomwalls.Utils.Fonts;

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
    Context context;

    String resendCode = "If you haven’t received the e-mail \n" + "click Resend code";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_verification_fragment);

        context = this;
        backBtn5 = findViewById(R.id.back_btn5);
        forgotPassword = findViewById(R.id.forgot_password);
        forgotPassword.setTypeface(Fonts.getTpfRegular(this));
        verificationTxt = findViewById(R.id.verification);
        verificationTxt.setTypeface(Fonts.getTpfBold(this));
        codeInputmethodTxt = findViewById(R.id.code_input_method);
        codeInputmethodTxt.setTypeface(Fonts.getTpfRegular(this));
        resendCodeLink = findViewById(R.id.resend_code_link);
        verificationLoginLink = findViewById(R.id.verification_login_link);
        linearVerification = findViewById(R.id.linear_verification);
//        verificationEmail = findViewById(R.id.verification_email);
//        verificationSms = findViewById(R.id.verification_sms);
        next_button = findViewById(R.id.button_next);
        next_button.setTypeface(Fonts.getTpfBold(this));
        input_code = findViewById(R.id.code_input);
        input_code.setTypeface(Fonts.getTpfBold(this));
        ImageView emailPic = findViewById(R.id.email_pic);
        ImageView smsPic = findViewById(R.id.sms_pic);
        TextView emailtxt = findViewById(R.id.email_txt);
        TextView smstxt = findViewById(R.id.sms_txt);
        emailtxt.setTypeface(Fonts.getTpfBold(this));
        smstxt.setTypeface(Fonts.getTpfBold(this));
        final CardView cardEmail = findViewById(R.id.card_email);
        cardEmail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cardEmail.setElevation(0);
                cardEmail.setElevation(10);
            }
        });

//        next_button.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//
//                PersonalInformationFragment personalInformation = new PersonalInformationFragment();
//                FragmentTransaction fragmentTransaction = getFragmentManager().beginTransaction();
//                fragmentTransaction.replace(R.id.verification_main, personalInformation);
//                fragmentTransaction.addToBackStack(null);
//                fragmentTransaction.commit();
//            }
//        });

    }
}
