package com.example.a02_ciclodevidedelasactividades;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class SecondActivity extends AppCompatActivity {

    private Button btnCerrar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Log.e("Estados","1 - Ejecuto onCreate Activity 2");

        btnCerrar = findViewById(R.id.btnCerrarSecond);
        btnCerrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.e("Estados","6 - Ejecuto onDestroy Activity 2");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.e("Estados","5 - Ejecuto onStop Activity 2");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.e("Estados", "4 - Ejecuto onPause Activity 2");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.e("Estados", "3 - Ejecuto onResume Activity 2");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.e("Estados", "2 - Ejecuto onStart Activity 2");
    }
}