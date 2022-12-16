package com.example.factsapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView textView0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView0 = findViewById(R.id.textView1);


        String[] secondFactList = ListOfFacts.getFacts();
        for (String j : secondFactList) {
            textView0.append("> " + j + "\n\n");
        }
    }
}