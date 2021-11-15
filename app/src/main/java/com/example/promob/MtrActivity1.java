package com.example.promob;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MtrActivity1 extends AppCompatActivity {

    private ImageView btnback2mn;
    private Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mtr1);

        btnback2mn = findViewById(R.id.btnback2mn);

        btnback2mn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MtrActivity1.this,MenuActivity.class));
            }
        });


    }
}