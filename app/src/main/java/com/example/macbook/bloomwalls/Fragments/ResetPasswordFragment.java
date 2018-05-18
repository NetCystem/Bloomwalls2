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
public class ResetPasswordFragment extends Fragment implements View.OnClickListener {


    private Context context;
    private ImageButton resetPasswordBackBtn;
    private Button resetPasswordSubmitBtn;
    private TextView resetPasswordTitle;
    private TextInputEditText resetPasswordNewPasswordInput;
    private TextInputEditText resetPasswordConfirmPasswordInput;
    private TextInputLayout resetPasswordNewPassword;
    private TextInputLayout resetPasswordConfirmPassword;

    public ResetPasswordFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.layout_reset_password_fragment, container, false);

        context = getActivity();

        resetPasswordBackBtn = view.findViewById(R.id.reset_password_back_btn);
        resetPasswordSubmitBtn = view.findViewById(R.id.reset_password_submit_btn);
        resetPasswordSubmitBtn.setTypeface(Fonts.getTpfBold(context));
        resetPasswordSubmitBtn.setOnClickListener(this);
        resetPasswordTitle = view.findViewById(R.id.reset_password_title);
        resetPasswordTitle.setTypeface(Fonts.getTpfBold(context));
        resetPasswordNewPasswordInput = view.findViewById(R.id.reset_password_new_password_input);
        resetPasswordNewPassword = view.findViewById(R.id.reset_password_new_password);
        resetPasswordNewPassword.setTypeface(Fonts.getTpfBold(context));
        resetPasswordConfirmPasswordInput = view.findViewById(R.id.reset_password_confirm_password_input);
        resetPasswordConfirmPassword = view.findViewById(R.id.reset_password_confirm_password);
        resetPasswordConfirmPassword.setTypeface(Fonts.getTpfBold(context));

        return view;
    }

    @Override
    public void onClick(View v) {
        FragmentTransaction transaction = getFragmentManager().beginTransaction();
        transaction.replace(R.id.main_frame, new LoginFragment());
        transaction.commit();
    }
}
