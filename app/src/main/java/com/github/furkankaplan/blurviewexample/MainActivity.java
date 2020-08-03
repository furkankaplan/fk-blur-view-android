package com.github.furkankaplan.blurviewexample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.furkankaplan.blurview.BlurView;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        BlurView blurView = findViewById(R.id.fkBlurView);
        // Blur level starts from 1. It's minimum level.
        // Default blurLevel 50 if you don't pass any value.
        blurView.getBlur(this, blurView, 40);
    }
}