package com.example.myapplication;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

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

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater Inflater= getMenuInflater();
        Inflater.inflate(R.menu.optionmenu, menu);
        return true;

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId()==R.id.t3){
            startActivity(new Intent(this, menu1.class));
        }
        else if (item.getItemId()==R.id.menu2) {
            startActivity(new Intent(this, menu2.class));
        } else if (item.getItemId()==R.id.menu3) {
            startActivity(new Intent(this, menu3.class));
        }


        return true;
    }

    public void pindah(View view) {
        Intent intent = new Intent(MainActivity.this, menu3.class);
        startActivity(intent);
    }
}