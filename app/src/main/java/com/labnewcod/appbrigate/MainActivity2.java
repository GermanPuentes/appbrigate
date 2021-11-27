package com.labnewcod.appbrigate;

import androidx.appcompat.app.AppCompatActivity;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.widget.ImageView;

public class MainActivity2 extends AppCompatActivity {
    Drawable drawable1, drawable2, drawable3, drawable4;
    ImageView imagen1, imagen2, imagen3, imagen4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setIcon(R.mipmap.ic_icon);

        Resources res = getResources();
        drawable1 = res.getDrawable(R.drawable.chaqueta_hombre, getTheme());

        imagen1 =(ImageView) findViewById(R.id.imageViewHombre);
        imagen1.setImageDrawable(drawable1);


        Resources res2 = getResources();
        drawable2 = res2.getDrawable(R.drawable.chaqueta_mujer, getTheme());

        imagen2 =(ImageView) findViewById(R.id.imageViewMujer);
        imagen2.setImageDrawable(drawable2);

        Resources res3 = getResources();
        drawable3 = res3.getDrawable(R.drawable.chaqueta_nino, getTheme());

        imagen3 =(ImageView) findViewById(R.id.imageViewNinos);
        imagen3.setImageDrawable(drawable3);

        Resources res4 = getResources();
        drawable4 = res4.getDrawable(R.drawable.chaqueta_nina, getTheme());

        imagen4 =(ImageView) findViewById(R.id.imageViewNinas);
        imagen4.setImageDrawable(drawable4);
    }
}