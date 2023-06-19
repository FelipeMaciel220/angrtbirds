package com.example.angrybirds;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class creditos extends AppCompatActivity {

    Button voltarcre;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_creditos);

        voltarcre= findViewById (R.id.voltarcre);
        voltarcre.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent MainActivity = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(MainActivity);
            }


        });
    }
}