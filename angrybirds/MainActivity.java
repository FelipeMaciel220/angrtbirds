package com.example.angrybirds;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

        Button btnhistoria;
        Button btnpersonagens;
        Button btncuriosidades;
        Button btncreditos;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnhistoria = findViewById (R.id.btnhistoria);
        btnhistoria.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent historia = new Intent(getApplicationContext(), historia.class);
                startActivity(historia);
            }

        });

            btnpersonagens = findViewById (R.id.btnpersonagens);
        btnpersonagens.setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View view) {
                    Intent Personagens = new Intent(getApplicationContext(), Personagens.class);
                    startActivity(Personagens);
                }


            });

        btncuriosidades = findViewById (R.id.btncuriosidades);
        btncuriosidades.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent curiosidades = new Intent(getApplicationContext(), curiosidades.class);
                startActivity(curiosidades);
            }


        });

        btncreditos  = findViewById (R.id.btncreditos );
        btncreditos .setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent creditos  = new Intent(getApplicationContext(), creditos .class);
                startActivity(creditos );
            }


        });


    }
}