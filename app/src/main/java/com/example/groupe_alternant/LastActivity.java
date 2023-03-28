package com.example.groupe_alternant;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.example.groupe_alternant.database.CalculBaseHelper;
import com.example.groupe_alternant.database.CalculDao;
import com.example.groupe_alternant.entities.Calcul;

public class LastActivity extends AppCompatActivity {
    private CalculDao calculDao;

    private TextView textViewBDD;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_last);
        calculDao = new CalculDao(new CalculBaseHelper(this,"BDD",1));
        Calcul monCalcul = calculDao.lastOrNull();
        textViewBDD = findViewById(R.id.textViewBDD);
        if(monCalcul!=null){
            textViewBDD.setText(monCalcul.getPremierElement()
                    + monCalcul.getSymbol()
                    +monCalcul.getDeuxiemeElement()
                    + " = "
                    +monCalcul.getResultat());
        }
    }
}