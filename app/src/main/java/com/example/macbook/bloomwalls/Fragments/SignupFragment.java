package com.example.macbook.bloomwalls.Fragments;


import android.app.Fragment;
import android.app.FragmentTransaction;
import android.os.Bundle;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.example.macbook.bloomwalls.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class SignupFragment extends Fragment implements View.OnClickListener{

    Button signupCreateAccountBtn;


    public SignupFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.layout_signup_fragment, container, false);
        signupCreateAccountBtn = view.findViewById(R.id.signup_create_account_btn);
        signupCreateAccountBtn.setOnClickListener(this);
        return view;

    }

    @Override
    public void onClick(View v) {

        FragmentTransaction transaction = getFragmentManager().beginTransaction();
        transaction.replace(R.id.main_activity, new PersonalInformationFragment());
        transaction.commit();

    }
}
