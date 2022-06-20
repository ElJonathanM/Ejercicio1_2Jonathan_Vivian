package com.example.ejercicio1_2jonathan_vivian;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText txtnombre, txtapellidos, txtedad, txtcorreo;
    Button btnenviar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtnombre = (EditText) findViewById(R.id.txtnombre);
        txtapellidos = (EditText) findViewById(R.id.txtapellidos);
        txtedad = (EditText) findViewById(R.id.txtedad);
        txtcorreo = (EditText) findViewById(R.id.txtcorreo);
        btnenviar = (Button) findViewById(R.id.btnenviar);

        btnenviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), SegundaPagina.class);
                intent.putExtra("nombre", txtnombre.getText().toString());
                intent.putExtra("apellidos", txtapellidos.getText().toString());
                intent.putExtra("edad", txtedad.getText().toString());
                intent.putExtra("correo", txtcorreo.getText().toString());
                startActivity(intent);
            }
        });
    }
}