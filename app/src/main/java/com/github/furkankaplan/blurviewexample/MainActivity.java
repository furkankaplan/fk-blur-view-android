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
        blurView.getBlur(this, blurView);
    }
}