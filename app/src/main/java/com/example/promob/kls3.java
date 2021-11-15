package com.example.promob;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class kls3 extends AppCompatActivity {

    private ImageView btnback;
    private ImageView btnmtr1;
    private ImageView btnmtr2;
    private ImageView btnmtr3;
    private ImageView btnmtr4;
    private Button btnqz;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kls3);

        btnback = findViewById(R.id.btnback);

        btnback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(kls3.this, menukls.class));
            }
        });

        btnmtr1 = findViewById(R.id.btnmtr1);

        btnmtr1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(kls3.this, materi3_1.class));
            }
        });

        btnmtr2 = findViewById(R.id.btnmtr2);

        btnmtr2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(kls3.this, materi3_2.class));
            }
        });

        btnmtr3 = findViewById(R.id.btnmtr3);

        btnmtr3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(kls3.this, materi3_3.class));
            }
        });

        btnmtr4 = findViewById(R.id.btnmtr4);

        btnmtr4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(kls3.this, materi3_4.class));
            }
        });

        btnqz = findViewById(R.id.btnqz);

        btnqz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(kls3.this, quiz3.class));
            }
        });

    }
}