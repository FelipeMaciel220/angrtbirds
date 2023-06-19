package com.example.angrybirds;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class curiosidades extends AppCompatActivity {
    Button voltarcuri;
    Button web;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_curiosidades);

        voltarcuri = findViewById(R.id.voltarcuri);
        voltarcuri.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent MainActivity = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(MainActivity);
            }
        });

        web = findViewById(R.id.web);
        web.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri web = Uri.parse("https://en.wikipedia.org/wiki/Angry_Birds_2");
                Intent it = new Intent(Intent.ACTION_VIEW, web);
                startActivity(it);
            }
        });
    }
}