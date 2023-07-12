package com.example.swapapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    public void onswap(View v)
    {
        EditText e1,e2,temp;
        e1 =(EditText)findViewById(R.id.et1);
        e2 =(EditText)findViewById(R.id.et2);
        String str = e1.getText().toString();
        String str1 = e2.getText().toString();
        temp=e1;
        e1=e2;
        e2=temp;

        e1.setText(str);
        e2.setText(str1);

    }
}