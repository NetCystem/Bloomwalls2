package com.example.macbook.bloomwalls.Fragments;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import com.example.macbook.bloomwalls.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class PersonalInformation extends Fragment {


    Spinner gmtChoice;
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


    public PersonalInformation() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.personal_information_layout, container, false);

        gmtChoice = view.findViewById(R.id.gmt_choice);

        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(getContext(),
                R.array.gmt_array, android.R.layout.simple_spinner_item);

        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        gmtChoice.setAdapter(adapter);



        return view;
    }


    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }
}
