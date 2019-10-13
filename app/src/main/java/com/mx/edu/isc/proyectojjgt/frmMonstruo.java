package com.mx.edu.isc.proyectojjgt;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class frmMonstruo extends AppCompatActivity  implements View.OnClickListener {
Button btnFusion;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_frm_monstruo);
        btnFusion= findViewById(R.id.button2);
        btnFusion.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        Intent btn1 = new Intent(this, frmFusion.class);
        startActivity(btn1);
        finish();
    }
    public void ritual(View v) {
        Intent btn2 = new Intent(this, frmRitual.class);
        startActivity(btn2);
        finish();
    }
    public void sincronia(View v) {
        Intent btn3 = new Intent(this, frmSincro.class);
        startActivity(btn3);
        finish();
    }
    public void xyz(View v) {
        Intent btn4 = new Intent(this, frmXyz.class);
        startActivity(btn4);
        finish();
    }
    public void menu(View v) {
        Intent btn5 = new Intent(this, frmMenu.class);
        startActivity(btn5);
        finish();
    }

}
