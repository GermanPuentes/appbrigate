package com.labnewcod.appbrigate;

import androidx.appcompat.app.AppCompatActivity;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity3 extends AppCompatActivity {

    Drawable drawable1, drawable2 ;
    ImageView imagen1, imagen2;
    Button btn1, btn2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setIcon(R.mipmap.ic_icon);


        //Conecto los botones
        btn1 = (Button) findViewById(R.id.btn_call);
        btn2 = (Button) findViewById(R.id.btn_call2);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Proximamente", Toast.LENGTH_LONG).show();
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Proximamente", Toast.LENGTH_LONG).show();
            }
        });

        Resources res = getResources();
        drawable1 = res.getDrawable(R.drawable.domicilio, getTheme());

        imagen1 =(ImageView) findViewById(R.id.imageViewDomicilio);
        imagen1.setImageDrawable(drawable1);


        Resources res2 = getResources();
        drawable2 = res2.getDrawable(R.drawable.reparacion, getTheme());

        imagen2 =(ImageView) findViewById(R.id.imageViewReparacion);
        imagen2.setImageDrawable(drawable2);
    }
}