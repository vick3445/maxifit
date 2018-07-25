package com.example.balmermwongera.maxifit;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import appresources.cardio;

public class MainActivity extends AppCompatActivity {

    Button exercise, cardios;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        exercise = findViewById(R.id.men);
        exercise.setOnClickListener(new View.OnClickListener() {
            @SuppressWarnings("deprecation")
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, appresources.exercise.class);
                startActivity(i);
            }
        });
        cardios = findViewById(R.id.cardios);
        cardios.setOnClickListener(new View.OnClickListener() {
            @SuppressWarnings("deprecation")
            @Override
            public void onClick(View view) {
                Intent k = new Intent(MainActivity.this, cardio.class);
                startActivity(k);
            }
        });
    }
}
