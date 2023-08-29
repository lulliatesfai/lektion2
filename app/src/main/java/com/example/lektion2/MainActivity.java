package com.example.lektion2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("Lullia", "onStop");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("Lullia", "onStart");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("Lullia", "onDestroy");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("Lullia", "onPause");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("Lullia", "onResume");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageView im =findViewById(R.id.imageView);
        im.setRotation(90);




    }
}