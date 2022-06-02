package com.example.afinal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

import java.util.Timer;
import java.util.TimerTask;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().setDisplayUseLogoEnabled(true);
        getSupportActionBar().setLogo(R.mipmap.ic_launcher);
        getSupportActionBar().setDisplayUseLogoEnabled(true);
        Toast.makeText(MainActivity.this, "Book Today!",Toast.LENGTH_SHORT).show();
        TimerTask task = new TimerTask() {
            @Override
            public void run() {
            finish();
            startActivity(new Intent(MainActivity.this, MainActivity2.class));
            }
        };
        Timer opening = new Timer();
        opening.schedule(task,5000);
    }
}