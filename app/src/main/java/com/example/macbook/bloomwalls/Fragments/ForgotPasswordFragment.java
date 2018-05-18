package com.example.macbook.bloomwalls.Fragments;


import android.app.Fragment;
import android.app.FragmentTransaction;
import android.content.Context;
import android.os.Bundle;
import android.support.design.widget.TextInputEditText;
import android.support.design.widget.TextInputLayout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

import com.example.macbook.bloomwalls.R;
import com.example.macbook.bloomwalls.Utils.Fonts;

/**
 * A simple {@link Fragment} subclass.
 */
public class ForgotPasswordFragment extends Fragment implements View.OnClickListener {

    private Context context;
    private ImageButton forgotPasswordBackBtn;
    private Button forgotPasswordResetBtn;
    private TextView forgotPasswordTitle;
    private TextInputEditText forgotPasswordEmailInput;
    private TextInputLayout forgotPasswordEmail;

    public ForgotPasswordFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.layout_forgot_password_fragment, container, false);

        context = getActivity();

        forgotPasswordBackBtn = view.findViewById(R.id.forgot_password_back_btn);
        forgotPasswordResetBtn = view.findViewById(R.id.forgot_password_reset_btn);
        forgotPasswordResetBtn.setTypeface(Fonts.getTpfBold(context));
        forgotPasswordResetBtn.setOnClickListener(this);
        forgotPasswordTitle = view.findViewById(R.id.forgot_password_title);
        forgotPasswordTitle.setTypeface(Fonts.getTpfBold(context));
        forgotPasswordEmailInput = view.findViewById(R.id.forgot_password_email_input);
        forgotPasswordEmail = view.findViewById(R.id.forgot_password_email);
        forgotPasswordEmail.setTypeface(Fonts.getTpfBold(context));
        return view;
    }

    @Override
    public void onClick(View v) {

        FragmentTransaction transaction = getFragmentManager().beginTransaction();
        transaction.replace(R.id.main_frame, new ResetPasswordFragment());
        transaction.commit();
    }
}
