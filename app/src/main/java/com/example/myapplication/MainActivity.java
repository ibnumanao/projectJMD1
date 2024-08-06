package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button bproses;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bproses = (Button) findViewById(R.id.btnok);
        bproses.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                bproses.setBackgroundColor(Color.RED);
                Toast.makeText(MainActivity.this, "Tombol jadi Merah", Toast.LENGTH_SHORT).show();
            }
        });
    }
}