package com.example.macbook.bloomwalls.Fragments;



import android.app.Fragment;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TextInputEditText;
import android.support.design.widget.TextInputLayout;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Spinner;
import android.widget.TextView;

import com.example.macbook.bloomwalls.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class PersonalInformationFragment extends Fragment implements View.OnClickListener {


    ImageButton backBtn4;
    Button finishBtn;
    TextView personalInformationtxt;
    TextInputLayout firstName;
    TextInputLayout lastName;
    TextInputLayout country;
    TextInputLayout city;
    TextInputEditText firstNameInput;
    TextInputEditText lastNameInput;
    TextInputEditText countryInput;
    TextInputEditText cityInput;
//    Spinner gmtChoice;
//
//    String[] spinnerValue = {
//            "Mercury",
//            "Venus",
//            "Earth",
//            "Mars",
//            "Jupiter",
//            "Saturn",
//            "Uranus",
//            "Neptune"
//    };


    public PersonalInformationFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.layout_personal_information, container, false);

        personalInformationtxt = view.findViewById(R.id.personal_information);
        backBtn4 = view.findViewById(R.id.back_btn4);
        finishBtn = view.findViewById(R.id.finish_btn);
        finishBtn.setOnClickListener(this);
//        gmtChoice = view.findViewById(R.id.gmt_choice);
        firstName = view.findViewById(R.id.first_name);
        lastName = view.findViewById(R.id.last_name);
        country = view.findViewById(R.id.country);
        firstNameInput = view.findViewById(R.id.first_name_input);
        lastNameInput = view.findViewById(R.id.last_name_input);
        countryInput = view.findViewById(R.id.country_input);
        cityInput = view.findViewById(R.id.city_input);



//        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(getContext(),
//                R.array.gmt_array, android.R.layout.simple_spinner_item);
//
//        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
//        gmtChoice.setAdapter(adapter);

        return view;
    }


    @Override
    public void onClick(View v) {

        FragmentTransaction transaction3 = getFragmentManager().beginTransaction();
        transaction3.replace(R.id.main_activity, new SignupFragment());
        transaction3.commit();
    }
}
