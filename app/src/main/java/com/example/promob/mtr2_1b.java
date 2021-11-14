package com.example.promob;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class mtr2_1b extends AppCompatActivity {

    private ImageView btnbck;
    private Button btnprv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mtr21b);

        btnbck = findViewById(R.id.btnbck);

        btnbck.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(mtr2_1b.this,kls2.class));
            }
        });

        btnprv = findViewById(R.id.btnprv);

        btnprv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(mtr2_1b.this, mtr2_1.class));
            }
        });


    }
}