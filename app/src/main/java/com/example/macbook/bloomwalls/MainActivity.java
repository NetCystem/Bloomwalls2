package com.example.macbook.bloomwalls;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
     private ImageView bloomwallsIcon;
     private TextView txt1;
     private TextView txt2;
     private TextView txt3;
     private Button createAccountButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bloomwallsIcon = findViewById(R.id.bloomwalls_icon);
        txt1 = findViewById(R.id.txt1);
        txt2 = findViewById(R.id.txt2);
        txt3 = findViewById(R.id.txt3);
        createAccountButton = findViewById(R.id.create_account_btn);
        createAccountButton.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        startActivity(new Intent(MainActivity.this, SignupActivity.class));

    }
}
