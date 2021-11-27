package com.labnewcod.appbrigate;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setIcon(R.mipmap.ic_icon);

        Resources res = getResources();
        Drawable drawable = res.getDrawable(R.drawable.logoapp, getTheme());

        ImageView imageViewLogo = (ImageView) findViewById(R.id.imageViewLogo);
        imageViewLogo.setImageDrawable(drawable);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menuopciones, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();
        if(id == R.id.screen1){
            Intent secondScreen = new Intent(this, MainActivity3.class);
            startActivity(secondScreen);
            Toast.makeText(getApplicationContext(), "Servicios", Toast.LENGTH_LONG).show();
        }
        if(id == R.id.screen2){
            Intent thirdScreen = new Intent(this, MainActivity2.class);
            startActivity(thirdScreen);
            Toast.makeText(getApplicationContext(), "Productos", Toast.LENGTH_LONG).show();
        }
        if(id == R.id.screen3){
            Intent fourthScreen = new Intent(this, MainActivity4.class);
            startActivity(fourthScreen);
            Toast.makeText(getApplicationContext(), "Sucursales", Toast.LENGTH_LONG).show();
        }
        return super.onOptionsItemSelected(item);

    }
}