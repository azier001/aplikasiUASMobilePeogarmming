package com.ajir.uasmobileprogramming_8670089_ahmadajir;


import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.Button;

public class MenuUtama extends AppCompatActivity {
    Button btnmap, btnlokasi, btnpenjualan, btnHitung, btnabout, btnexit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_utama);

        btnmap = (Button) findViewById(R.id.btnmap);
        btnlokasi = (Button) findViewById(R.id.btnlokasi);
        btnpenjualan = (Button) findViewById(R.id.btnpenjualan);
        btnHitung = (Button) findViewById(R.id.btnHitung);
        btnabout = (Button) findViewById(R.id.btnabout);
        btnexit = (Button) findViewById(R.id.btnexit);
        btnmap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MenuUtama.this,
                        MapsActivity.class);
                startActivity(i);
            }
        });

        btnlokasi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MenuUtama.this,
                        MapsActivity2.class);
                startActivity(i);
            }
        });

        btnpenjualan.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MenuUtama.this, penjualan.class);
                finish();
                startActivity(intent);
            }
        });


        btnabout.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MenuUtama.this, About.class);
                finish();
                startActivity(intent);
            }
        });

        btnHitung.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MenuUtama.this, kalkulator.class);
                finish();
                startActivity(intent);
            }
        });




        btnexit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();

            }
        });






    }
}