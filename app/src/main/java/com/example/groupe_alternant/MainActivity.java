package com.example.groupe_alternant;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button boutonCalcul;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        boutonCalcul = findViewById(R.id.boutonCalcul);
        boutonCalcul.setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity.this,CalculActivity.class);
            startActivity(intent);
        });


    }
}