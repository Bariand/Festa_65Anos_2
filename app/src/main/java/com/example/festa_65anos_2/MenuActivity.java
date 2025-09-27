package com.example.festa_65anos_2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

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

        RecyclerView rv = findViewById(R.id.recyclerViewPhotos);
        PhotoAdapter adapter = new PhotoAdapter(
                new int[]{R.drawable.photo1, R.drawable.photo2, R.drawable.photo3},
                this
        );
        rv.setLayoutManager(new LinearLayoutManager(this));
        rv.setAdapter(adapter);

// Endereço
        TextView tvAddress = findViewById(R.id.tvAddress);
        tvAddress.setText("Local da festa:\nPraça Cel. Pedro Osório - Centro - Pelotas/RS");

        Button btnOpenMap = findViewById(R.id.btnOpenMap);
        btnOpenMap.setOnClickListener(v -> {
            double LATITUDE = -31.7693630;
            double LONGITUDE = -52.3404393;
            String label = "Festa 65 anos";
            String uriString = String.format(
                    java.util.Locale.getDefault(),
                    "geo:%f,%f?q=%f,%f(%s)",
                    LATITUDE, LONGITUDE, LATITUDE, LONGITUDE,
                    Uri.encode(label)
            );
            Uri gmmIntentUri = Uri.parse(uriString);
            Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
            mapIntent.setPackage("com.google.android.apps.maps");

            if (mapIntent.resolveActivity(getPackageManager()) != null) {
                startActivity(mapIntent);
            } else {
                String browserUrl = "https://www.google.com/maps/search/?api=1&query=" + LATITUDE + "," + LONGITUDE;
                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(browserUrl));
                startActivity(browserIntent);
            }
        });

    }
}
