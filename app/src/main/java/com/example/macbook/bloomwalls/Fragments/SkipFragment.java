package com.example.macbook.bloomwalls.Fragments;


import android.app.Fragment;
import android.app.FragmentTransaction;
import android.content.Context;
import android.os.Bundle;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.macbook.bloomwalls.R;
import com.example.macbook.bloomwalls.Utils.Fonts;

import static android.graphics.Typeface.BOLD;

/**
 * A simple {@link Fragment} subclass.
 */
public class SkipFragment extends Fragment implements View.OnClickListener {

    private Context context;
    private ImageView skipBloomwallsIcon;
    private TextView skipTxt1, skipTxt2, skipLoginLink;
    private Button skipButton;
    private String skipLoginString, skipLoginAllString;


    public SkipFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.layout_skip_fragment, container, false);
        context = getActivity();

        skipBloomwallsIcon = view.findViewById(R.id.skip_bloomwalls_icon);
        skipTxt1 = view.findViewById(R.id.skip_txt1);
        skipTxt1.setTypeface(Fonts.getTpfRegular(context));
        skipTxt2 = view.findViewById(R.id.skip_txt2);
        skipTxt2.setTypeface(Fonts.getTpfRegular(context));
        skipLoginLink = view.findViewById(R.id.skip_login_link);
        skipButton = view.findViewById(R.id.skip_btn);
        skipButton.setTypeface(Fonts.getTpfBold(context));
        skipButton.setOnClickListener(this);
        skipLoginString = getString(R.string.login_link);
        skipLoginAllString = getString(R.string.acount_availibility, skipLoginString);

        SpannableStringBuilder skipStringBuilder = new SpannableStringBuilder(skipLoginAllString);

        ClickableSpan skipClickableSpan = new ClickableSpan() {
            @Override
            public void onClick(View widget) {
                Toast.makeText(context, "Your toast message",
                        Toast.LENGTH_LONG).show();

            }
        };

        skipStringBuilder.setSpan(skipClickableSpan, 25, 30, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
        skipStringBuilder.setSpan(new ForegroundColorSpan(getResources().getColor(R.color.bloomWhite)), 25, 30, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
        skipStringBuilder.setSpan(new StyleSpan(BOLD), 25, 30, Spannable.SPAN_INCLUSIVE_INCLUSIVE);
        skipLoginLink.setText(skipStringBuilder, TextView.BufferType.SPANNABLE);
        skipLoginLink.setTypeface(Fonts.getTpfRegular(context));
        skipLoginLink.setMovementMethod(LinkMovementMethod.getInstance());

        return view;
    }

    @Override
    public void onClick(View v) {

        FragmentTransaction transaction = getFragmentManager().beginTransaction();
        transaction.replace(R.id.main_frame, new AccountTypeFragment());
        transaction.commit();
    }
}
