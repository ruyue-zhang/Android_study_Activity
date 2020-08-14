package com.ruyue.activitypractice;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class lifeCycle extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_life_cycle);
        Log.d("lifeCycle", "-----------onCreate----------");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("lifeCycle", "-----------onStart----------");

    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("lifeCycle", "-----------onResume----------");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("lifeCycle", "-----------onPause----------");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("lifeCycle", "-----------onStop----------");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("lifeCycle", "-----------onRestart----------");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("lifeCycle", "-----------onDestroy----------");
    }
}