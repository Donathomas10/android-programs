package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText operand1EditText, operand2EditText;
    private Button addButton, subtractButton;
    private TextView resultTextView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        operand1EditText = findViewById(R.id.et1);
        operand2EditText = findViewById(R.id.et2);
        addButton = findViewById(R.id.adButton);
        subtractButton = findViewById(R.id.sbButton);
        resultTextView = findViewById(R.id.result);

        addButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int operand1 = Integer.parseInt(operand1EditText.getText().toString());
                int operand2 = Integer.parseInt(operand2EditText.getText().toString());
                int result = operand1 + operand2;
                resultTextView.setText(String.valueOf(result));
            }
        });

        subtractButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int operand1 = Integer.parseInt(operand1EditText.getText().toString());
                int operand2 = Integer.parseInt(operand2EditText.getText().toString());
                int result = operand1 - operand2;
                resultTextView.setText(String.valueOf(result));
            }
        });
    }
}



