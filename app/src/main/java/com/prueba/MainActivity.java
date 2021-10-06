package com.prueba;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText usuari;
    EditText clave;
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        usuari = (EditText) findViewById(R.id.lbl_usu);
        clave = (EditText) findViewById(R.id.lbl_cla);
        btn = (Button) findViewById(R.id.btn_conec);


        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(usuari.getText().toString().isEmpty() || clave.getText().toString().isEmpty()){
                    Toast.makeText(getApplicationContext(), "ingresar datos",Toast.LENGTH_LONG).show();
                }
                String us = usuari.getText().toString();
                String con = clave.getText().toString();
                if(us.equals("adm123") & con.equals("adm123")){
                    Intent I = new Intent(getApplicationContext(),control.class);
                    startActivity(I);
                }
                else {
                    Toast.makeText(getApplicationContext(), "datos incorrectos",Toast.LENGTH_LONG).show();
                }

            }
        });

    }
}