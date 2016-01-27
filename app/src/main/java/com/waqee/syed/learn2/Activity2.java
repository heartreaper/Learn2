package com.waqee.syed.learn2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class Activity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_learn2_2);
        Log.d("Syed", "Inside Activity 2");
        Log.d("Syed", "Activity 2 onCreate");
    }
}
