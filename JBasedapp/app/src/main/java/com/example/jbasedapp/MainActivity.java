package com.example.jbasedapp;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button bpress,bcancel;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        bpress = new Button(this);
        bpress.setText("press me !");
        bcancel = new Button(this);
        bcancel.setText("cancel me !");
        LinearLayout lWindow = new LinearLayout(this);
        lWindow.setOrientation(LinearLayout.VERTICAL);
        lWindow.addView(bpress);
        lWindow.addView(bcancel);
        bpress.setOnClickListener(new View.OnClickListener() {
                                      @Override
                                      public void onClick(View view) {
                                          Toast.makeText(getApplicationContext(),"welcome To Android programming", Toast.LENGTH_SHORT).show();
                                      }
                                  });
        bcancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
                setContentView(lWindow);
    }
}