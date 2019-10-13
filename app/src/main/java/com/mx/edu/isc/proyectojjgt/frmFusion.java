package com.mx.edu.isc.proyectojjgt;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class frmFusion extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_frm_fusion);
    }
    public void mounstruo(View v) {
        Intent btn1 = new Intent(this, frmMonstruo.class);
        startActivity(btn1);
        finish();
    }
}
