package com.example.victorina;

import android.content.Intent;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.concurrent.TimeUnit;

public class LoadActivity extends AppCompatActivity {

    ImageView imv1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_load);
        imv1 = findViewById(R.id.ImV1);

        Animation animation = AnimationUtils.loadAnimation(LoadActivity.this, R.anim.anime);
        imv1.startAnimation(animation);

        Thread thread = new Thread(){

            public void run() {
                try {

                    TimeUnit.SECONDS.sleep(5);
                    Intent intent = new Intent(LoadActivity.this, MainActivity.class);
                    startActivity(intent);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        };
        thread.start();
    }
}
