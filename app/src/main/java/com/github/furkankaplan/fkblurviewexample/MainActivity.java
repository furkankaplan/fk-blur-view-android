package com.github.furkankaplan.fkblurviewexample;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.content.Context;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.PopupWindow;

import com.github.furkankaplan.fkblurview.FKBlurView;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final FKBlurView blurView = findViewById(R.id.fkBlurView);
        // Blur level starts from 1. It's minimum level.
        // Default blurLevel 50 if you don't pass any value.
        blurView.setBlur(this, blurView);

        blurView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showDialog();
            }
        });

    }

    private void showDialog() {
        LayoutInflater inflater = (LayoutInflater) getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        View v = inflater.inflate(R.layout.popup, (ViewGroup) findViewById(R.id.root_fk_blur_view));

        FKBlurView popupBlurView = v.findViewById(R.id.root_fk_blur_view);
        popupBlurView.setBlurBackground(MainActivity.this, popupBlurView);

        final PopupWindow errorPopup = new PopupWindow(v,
                getWindowManager().getDefaultDisplay().getWidth(),
                getWindowManager().getDefaultDisplay().getHeight(), true);

        errorPopup.showAtLocation(v, Gravity.CENTER, 0, 0);
    }
}