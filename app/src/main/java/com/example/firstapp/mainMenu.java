package com.example.firstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class mainMenu extends AppCompatActivity {
    private LinearLayout btnTopup;
    private LinearLayout btnTransfer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);
        btnTopup = (LinearLayout)findViewById(R.id.ll_topup);
        btnTransfer = (LinearLayout)findViewById(R.id.ll_transfer);

        btnTransfer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pindah = new Intent(mainMenu.this, transfer.class);
                startActivity(pindah);
            }
        });

        btnTopup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pindah = new Intent(mainMenu.this, topup.class);
                startActivity(pindah);
            }
        });

    }
}
