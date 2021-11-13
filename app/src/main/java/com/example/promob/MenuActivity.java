package com.example.promob;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MenuActivity extends AppCompatActivity {

    private ImageView btnback;
    private ImageView btnmtr1;
    private ImageView btnmtr2;
    private ImageView btnmtr3;
    private ImageView btnmtr4;
    private ImageView btnmtr5;

    private Button btnqz;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        btnmtr1 = findViewById(R.id.btnmtr1);

        btnmtr1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent GoTo = new Intent(MenuActivity.this,MtrActivity1.class);
                startActivity(GoTo);
            }
        });

        btnmtr2 = findViewById(R.id.btnmtr2);

        btnmtr2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent GoTo = new Intent(MenuActivity.this,materi2.class);
                startActivity(GoTo);
            }
        });

        btnmtr3 = findViewById(R.id.btnmtr3);

        btnmtr3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent GoTo = new Intent(MenuActivity.this,materi3.class);
                startActivity(GoTo);
            }
        });

        btnmtr4 = findViewById(R.id.btnmtr4);

        btnmtr4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent GoTo = new Intent(MenuActivity.this,materi4.class);
                startActivity(GoTo);
            }
        });

        btnmtr5 = findViewById(R.id.btnmtr5);

        btnmtr5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent GoTo = new Intent(MenuActivity.this,materi5.class);
                startActivity(GoTo);
            }
        });


        btnqz = findViewById(R.id.btnqz);

        btnqz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MenuActivity.this, quiz.class));
            }
        });

        btnback = findViewById(R.id.btnback);

        btnback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MenuActivity.this, menukls.class));
            }
        });
    }
}