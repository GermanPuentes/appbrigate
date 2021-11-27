package com.labnewcod.appbrigate;

import androidx.appcompat.app.AppCompatActivity;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity4 extends AppCompatActivity {
    Button btn1, btn2, btn3, btn4, btn5, btn6;
    Drawable drawable1, drawable2, drawable3 ;
    ImageView imagen1, imagen2, imagen3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setIcon(R.mipmap.ic_icon);

        //Enlazo los botones
        btn1= (Button) findViewById(R.id.btn_como_llegar) ;
        btn2= (Button) findViewById(R.id.btnComoLlegarSucursal2) ;
        btn3= (Button) findViewById(R.id.btnComoLlegarSucursal3) ;
        btn4= (Button) findViewById(R.id.btn_llamar) ;
        btn5= (Button) findViewById(R.id.btnLlamarSucursal2) ;
        btn6= (Button) findViewById(R.id.btnLlamarSucursal3) ;

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"Proximamente", Toast.LENGTH_LONG).show();
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"Proximamente", Toast.LENGTH_LONG).show();
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"Proximamente", Toast.LENGTH_LONG).show();
            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"Proximamente", Toast.LENGTH_LONG).show();
            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"Proximamente", Toast.LENGTH_LONG).show();
            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"Proximamente", Toast.LENGTH_LONG).show();
            }
        });

        //Obtengo la imgagen que quiero mostrar
        Resources res = getResources();
        drawable1 = res.getDrawable(R.drawable.img_sede_norte, getTheme());
        //Cargo la imagen en el espacio asignado en el layout
        imagen1 =(ImageView) findViewById(R.id.imageViewSucursarNorte);
        imagen1.setImageDrawable(drawable1);

        //Obtengo la imagen que quiero mostrar
        Resources res2 = getResources();
        drawable2 = res2.getDrawable(R.drawable.img_sede_centrp, getTheme());
        //Cargo la imagen en el espacio asignao en el layout
        imagen2 =(ImageView) findViewById(R.id.imageViewSucursal2);
        imagen2.setImageDrawable(drawable2);

        //Obtengo la imagen que quiero mostrar
        Resources res3 = getResources();
        drawable3 = res3.getDrawable(R.drawable.img_sede_sur, getTheme());
        //Cargo la imagen en el espacio asignao en el layout
        imagen3 =(ImageView) findViewById(R.id.imageViewSucursal3);
        imagen3.setImageDrawable(drawable3);


    }
}