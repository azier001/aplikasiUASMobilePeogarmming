package com.ajir.uasmobileprogramming_8670089_ahmadajir;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class kalkulator extends AppCompatActivity {

    EditText et1,et2;
    Button btnTambah,btnKurang,btnKali,btnBagi,btnClear, btnback;
    TextView tvHasil;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kalkulator);

        et1=(EditText) findViewById(R.id.et1);
        et2=(EditText) findViewById(R.id.et2);
        tvHasil=(TextView) findViewById(R.id.tvHasil);
        btnTambah=(Button) findViewById(R.id.btnTambah);
        btnKurang=(Button) findViewById(R.id.btnKurang);
        btnKali=(Button) findViewById(R.id.btnKali);
        btnBagi=(Button) findViewById(R.id.btnBagi);
        btnback=(Button) findViewById(R.id.btnback);


        btnTambah.setOnClickListener(new View.OnClickListener() { @Override
        public void onClick(View v) { double bil1,bil2,hasil;
            bil1=Double.valueOf(et1.getText().toString().trim()); bil2=Double.valueOf(et2.getText().toString().trim()); hasil=bil1+bil2;
            String hasil1=String.valueOf(hasil); tvHasil.setText(hasil1);
        }
        });

        btnKurang.setOnClickListener(new View.OnClickListener() { @Override
        public void onClick(View v) { double bil1,bil2,hasil;
            bil1=Double.valueOf(et1.getText().toString().trim()); bil2=Double.valueOf(et2.getText().toString().trim()); hasil=bil1-bil2;
            String hasil1=String.valueOf(hasil); tvHasil.setText(hasil1);
        }
        });

        btnKali.setOnClickListener(new View.OnClickListener() { @Override
        public void onClick(View v) { double bil1,bil2,hasil;
            bil1=Double.valueOf(et1.getText().toString().trim()); bil2=Double.valueOf(et2.getText().toString().trim()); hasil=bil1*bil2;
            String hasil1=String.valueOf(hasil); tvHasil.setText(hasil1);
        }
        });

        btnBagi.setOnClickListener(new View.OnClickListener() { @Override
        public void onClick(View v) { double bil1,bil2,hasil;
            bil1=Double.valueOf(et1.getText().toString().trim()); bil2=Double.valueOf(et2.getText().toString().trim()); hasil=bil1/bil2;
            String hasil1=String.valueOf(hasil); tvHasil.setText(hasil1);
        }
        });

        btnback.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(kalkulator.this, MenuUtama.class);
                finish();
                startActivity(intent);
            }
        });



    }
}