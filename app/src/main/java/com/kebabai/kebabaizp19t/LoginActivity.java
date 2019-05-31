package com.kebabai.kebabaizp19t;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        setTitle(getResources().getString(R.string.login_title));

        //alt + enter import class jei bibliotekos nera.
        final EditText loginVardas = findViewById(R.id.login_vardas);
        final EditText loginSlaptazodis = findViewById(R.id.login_slaptazodis);
        Button loginPrisijungti = findViewById(R.id.login_prisijungti);
        Button loginRegistracija = findViewById(R.id.login_registruotis);

        loginRegistracija.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent eitiIRegistracijosLanga = new Intent(LoginActivity.this,RegistracijaActivity.class);
                startActivity(eitiIRegistracijosLanga);
            }
        });

        loginPrisijungti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Cia esantis kodas bus vykdomas paspaudus mygtuka.
                String loginVardas2 = loginVardas.getText().toString();
                String loginSlaptazodis2 = loginSlaptazodis.getText().toString();
                Toast.makeText(LoginActivity.this,
                        "Prisijungimo vardas : "+loginVardas2+"\n"
                                +"Slaptažodis :"+loginSlaptazodis2+"\n",
                        Toast.LENGTH_LONG).show();
                //Perejimas tarp langu                              is kur      --->  i kur
                Intent eitiIPaieskosLanga = new Intent(LoginActivity.this,SearchActivity.class);
                startActivity(eitiIPaieskosLanga);
            }
        });
    }
}
