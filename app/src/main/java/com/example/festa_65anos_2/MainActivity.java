package com.example.festa_65anos_2;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView nomeEvento = findViewById(R.id.txtEvento);
        TextView dataEvento = findViewById(R.id.txtData);
        Button btnMenu = findViewById(R.id.btnMenu);

        nomeEvento.setText("Aniversário da Maria");
        dataEvento.setText("10/12/2025");

        btnMenu.setOnClickListener(v -> {
            Intent i = new Intent(MainActivity.this, MenuActivity.class);
            startActivity(i);
        });
    }
}
