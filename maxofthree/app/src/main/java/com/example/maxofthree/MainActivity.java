package com.example.maxofthree;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText e1,e2,e3,e4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        e1=(EditText) findViewById(R.id.e1);
        e2=(EditText) findViewById(R.id.e2);
        e3=(EditText) findViewById(R.id.e3);
        e4=(EditText) findViewById(R.id.e4);

    }

    public void OnMax(View view) {
        int a,b,c,d;
        a=Integer.parseInt(e1.getText().toString());
        b=Integer.parseInt(e2.getText().toString());
        c=Integer.parseInt(e3.getText().toString());
        d = a > b ? a : b;
        d = d > c ? d : c;
        e4.setText("Max :" +d);

    }

    public void OnMin(View view) {
        int a,b,c,d;
        a=Integer.parseInt(e1.getText().toString());
        b=Integer.parseInt(e2.getText().toString());
        c=Integer.parseInt(e3.getText().toString());
        d = a < b ? a : b;
        d = d < c ? d : c;
        e4.setText("Min :" +d);

    }
}