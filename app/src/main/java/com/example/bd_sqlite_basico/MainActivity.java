package com.example.bd_sqlite_basico;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void abrirRegistro(View v) {

        Intent i = new Intent(this, ActivityRegistro.class);
        startActivity(i);
    }


}
