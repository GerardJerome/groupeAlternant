package com.example.groupe_alternant;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class ResultatActivity extends AppCompatActivity {

    private TextView textViewResultat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultat);
        Intent intent = getIntent();
        Integer premierElement = intent.getIntExtra("PREMIER_ELEMENT",0);
        Integer deuxiemeElement = intent.getIntExtra("DEUXIEME_ELEMENT",0);
        Integer resultat = intent.getIntExtra("RESULTAT",0);
        String symbol = intent.getStringExtra("SYMBOL");
        textViewResultat= findViewById(R.id.textViewResultat);
        textViewResultat.setText(premierElement + symbol+ deuxiemeElement+ " = "+resultat);


    }
}