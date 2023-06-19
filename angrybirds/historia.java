package com.example.angrybirds;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class historia extends AppCompatActivity {
    Button voltarhist;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_historia);

        voltarhist= findViewById (R.id.voltarhist);
        voltarhist.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent MainActivity = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(MainActivity);}
        });
    }
}