package com.prueba;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class control extends AppCompatActivity {
    TextView total;
    TextView hombres;
    TextView mujer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_control);
        total = (TextView) findViewById(R.id.txt_total);
        hombres = (TextView) findViewById(R.id.txt_hom);
        mujer = (TextView) findViewById(R.id.txt_mu);

        Bundle b = getIntent().getExtras();
        Integer to= b.getInt("contador");
        Integer ho= b.getInt("contadorh");
        Integer mu= b.getInt("contadorm");

        total.setText(""+to);
        hombres.setText(""+ho);
        mujer.setText(""+mu);



    }
    public void agre(View v){
        Intent I = new Intent(getApplicationContext(),agregar.class);
        startActivity(I);
    }

}