package com.waqee.syed.learn2;

import android.content.Intent;
import android.content.res.Configuration;
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
    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
        if (newConfig.orientation==Configuration.ORIENTATION_PORTRAIT){
            Intent i = new Intent(this, Learn2.class);
            startActivity(i);
            Log.d("Syed", "Portrait + Activity 2 Opened");
        }
        else if (newConfig.orientation==Configuration.ORIENTATION_LANDSCAPE){
            Log.d("Syed", "Landscape");
        }
    }
}
