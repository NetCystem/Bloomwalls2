package com.example.macbook.bloomwalls.Fragments;



import android.app.Fragment;
import android.app.FragmentTransaction;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
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
public class CreateAccountFragment extends Fragment implements View.OnClickListener {

    private ImageView createAccountBloomwallsIcon;
    private TextView createAccountTxt1, createAccountTxt2, createAccountLoginLink;
    private Button createAccountButton;
    private String createAccountLoginString, createAccountLoginAllString;



    public CreateAccountFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.layout_create_account_fragment, container, false);
        final Context context = getActivity();

        createAccountLoginString = getString(R.string.login_link);
        createAccountLoginAllString = getString(R.string.acount_availibility, createAccountLoginString);
        SpannableStringBuilder createAccountStringBuilder = new SpannableStringBuilder(createAccountLoginAllString);




        createAccountBloomwallsIcon = view.findViewById(R.id.create_account_bloomwalls_icon);
        createAccountTxt1 = view.findViewById(R.id.create_account_txt1);
        createAccountTxt1.setTypeface(Fonts.getTpfRegular(context));
        createAccountTxt2 = view.findViewById(R.id.create_account_txt2);
        createAccountTxt2.setTypeface(Fonts.getTpfRegular(context));
        createAccountLoginLink = view.findViewById(R.id.create_account_login_link);
        createAccountButton = view.findViewById(R.id.create_account_btn);
        createAccountButton.setTypeface(Fonts.getTpfBold(context));
        createAccountButton.setOnClickListener(this);

        ClickableSpan createAccountClickableSpan = new ClickableSpan() {
            @Override
            public void onClick(View widget) {
                Toast.makeText(context, "Your toast message",
                        Toast.LENGTH_LONG).show();

            }
        };

        createAccountStringBuilder.setSpan(createAccountClickableSpan, 25, 30, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
        createAccountStringBuilder.setSpan(new ForegroundColorSpan(getResources().getColor(R.color.bloomWhite)), 25, 30, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
        createAccountStringBuilder.setSpan(new StyleSpan(BOLD), 25, 30, Spannable.SPAN_INCLUSIVE_INCLUSIVE);
        createAccountLoginLink.setText(createAccountStringBuilder, TextView.BufferType.SPANNABLE);
        createAccountLoginLink.setTypeface(Fonts.getTpfRegular(context));
        createAccountLoginLink.setMovementMethod(LinkMovementMethod.getInstance());
        return view;
    }

    @Override
    public void onClick(View v) {


        Transact(new CollabTypeFragment());

    }

    public  void Transact(Fragment fragment) {

        FragmentTransaction transaction = getFragmentManager().beginTransaction();
        transaction.add(R.id.main_frame, fragment);
        transaction.commit();
    }
}
