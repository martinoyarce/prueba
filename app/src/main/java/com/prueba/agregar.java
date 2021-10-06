package com.prueba;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;

public class agregar extends AppCompatActivity {
    EditText nombr;
    EditText eda;
    Button btn;
    Spinner sp;
    ArrayList<String> valores = new ArrayList<String>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_agregar);
        nombr = (EditText) findViewById(R.id.lbl_nom);
        eda = (EditText) findViewById(R.id.lbl_edad);
        sp = (Spinner) findViewById(R.id.spinner);

        valores.add("...");
        valores.add("hombres");
        valores.add("mujeres");
        ArrayAdapter<String> adaptador = new ArrayAdapter<String>(getApplicationContext(),R.layout.support_simple_spinner_dropdown_item,valores);
        sp.setAdapter(adaptador);


    }
    public void alert(View f){
        AlertDialog.Builder mi = new AlertDialog.Builder(this);
        mi.setMessage("¿esta seguro que desea continuar?");
        mi.setTitle("Advertencia");
        mi.setPositiveButton("Agregar", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                String gen = sp.getSelectedItem().toString();

                if(nombr.getText().toString().isEmpty() || eda.getText().toString().isEmpty()){
                    Toast.makeText(getApplicationContext(), "ingrese todos los datos",Toast.LENGTH_LONG).show();
                }
                if(gen.equals("hombres")){
                    Integer total = 0, hcontador=0;
                    hcontador++;
                    total++;
                    Intent I = new Intent(getApplicationContext(),control.class);
                    I.putExtra("contadorh",hcontador);
                    I.putExtra("contador",total);
                    startActivity(I);
                }
                if(gen.equals("mujeres")){
                    Integer total = 0, mcontador=0;
                    mcontador++;
                    total++;
                    Intent I = new Intent(getApplicationContext(),control.class);
                    I.putExtra("contadorm",mcontador);
                    I.putExtra("contador",total);
                    startActivity(I);
                }
            }
        });
        mi.setNegativeButton("no", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.cancel();
            }
        });
        AlertDialog dialog = mi.create();
        dialog.show();
    }




    }

