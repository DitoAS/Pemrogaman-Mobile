package com.example.promob;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class kls3 extends AppCompatActivity {

    private ImageView btnback;
    private ImageView btnmtr1;
    private ImageView btnmtr2;
    private ImageView btnmtr3;
    private ImageView btnmtr4;

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

    }
}