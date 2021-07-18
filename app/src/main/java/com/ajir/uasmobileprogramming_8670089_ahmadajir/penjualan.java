package com.ajir.uasmobileprogramming_8670089_ahmadajir;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class penjualan extends AppCompatActivity {

    EditText etNama, etHarga, etJumlah, etByr;  Button btTotal, btHasil, btClear, btnback;
    TextView tvTot, tvKembali;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_penjualan);

        etNama=(EditText) findViewById(R.id.etNamaBarang);
        etHarga=(EditText) findViewById(R.id.etHargaBarang);
        etJumlah=(EditText) findViewById(R.id.etJumlahBarang);
        etByr=(EditText) findViewById(R.id.etBayar);
        btTotal=(Button) findViewById(R.id.btnTotal);
        btHasil=(Button) findViewById(R.id.btnHasil);
        btClear=(Button) findViewById(R.id.btnClear);
        btnback = (Button) findViewById(R.id.btnback);
        tvTot=(TextView) findViewById(R.id.tvTotal);
        tvKembali=(TextView) findViewById(R.id.tvKembalian);

        btTotal.setOnClickListener(new View.OnClickListener() { @Override
        public void onClick(View v) {
            double jmlbarang, hrgbarang, total; jmlbarang=Double.valueOf(etJumlah.getText().toString().trim()); hrgbarang=Double.valueOf(etHarga.getText().toString().trim()); total=jmlbarang * hrgbarang;
            String total1=String.valueOf(total); tvTot.setText(total1);
        }
        });

        btHasil.setOnClickListener(new View.OnClickListener() { @Override
        public void onClick(View v) { double bayar, totharga, hasil;
            totharga=Double.valueOf(tvTot.getText().toString().trim()); bayar=Double.valueOf(etByr.getText().toString().trim()); hasil=bayar - totharga;
            String hasil1=String.valueOf(hasil); tvKembali.setText(hasil1);
        }
        });

        btClear.setOnClickListener(new View.OnClickListener() { @Override
        public void onClick(View v) { etNama.setText(""); etHarga.setText(""); etJumlah.setText(""); etByr.setText("");
            tvTot.setText(""); tvKembali.setText("");

        }
        });


        btnback.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(penjualan.this, MenuUtama.class);
                finish();
                startActivity(intent);
            }
        });

    }
}