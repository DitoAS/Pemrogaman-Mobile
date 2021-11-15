package com.example.promob;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class kls2 extends AppCompatActivity {

    private ImageView btnback;
    private ImageView btnmtr1;
    private ImageView btnmtr2;
    private ImageView btnmtr3;
    private Button btnqz;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kls2);

        btnback = findViewById(R.id.btnback);

        btnback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(kls2.this, menukls.class));
            }
        });

        btnmtr1 = findViewById(R.id.btnmtr1);

        btnmtr1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(kls2.this, mtr2_1.class));
            }
        });

        btnmtr2 = findViewById(R.id.btnmtr2);

        btnmtr2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(kls2.this, mtr2_2.class));
            }
        });

        btnmtr3 = findViewById(R.id.btnmtr3);

        btnmtr3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(kls2.this, mtr2_3.class));
            }
        });

        btnqz = findViewById(R.id.btnqz);

        btnqz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(kls2.this, quiz2.class));
            }
        });


    }
}