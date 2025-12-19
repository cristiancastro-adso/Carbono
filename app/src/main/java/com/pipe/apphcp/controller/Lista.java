package com.pipe.apphcp.controller;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ListView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.pipe.apphcp.R;
import com.pipe.apphcp.model.Manager;

import java.util.List;

public class Lista extends AppCompatActivity {

    ImageButton btnhome;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista);

        btnhome=findViewById(R.id.btnhome);

        btnhome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Lista.this, Principal.class);
                startActivity(intent);
            }
        });

        ListView listView = findViewById(R.id.lista);

        Manager manager = new Manager(this);
        List<String> datos = manager.getActividadesTexto();

        ArrayAdapter<String> adapter =
                new ArrayAdapter<>(this,
                        android.R.layout.simple_list_item_1,
                        datos);

        listView.setAdapter(adapter);
    }



}