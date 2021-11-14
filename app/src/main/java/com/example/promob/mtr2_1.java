package com.example.promob;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class mtr2_1 extends AppCompatActivity {

    private ImageView btnbck;
    private Button btnnxt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mtr21);

        btnbck = findViewById(R.id.btnbck);

        btnbck.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(mtr2_1.this,kls2.class));
            }
        });

        btnnxt = findViewById(R.id.btnnxt);

        btnnxt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(mtr2_1.this, mtr2_1b.class));
            }
        });
    }
}