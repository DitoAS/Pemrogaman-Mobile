package com.example.promob;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class menukls extends AppCompatActivity {

    private ImageView kls1;
    private ImageView kls2;
    private ImageView kls3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menukls);

        kls1 = findViewById(R.id.kls1);

        kls1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(menukls.this, MenuActivity.class));
            }
        });

        kls2 = findViewById(R.id.kls2);

        kls2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(menukls.this, kls2.class));
            }
        });

        kls3 = findViewById(R.id.kls3);

        kls3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(menukls.this, kls3.class));
            }
        });
    }
}