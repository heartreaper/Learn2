package com.waqee.syed.learn2;

import android.content.res.Configuration;
import android.os.PersistableBundle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;


public class Learn2 extends AppCompatActivity {
   /* Button b;*/
    public int counter = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_learn2);
        Log.d("Syed", "onCreate");
        /*b=(Button) findViewById(R.id.bt1);*/
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("Syed", "onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        counter++;
        Log.d("Syed", "onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("Syed", "onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("Syed", "onStop");
    }

    @Override
    protected void onRestart() {
        super.onRestart();Log.d("Syed", "onRestart");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("Syed", "onDestroy");
    }

    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
        if (newConfig.orientation==Configuration.ORIENTATION_PORTRAIT){
            Log.d("Syed", "Portrait");
        }
        else if (newConfig.orientation==Configuration.ORIENTATION_LANDSCAPE){
            Log.d("Syed", "Landscape");
        }
    }

    public void btOnclick(View v){
        /*if (v.getId()==R.id.bt1){*/
        Log.d("Syed", "Button Clicked"); /*}*/
    }

   /* public void etclicked(View v){
        if (v.getId()== R.id.et1){
            Log.d("Syed", "et1 clicked");
        }
        else if (v.getId()== R.id.et2){
            Log.d("Syed", "et2 clicked");
        }
    }*/

    @Override
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putInt("counter", counter);
        Log.d("Syed", "onSaveInstanceState & counter value is " + counter);
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        counter = savedInstanceState.getInt("counter");
        Log.d("Syed", "onRestoreInstanceState & counter was restored");

    }
}