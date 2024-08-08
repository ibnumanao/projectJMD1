package com.example.projek;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;

public class MenuUtama extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_utama);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater Inflater= getMenuInflater();
        Inflater.inflate(R.menu.optionmenu, menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId()==R.id.setting){
            startActivity(new Intent(this, MSetting.class));
        }
        else if (item.getItemId()==R.id.about) {
            startActivity(new Intent(this, MAbout.class));
        } else if (item.getItemId()==R.id.contact) {
            startActivity(new Intent(this, MContact.class));
        }


        return true;
    }
    public void tkalkulator(View view) {
        Intent intent = new Intent(MenuUtama.this, kalkulator.class);
        startActivity(intent);
    }
    public void tgaleri(View view) {
        Intent intent = new Intent(MenuUtama.this, galeri.class);
        startActivity(intent);
    }
    public void tcatatan(View view) {
        Intent intent = new Intent(MenuUtama.this, catatan.class);
        startActivity(intent);
    }
}