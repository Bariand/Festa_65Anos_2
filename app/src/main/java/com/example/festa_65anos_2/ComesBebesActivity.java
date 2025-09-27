package com.example.festa_65anos_2;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class ComesBebesActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_comes_bebes);

        EditText edtPessoas = findViewById(R.id.edtPessoas);
        Button btnCalc = findViewById(R.id.btnCalc);
        TextView txtResultado = findViewById(R.id.txtResultado);

        btnCalc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int pessoas = Integer.parseInt(edtPessoas.getText().toString());
                int salgados = pessoas * 10;
                int bebidas = pessoas * 2;
                txtResultado.setText("Salgados: " + salgados + "\nBebidas: " + bebidas + " copos");
            }
        });
    }
}
