package com.example.macbook.bloomwalls.Fragments;



import android.app.Fragment;
import android.app.FragmentTransaction;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TextInputEditText;
import android.support.design.widget.TextInputLayout;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Spinner;
import android.widget.TextView;

import com.example.macbook.bloomwalls.R;
import com.example.macbook.bloomwalls.Utils.Fonts;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

/**
 * A simple {@link Fragment} subclass.
 */
public class PersonalInformationFragment extends Fragment implements View.OnClickListener {


    private Context context;
    ImageButton personalInformationBackBtn;
    Button personalInformationfinishBtn;
    TextView personalInformationTitle;
    TextInputLayout personalInformationFirstName;
    TextInputLayout personalInformationLastName;
    TextInputLayout personalInformationCountry;
    TextInputLayout personalInformationCity;
    TextInputEditText personalInformationFirstNameInput;
    TextInputEditText personalInformationLastNameInput;
    TextInputEditText personalInformationCountryInput;
    TextInputEditText personalInformationCityInput;
    Spinner personalInformationSpinnerList;


    String[] spinnerValue = {
            "Your preffered GMT",
            "Mercury",
            "Venus",
            "Earth",
            "Mars",
            "Jupiter",
            "Saturn",
            "Uranus",
            "Neptune"
    };


    public PersonalInformationFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.layout_personal_information_fragment, container, false);
        view.setOnClickListener(this);
        context = getActivity();

        personalInformationSpinnerList = view.findViewById(R.id.personal_information_spinner);
        personalInformationTitle = view.findViewById(R.id.personal_information_title);
        personalInformationTitle.setTypeface(Fonts.getTpfBold(context));
        personalInformationBackBtn = view.findViewById(R.id.personal_information_back_btn);
        personalInformationfinishBtn = view.findViewById(R.id.personal_information_finish_btn);
        personalInformationfinishBtn.setTypeface(Fonts.getTpfBold(context));
        personalInformationfinishBtn.setOnClickListener(this);
        personalInformationFirstName = view.findViewById(R.id.personal_information_first_name);
        personalInformationFirstName.setTypeface(Fonts.getTpfBold(context));
        personalInformationLastName = view.findViewById(R.id.personal_information_last_name);
        personalInformationLastName.setTypeface(Fonts.getTpfBold(context));
        personalInformationCountry = view.findViewById(R.id.personal_information_country);
        personalInformationCountry.setTypeface(Fonts.getTpfBold(context));
        personalInformationCity = view.findViewById(R.id.personal_information_city);
        personalInformationCity.setTypeface(Fonts.getTpfBold(context));
        personalInformationFirstNameInput = view.findViewById(R.id.personal_information_first_name_input);
        personalInformationFirstNameInput.setTypeface(Fonts.getTpfRegular(context));
        personalInformationLastNameInput = view.findViewById(R.id.personal_information_last_name_input);
        personalInformationLastNameInput.setTypeface(Fonts.getTpfRegular(context));
        personalInformationCountryInput = view.findViewById(R.id.personal_information_country_input);
        personalInformationCountryInput.setTypeface(Fonts.getTpfRegular(context));
        personalInformationCityInput = view.findViewById(R.id.personal_information_city_input);
        personalInformationCityInput.setTypeface(Fonts.getTpfRegular(context));



        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(context,
                R.array.gmt_array, android.R.layout.simple_spinner_item);

        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        personalInformationSpinnerList.setAdapter(adapter);

        return view;
    }


    @Override
    public void onClick(View v) {

        int id = v.getId();
        if (id==R.id.personal_information_main){
            hideKeyboard();
        }else {

            FragmentTransaction transaction = getFragmentManager().beginTransaction();
            transaction.replace(R.id.main_frame, new VerificationFragment());
            transaction.commit();

        }


    }

    public void hideKeyboard(){
        final InputMethodManager inputManager = (InputMethodManager)getActivity().getSystemService(Context.INPUT_METHOD_SERVICE);

        inputManager.hideSoftInputFromWindow(getView().getWindowToken(),0);
        }
    }

