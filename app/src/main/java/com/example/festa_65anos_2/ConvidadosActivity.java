package com.example.festa_65anos_2;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class ConvidadosActivity extends AppCompatActivity {
    String lista = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_convidados);

        EditText edtNome = findViewById(R.id.edtNome);
        Button btnAdd = findViewById(R.id.btnAdd);
        TextView txtLista = findViewById(R.id.txtLista);

        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                lista += edtNome.getText().toString() + "\n";
                txtLista.setText(lista);
                edtNome.setText("");
            }
        });
    }
}
