package com.example.firstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.ViewFlipper;

public class MainActivity extends AppCompatActivity {
    private Button btnRegistasi;
    private TextView btnMakePocket;
    ViewFlipper v_flipper;
    int[] images={
            R.drawable.cv,
            R.drawable.sw
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        v_flipper = findViewById(R.id.v_flipper);
        for(int i=0; i<images.length; i++){
            flip_image(images[i]);
        }
        //menyambungkan front end dan backend
        btnRegistasi = (Button) findViewById(R.id.btn_registrasi);
        btnMakePocket = (TextView) findViewById(R.id.tv_makepocket);
        //method saat onclik btnRegistrasi
        btnRegistasi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pindah = new Intent(MainActivity.this, register.class);
                startActivity(pindah);
            }
        });
        //method saat onclik btnMakePocket
        btnMakePocket.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pindah =  new Intent(MainActivity.this, makeEpocket.class);
                startActivity(pindah);
            }
        });

    }

    private void flip_image(int i) {
        ImageView view =new ImageView(this);
        view.setBackgroundResource(i);
        v_flipper.addView(view);
        v_flipper.setFlipInterval(3000);
        v_flipper.setAutoStart(true);

        v_flipper.setInAnimation(this,android.R.anim.slide_in_left);
        v_flipper.setOutAnimation(this,android.R.anim.slide_out_right);
    }
}
