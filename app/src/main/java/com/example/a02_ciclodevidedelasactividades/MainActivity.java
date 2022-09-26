package com.example.a02_ciclodevidedelasactividades;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button btnAbrir;

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.e("Estados","6 - Ejecuto onDestroy");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.e("Estados","5 - Ejecuto onStop");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.e("Estados", "4 - Ejecuto onPause");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.e("Estados", "3 - Ejecuto onResume");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.e("Estados", "2 - Ejecuto onStart");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.e("Estados","1 - Ejecuto onCreate");
        btnAbrir = findViewById(R.id.btnAbrirMain);
        btnAbrir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                /*Vehículo conductor -> Intent (El objeto encargado de avisar a android:
                    1. Quien quiere abrir una nueva activity
                    2. Qué Activity quiere abrir)
                 */

                //Tengo 2 tipos:
                // - Implicitos => Abren actividades del sistema (Cámara, Galería, Contactos, Teléfono)
                // - Explicitos => Actividad Propia
                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                startActivity(intent);
            }
        });
    }


}