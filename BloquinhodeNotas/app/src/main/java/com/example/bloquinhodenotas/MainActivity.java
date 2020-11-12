package com.example.bloquinhodenotas;

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

    //criando um método para o botao de nova nota
    public void  fabNovaNotaClick(View v){
        startActivity(new Intent(getApplicationContext(), NotaActivity.class));
    }
}