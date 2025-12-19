package com.pipe.apphcp.controller;

import android.content.Intent;
import android.net.wifi.hotspot2.pps.HomeSp;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;

import com.pipe.apphcp.R;

public class Principal extends AppCompatActivity {

    LinearLayout lyRegistrar,lyLista,lyResumen;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);

        lyRegistrar=findViewById(R.id.lyRegistrar);
        lyLista=findViewById(R.id.lyLista);


        lyRegistrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Principal.this, RegistroActividad.class);
                startActivity(intent);
            }
        });

        lyLista.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Principal.this, Lista.class);
                startActivity(intent);
            }
        });
    }
}