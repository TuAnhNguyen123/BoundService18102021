package com.example.boundservice18102021;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button mbtnStartService, mbtnStopService;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mbtnStartService = findViewById(R.id.buttonStartService);
        mbtnStopService = findViewById(R.id.buttonStopService);

        mbtnStartService.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,MyService.class);
                startService(intent);
            }
        });

        mbtnStopService.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,MyService.class);
                stopService(intent);
            }
        });
    }
}