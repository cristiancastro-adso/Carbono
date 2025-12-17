package com.pipe.apphcp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Principal extends AppCompatActivity {

    LinearLayout lyRegistrar,lyLista,lyResumen;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);

        lyRegistrar=findViewById(R.id.lyRegistrar);
        lyLista=findViewById(R.id.lyLista);
        lyResumen=findViewById(R.id.lyResumen);

        lyRegistrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Principal.this, RegistroActividad.class);
                startActivity(intent);
            }
        });
    }
}