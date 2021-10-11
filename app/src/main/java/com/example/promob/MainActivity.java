package com.example.promob;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button  btnpindah;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnpindah = findViewById(R.id.btnpindah);

        btnpindah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pindah = new Intent(MainActivity.this, MenuActivity.class);
                startActivity(pindah);
            }
        });

    }

    public void onBtnClick (View view) {
        TextView textHello = findViewById(R.id.teks);
        EditText edtTxtName = findViewById(R.id.edtTxtName);
        textHello.setText("Selamat Datang " + edtTxtName.getText().toString());
    }

}