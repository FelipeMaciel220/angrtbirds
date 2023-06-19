package com.example.angrybirds;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Personagens extends AppCompatActivity {

    Button voltarper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_personagens);

        voltarper= findViewById (R.id.voltarper);
        voltarper.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent MainActivity = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(MainActivity);}
        });
    }
}