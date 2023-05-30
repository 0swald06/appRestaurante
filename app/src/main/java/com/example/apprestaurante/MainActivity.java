package com.example.apprestaurante;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.example.apprestaurante.databinding.ActivityMainBinding;

import java.sql.Time;
import java.util.Timer;
import java.util.TimerTask;

public class MainActivity extends AppCompatActivity {
private ActivityMainBinding mBinding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        mBinding=ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(mBinding.getRoot());


        TimerTask tarea= new TimerTask() {
            @Override
            public void run() {
                Intent intent =new Intent(MainActivity.this, MainActivity2.class);
                startActivity(intent);
                finish();
            }
        };

        Timer tiempo= new Timer();
        tiempo.schedule(tarea,5000);
    }
}