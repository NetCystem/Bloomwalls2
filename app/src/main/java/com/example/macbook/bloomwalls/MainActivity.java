package com.example.macbook.bloomwalls;



import android.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.macbook.bloomwalls.Fragments.CreateAccountFragment;



public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FragmentTransaction transaction = getFragmentManager().beginTransaction();
        transaction.add(R.id.main_activity, new CreateAccountFragment() );
        transaction.commit();



    }
}

