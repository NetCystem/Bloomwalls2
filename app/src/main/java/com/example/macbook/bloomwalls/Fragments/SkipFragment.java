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

/**
 * A simple {@link Fragment} subclass.
 */
public class SkipFragment extends Fragment implements View.OnClickListener {

    private ImageView skipBloomwallsIcon;
    private TextView skipTxt1;
    private TextView skipTxt2;
    private TextView skipTxt3;
    private Button skipButton;


    public SkipFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.layout_skip_fragment, container, false);
        final Context context = getActivity();

        String loginLink = getString(R.string.login_link);
        String allString = getString(R.string.acount_availibility, loginLink);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(allString);
        final StyleSpan bolding = new StyleSpan(android.graphics.Typeface.BOLD);

        skipBloomwallsIcon = view.findViewById(R.id.skip_bloomwalls_icon);
        skipTxt1 = view.findViewById(R.id.skip_txt1);
        skipTxt1.setTypeface(Fonts.getTpfRegular(context));
        skipTxt2 = view.findViewById(R.id.skip_txt2);
        skipTxt2.setTypeface(Fonts.getTpfRegular(context));
        skipTxt3 = view.findViewById(R.id.skip_txt3);
        skipButton = view.findViewById(R.id.skip_btn);
        skipButton.setOnClickListener(this);

        ClickableSpan clickableSpan = new ClickableSpan() {
            @Override
            public void onClick(View widget) {
                Toast.makeText(context, "Your toast message",
                        Toast.LENGTH_LONG).show();

            }
        };

        spannableStringBuilder.setSpan(clickableSpan, 25, 30, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
        spannableStringBuilder.setSpan(new ForegroundColorSpan(getResources().getColor(R.color.bloomWhite)), 25, 30, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
        spannableStringBuilder.setSpan(bolding, 25, 30, Spannable.SPAN_INCLUSIVE_INCLUSIVE);
        skipTxt3.setText(spannableStringBuilder, TextView.BufferType.SPANNABLE);
        skipTxt3.setTypeface(Fonts.getTpfRegular(context));
        skipTxt3.setMovementMethod(LinkMovementMethod.getInstance());

        return view;
    }

    @Override
    public void onClick(View v) {

        FragmentTransaction transaction = getFragmentManager().beginTransaction();
        transaction.replace(R.id.main_activity, new AccountTypeFragment());
        transaction.commit();
    }
}
