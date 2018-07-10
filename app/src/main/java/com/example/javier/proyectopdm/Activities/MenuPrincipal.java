package com.example.javier.proyectopdm.Activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.javier.proyectopdm.R;

public class MenuPrincipal extends AppCompatActivity {
    private Button cliente, producto, pedido;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu);
        init();
        //Botones botones y más botones, que nos llevan a nuestras actividades
        cliente.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        producto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),ProductoLista.class);
                startActivity(intent);
            }
        });
        pedido.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }
    private void init(){
        cliente = findViewById(R.id.btn_clientes);
        producto = findViewById(R.id.btn_productos);
        pedido = findViewById(R.id.btn_facturas);
    }
}
