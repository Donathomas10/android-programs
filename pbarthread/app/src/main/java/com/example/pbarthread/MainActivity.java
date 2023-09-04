package com.example.pbarthread;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity  implements Runnable{
ProgressBar pb1,pb2;
int pv = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        pb1=(ProgressBar) findViewById(R.id.pb1);
        pb2=(ProgressBar) findViewById(R.id.pb2);
        pb1.setMax(100);
        pb2.setMax(100);
        pb1.setProgress(0);
        pb2.setProgress(0);
        pb2.setEnabled(false);
    }

    public void onb1(View view) {
        if(pv==100)
            pv=0;
        pv += 10;
        pb1.setProgress(pv);
    }



    @Override
    public void run() {
        try {
            while (pv <= 100) {
                Thread.sleep(200);
                pv += 10;
                pb1.setProgress(pv);
                pb2.setProgress(pv);
            }
            pb2.setEnabled(false);

        } catch (Exception e) {
            System.out.println(e);
        }
    }
    public void onb2(View view) {
        pv =0;
        pb2.setEnabled(true);
        Thread t;
        t =new Thread(this);
        t.start();
    }
}
