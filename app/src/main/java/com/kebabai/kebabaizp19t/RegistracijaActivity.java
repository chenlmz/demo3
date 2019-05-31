package com.kebabai.kebabaizp19t;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class RegistracijaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registracija);
        setTitle(getResources().getString(R.string.login_registruotis));

        //alt + enter import class jei bibliotekos nera.
        final EditText loginVardas = findViewById(R.id.login_vardas);
        final EditText loginSlaptazodis = findViewById(R.id.login_slaptazodis);
        final EditText loginElPastas = findViewById(R.id.login_elPastas);
        Button loginRegistracija = findViewById(R.id.login_registruotis);

        loginRegistracija.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent eitiILoginLanga = new Intent(RegistracijaActivity.this,LoginActivity.class);
                startActivity(eitiILoginLanga);
            }
        });
    }
}
