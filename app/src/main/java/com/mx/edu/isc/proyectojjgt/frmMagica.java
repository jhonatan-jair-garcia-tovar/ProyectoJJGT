package com.mx.edu.isc.proyectojjgt;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class frmMagica extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_frm_magica);
    }
    public void menu(View v) {
        Intent btn5 = new Intent(this, frmMenu.class);
        startActivity(btn5);
        finish();
    }
}
