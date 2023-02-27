package com.example.groupe_alternant;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class CalculActivity extends AppCompatActivity {
    private Button boutonAdd;
    private Button boutonSubstract;
    private Button boutonDivide;
    private Button boutonMultiply;
    private Button bouton0;
    private Button bouton1;
    private Button bouton2;
    private Button bouton3;
    private Button bouton4;
    private Button bouton5;
    private Button bouton6;
    private Button bouton7;
    private Button bouton8;
    private Button bouton9;

    private TextView textViewCalcul;

    private String calcul="";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calcul);
        boutonAdd = findViewById(R.id.button_add);
        boutonAdd.setOnClickListener(view -> ajouterUnCharactere(getString(R.string.bouton_add)));
        boutonMultiply = findViewById(R.id.button_multiply);
        boutonMultiply.setOnClickListener(view -> ajouterUnCharactere(getString(R.string.bouton_multiply)));

        boutonSubstract = findViewById(R.id.button_substract);
        boutonSubstract.setOnClickListener(view -> ajouterUnCharactere(getString(R.string.bouton_substract)));

        boutonDivide = findViewById(R.id.button_divide);
        boutonDivide.setOnClickListener(view -> ajouterUnCharactere(getString(R.string.bouton_divide)));


        bouton0 = findViewById(R.id.button_0);
        bouton0.setOnClickListener(view -> ajouterUnCharactere(getString(R.string.bouton_0)));

        bouton1 = findViewById(R.id.button_1);
        bouton1.setOnClickListener(view -> ajouterUnCharactere(getString(R.string.bouton_1)));

        bouton2 = findViewById(R.id.button_2);
        bouton2.setOnClickListener(view -> ajouterUnCharactere(getString(R.string.bouton_2)));

        bouton3 = findViewById(R.id.button_3);
        bouton3.setOnClickListener(view -> ajouterUnCharactere(getString(R.string.bouton_3)));

        bouton4 = findViewById(R.id.button_4);
        bouton4.setOnClickListener(view -> ajouterUnCharactere(getString(R.string.bouton_4)));

        bouton5 = findViewById(R.id.button_5);
        bouton5.setOnClickListener(view -> ajouterUnCharactere(getString(R.string.bouton_5)));

        bouton6 = findViewById(R.id.button_6);
        bouton6.setOnClickListener(view -> ajouterUnCharactere(getString(R.string.bouton_6)));

        bouton7 = findViewById(R.id.button_7);
        bouton7.setOnClickListener(view -> ajouterUnCharactere(getString(R.string.bouton_7)));

        bouton8 = findViewById(R.id.button_8);
        bouton8.setOnClickListener(view -> ajouterUnCharactere(getString(R.string.bouton_8)));

        bouton9 = findViewById(R.id.button_9);
        bouton9.setOnClickListener(view -> ajouterUnCharactere(getString(R.string.bouton_9)));


        textViewCalcul = findViewById(R.id.textViewCalcul);
    }

    private void ajouterUnCharactere(String stringAAjouter) {
        calcul += stringAAjouter;
        textViewCalcul.setText(calcul);
    }
}