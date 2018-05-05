package com.example.macbook.bloomwalls.Fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.macbook.bloomwalls.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class Done extends Fragment {


    public Done() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.done_layout, container, false);
    }

}
