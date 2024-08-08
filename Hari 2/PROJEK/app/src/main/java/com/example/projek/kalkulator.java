package com.example.projek;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class kalkulator extends AppCompatActivity {
    EditText angka1, angka2;
    Button btntambah, btnkurang, btnkali, btnbagi, btnbersih;
    TextView hasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kalkulator);

        angka1 = findViewById(R.id.angka1);
        angka2 = findViewById(R.id.angka2);
        btntambah = findViewById(R.id.btntambah);
        btnkurang = findViewById(R.id.btnkurang);
        btnkali = findViewById(R.id.btnkali);
        btnbagi  = findViewById(R.id.btnbagi);
        btnbersih = findViewById(R.id.btnbersih);
        hasil = findViewById(R.id.hasil);
        btntambah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if ((angka1.getText().length()>0) && (angka2.getText().length()>0)){
                    double angka11 = Double.parseDouble(angka1.getText().toString());
                    double angka22 = Double.parseDouble(angka2.getText().toString());
                    double  result = angka11 + angka22;
                    hasil.setText(Double.toString(result));
                    //double untuk tipe data yang hasilnya bentuk desimal yang lengkap (contoh = 1.12323424)m
                    //float adalah saudara double yang hasilnya bentuk desimal yang lebih sedikit (contoh = 1.11)
                }
                else {
                    Toast toast = Toast.makeText(kalkulator.this, "Mohon Masukkan Angka Pertama dan Kedua", Toast.LENGTH_LONG);
                    toast.show();
                }

            }
        });
        btnkurang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if ((angka1.getText().length()>0) && (angka2.getText().length()>0)){
                    double angka11 = Double.parseDouble(angka1.getText().toString());
                    double angka22 = Double.parseDouble(angka2.getText().toString());
                    double  result = angka11 - angka22;
                    hasil.setText(Double.toString(result));

                }
                else {
                    Toast toast = Toast.makeText(kalkulator.this, "Mohon Masukkan Angka Pertama dan Kedua", Toast.LENGTH_LONG);
                    toast.show();
                }

            }
        });
        btnkali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if ((angka1.getText().length()>0) && (angka2.getText().length()>0)){
                    double angka11 = Double.parseDouble(angka1.getText().toString());
                    double angka22 = Double.parseDouble(angka2.getText().toString());
                    double  result = angka11 * angka22;
                    hasil.setText(Double.toString(result));

                }
                else {
                    Toast toast = Toast.makeText(kalkulator.this, "Mohon Masukkan Angka Pertama dan Kedua", Toast.LENGTH_LONG);
                    toast.show();
                }

            }
        });
        btnbagi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if ((angka1.getText().length()>0) && (angka2.getText().length()>0)){
                    double angka11 = Double.parseDouble(angka1.getText().toString());
                    double angka22 = Double.parseDouble(angka2.getText().toString());
                    double  result = angka11 / angka22;
                    hasil.setText(Double.toString(result));

                }
                else {
                    Toast toast = Toast.makeText(kalkulator.this, "Mohon Masukkan Angka Pertama dan Kedua", Toast.LENGTH_LONG);
                    toast.show();
                }

            }
        });
        btnbersih.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                angka1.setText("");
                angka2.setText("");
                hasil.setText("0");
                angka1.requestFocus();

            }
        });
}}