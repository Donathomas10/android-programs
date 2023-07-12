package com.example.alcapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.util.LogPrinter;

import java.security.PublicKey;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("alcapp","OnCreate()");
    }
    @Override
    public void onStart()
    {
        super.onStart();
        Log.d("alcapp","OnStart()");
    }
    @Override
    public void onStop()
    {
        super.onStop();
        Log.d("alcapp","OnStop()");
    }
    @Override
    public void onDestroy()
    {
        super.onDestroy();
        Log.d("alcapp","OnDestroy()");
    }
    @Override
    public void onResume()
    {
        super.onResume();
        Log.d("alcapp","OnResume()");
    }
    @Override
    public void onPause()
    {
        super.onPause();
        Log.d("alcapp","onPause()");
    }
}