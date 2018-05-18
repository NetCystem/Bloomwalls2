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
public class RatingFragment extends Fragment {


    public RatingFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.layout_rating_fragment, container, false);

        return view;

    }
}
