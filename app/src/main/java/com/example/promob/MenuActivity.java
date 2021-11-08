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
    private Button btnmtr1;
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

        btnback = findViewById(R.id.btnback);

        btnback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MenuActivity.this, MainActivity.class));
            }
        });

        btnqz = findViewById(R.id.btnqz);

        btnqz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MenuActivity.this, quiz.class));
            }
        });
    }
}