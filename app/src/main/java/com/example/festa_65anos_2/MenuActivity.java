package com.example.festa_65anos_2;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MenuActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        Button btnConvidados = findViewById(R.id.btnConvidados);
        Button btnGastos = findViewById(R.id.btnGastos);
        Button btnComesBebes = findViewById(R.id.btnComesBebes);

        btnConvidados.setOnClickListener(v -> startActivity(new Intent(this, ConvidadosActivity.class)));
        btnGastos.setOnClickListener(v -> startActivity(new Intent(this, GastosActivity.class)));
        btnComesBebes.setOnClickListener(v -> startActivity(new Intent(this, ComesBebesActivity.class)));
    }
}
