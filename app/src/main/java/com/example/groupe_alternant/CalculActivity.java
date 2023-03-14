package com.example.groupe_alternant;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class CalculActivity extends AppCompatActivity {

    private Integer premierElement = 0;
    private Integer deuxiemeElement = 0;
    private TypeOperationEnum typeOperation;
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

    private String calcul = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calcul);
        boutonAdd = findViewById(R.id.button_add);
        boutonAdd.setOnClickListener(view -> ajouteSymbole(TypeOperationEnum.ADD));
        boutonMultiply = findViewById(R.id.button_multiply);
        boutonMultiply.setOnClickListener(view -> ajouteSymbole(TypeOperationEnum.MULTIPLY));

        boutonSubstract = findViewById(R.id.button_substract);
        boutonSubstract.setOnClickListener(view -> ajouteSymbole(TypeOperationEnum.SUBSTRACT));

        boutonDivide = findViewById(R.id.button_divide);
        boutonDivide.setOnClickListener(view -> ajouteSymbole(TypeOperationEnum.DIVIDE));


        bouton0 = findViewById(R.id.button_0);
        bouton0.setOnClickListener(view -> ajouteUnChiffre(0));

        bouton1 = findViewById(R.id.button_1);
        bouton1.setOnClickListener(view -> ajouteUnChiffre(1));

        bouton2 = findViewById(R.id.button_2);
        bouton2.setOnClickListener(view -> ajouteUnChiffre(2));

        bouton3 = findViewById(R.id.button_3);
        bouton3.setOnClickListener(view -> ajouteUnChiffre(3));

        bouton4 = findViewById(R.id.button_4);
        bouton4.setOnClickListener(view -> ajouteUnChiffre(4));

        bouton5 = findViewById(R.id.button_5);
        bouton5.setOnClickListener(view -> ajouteUnChiffre(5));

        bouton6 = findViewById(R.id.button_6);
        bouton6.setOnClickListener(view -> ajouteUnChiffre(6));

        bouton7 = findViewById(R.id.button_7);
        bouton7.setOnClickListener(view -> ajouteUnChiffre(7));

        bouton8 = findViewById(R.id.button_8);
        bouton8.setOnClickListener(view -> ajouteUnChiffre(8));

        bouton9 = findViewById(R.id.button_9);
        bouton9.setOnClickListener(view -> ajouteUnChiffre(9));


        textViewCalcul = findViewById(R.id.textViewCalcul);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.toolbar, menu);
        MenuItem menuItem = menu.findItem(R.id.toolbar_nettoyer);
        menuItem.setOnMenuItemClickListener(view -> videLaTextView()

        );
        MenuItem boutonCalcul = menu.findItem(R.id.toolbar_calcul);
        boutonCalcul.setOnMenuItemClickListener(view -> faisLeCalcul());
        return super.onCreateOptionsMenu(menu);
    }

    private boolean faisLeCalcul() {
        Integer resultat=0;
        switch (typeOperation) {
            case ADD:
                resultat = premierElement+deuxiemeElement;
                break;
            case SUBSTRACT:
                resultat = premierElement- deuxiemeElement;
                break;
            case MULTIPLY:
                resultat = premierElement*deuxiemeElement;
                break;
            case DIVIDE:
                resultat = premierElement/deuxiemeElement;
                break;
        }
        Intent intent = new Intent(this,ResultatActivity.class);
        intent.putExtra("PREMIER_ELEMENT", premierElement);
        intent.putExtra("DEUXIEME_ELEMENT",deuxiemeElement);
        intent.putExtra("RESULTAT",resultat);
        intent.putExtra("SYMBOL", typeOperation.getSymbol());
        startActivity(intent);
        return true;
    }

    private boolean videLaTextView() {
        calcul = "";
        premierElement = 0;
        deuxiemeElement = 0;
        typeOperation = null;
        textViewCalcul.setText("");
        return true;
    }

    private void ajouteUnChiffre(Integer chiffreAAjouter) {
        if (typeOperation == null) {
            if (10 * premierElement < 9999) {
                premierElement = 10 * premierElement + chiffreAAjouter;
            } else {
                Toast.makeText(this, getString(R.string.ERROR_VALUE_TOO_HIGH), Toast.LENGTH_LONG).show();
            }
        } else {
            if (10 * deuxiemeElement < 9999) {
                deuxiemeElement = 10 * deuxiemeElement + chiffreAAjouter;
            } else {
                Toast.makeText(this, getString(R.string.ERROR_VALUE_TOO_HIGH), Toast.LENGTH_LONG).show();
            }
        }
        majTextView();
    }

    private void ajouteSymbole(TypeOperationEnum typeOperation) {
        if (this.typeOperation == null) {
            this.typeOperation = typeOperation;
        } else {
            Toast.makeText(this, getString(R.string.ERROR_TYPE_OPERATION), Toast.LENGTH_LONG).show();
        }
        majTextView();
    }

    private void majTextView() {
        if (typeOperation == null) {
            textViewCalcul.setText("" + premierElement);
        } else {
            textViewCalcul.setText(premierElement + typeOperation.getSymbol() + deuxiemeElement);
        }
    }
}