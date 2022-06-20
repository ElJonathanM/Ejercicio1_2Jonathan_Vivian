package com.example.ejercicio1_2jonathan_vivian;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class SegundaPagina extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segunda_pagina);

        TextView txtnombrer = (TextView) findViewById(R.id.txtnombrer);
        TextView txtapellidosr = (TextView) findViewById(R.id.txtapellidosr);
        TextView txtedadr = (TextView) findViewById(R.id.txtedadr);
        TextView txtcorreor = (TextView) findViewById(R.id.txtcorreor);

        txtnombrer.setText(getIntent().getExtras().getString("nombre"));
        txtapellidosr.setText(getIntent().getExtras().getString("apellidos"));
        txtedadr.setText(getIntent().getExtras().getString("edad"));
        txtcorreor.setText(getIntent().getExtras().getString("correo"));
    }
}