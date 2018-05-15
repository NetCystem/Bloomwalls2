package com.example.macbook.bloomwalls.Fragments;


import android.app.Fragment;
import android.app.FragmentTransaction;
import android.content.Context;
import android.os.Bundle;

import android.support.v7.widget.CardView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;

import com.example.macbook.bloomwalls.R;
import com.example.macbook.bloomwalls.Utils.Fonts;

/**
 * A simple {@link Fragment} subclass.
 */
public class CollabTypeFragment extends Fragment implements View.OnClickListener {

    ImageButton collabBackImgBtn;
    TextView collabBackImgBtnTxt;
    TextView collabDirectCardTitle;
    TextView collabOneToOneCardTitle;
    TextView collabDirectCardTxt;
    TextView collabOneToOneCardTxt;
    CardView collabDirectCard;
    CardView collabOneToOneCard;
    Context context;

    public CollabTypeFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.layout_collab_type, container, false);
        context = getActivity();

        collabBackImgBtn = view.findViewById(R.id.collab_back_img_btn);
        collabBackImgBtnTxt = view.findViewById(R.id.collab_back_img_btn_txt);
        collabBackImgBtnTxt.setTypeface(Fonts.getTpfRegular(context));
        collabDirectCard = view.findViewById(R.id.collab_direct_card);
        collabDirectCard.setOnClickListener(this);
        collabOneToOneCard = view.findViewById(R.id.collab_one_to_one_card);
        collabDirectCardTitle = view.findViewById(R.id.collab_direct_card_title);
        collabDirectCardTitle.setTypeface(Fonts.getTpfBold(context));
        collabOneToOneCardTitle = view.findViewById(R.id.collab_1_to_1_card_title);
        collabOneToOneCardTitle.setTypeface(Fonts.getTpfBold(context));
        collabDirectCardTxt = view.findViewById(R.id.collab_direct_card_txt);
        collabDirectCardTxt.setTypeface(Fonts.getTpfRegular(context));
        collabOneToOneCardTxt = view.findViewById(R.id.collab_1_to_1_card_txt);
        collabOneToOneCardTxt.setTypeface(Fonts.getTpfRegular(context));

        return view;
    }

    @Override
    public void onClick(View v) {
        FragmentTransaction transaction = getFragmentManager().beginTransaction();
        transaction.replace(R.id.main_activity, new SkipFragment());
        transaction.commit();
    }
}
