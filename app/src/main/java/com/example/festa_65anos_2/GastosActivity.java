package com.example.festa_65anos_2;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class GastosActivity extends AppCompatActivity {
    double total = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gastos);

        EditText edtValor = findViewById(R.id.edtValor);
        Button btnAdd = findViewById(R.id.btnAddGasto);
        TextView txtTotal = findViewById(R.id.txtTotal);

        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double valor = Double.parseDouble(edtValor.getText().toString());
                total += valor;
                txtTotal.setText("Total: R$ " + total);
                edtValor.setText("");
            }
        });
    }
}
