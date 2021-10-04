package com.example.promob;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



    }

    public void onBtnClick (View view) {
        TextView textHello = findViewById(R.id.teks);
        EditText edtTxtName = findViewById(R.id.edtTxtName);
        textHello.setText("Selamat Datang " + edtTxtName.getText().toString());
    }

}