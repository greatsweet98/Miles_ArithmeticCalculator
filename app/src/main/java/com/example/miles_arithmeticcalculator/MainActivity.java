package com.example.miles_arithmeticcalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView result;
    private TextView string;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        int MyNumber = 69;
        int MyNumber2 = 21;
        int sum;
        String name = "calculator";

        result = findViewById(result.getId());
        string = findViewById(string.getId());

        sum = MyNumber + MyNumber2;

        result.setText("x is"+MyNumber+"\ny is"+MyNumber2+"\nx + y is"+sum);
        string.setText("I'm a"+name);

    }
}