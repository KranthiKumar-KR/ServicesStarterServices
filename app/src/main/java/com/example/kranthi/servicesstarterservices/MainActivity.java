package com.example.kranthi.servicesstarterservices;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

        public void stop(View view){
            Intent i = new Intent(MainActivity.this, MyService.class);
            stopService(i);


        }
    public void start(View view){
        Intent i = new Intent(MainActivity.this, MyService.class);
        i.putExtra("message", "my custom message");
        startService(i);
    }

    public void start2(View view){
        Intent i = new Intent(MainActivity.this, SecondService.class);
        startService(i);
    }

}
