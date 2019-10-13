package com.mx.edu.isc.proyectojjgt;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class frmMenu extends AppCompatActivity implements View.OnClickListener {
    Button btnMounstruo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_frm_menu);
        btnMounstruo= findViewById(R.id.button);
        btnMounstruo.setOnClickListener(this);
        }

    @Override
    public void onClick(View view) {
        Intent btn1 = new Intent(this, frmMonstruo.class);
        startActivity(btn1);
        finish();
    }
    public void magica(View v) {
        Intent btn2 = new Intent(this, frmMagica.class);
        startActivity(btn2);
        finish();
    }
    public void trampa(View v) {
        Intent btn3 = new Intent(this, frmTrampa.class);
        startActivity(btn3);
        finish();
    }
    public void acercaDe(View v) {
        Intent btn4 = new Intent(this, frmAcercaDe.class);
        startActivity(btn4);
        finish();
    }
    public void salir(View v) {
        finish();
    }
}
