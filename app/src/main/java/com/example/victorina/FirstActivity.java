package com.example.victorina;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.MediaController;
import android.widget.RadioButton;
import android.widget.VideoView;

import androidx.appcompat.app.AppCompatActivity;

public class FirstActivity extends AppCompatActivity {

    int res= 0;
    VideoView videoView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);

        videoView = findViewById(R.id.Vidi2);

        videoView.setVideoPath("android.resource://" +getPackageName()+"/"+R.raw.vid1);
        videoView.start();


    }

    public void rightAnswer(View view) {
        RadioButton radioButton;
        radioButton = findViewById(R.id.Bt7);

        Intent intent;
        intent = new Intent(this, SecondActivity.class);
        if(radioButton.isChecked())
        {

            res = res + 1;
            intent.putExtra("result", res);
        }
        startActivity(intent);
    }

    public void WrongAnswer1(View view) {
        Intent intent = new Intent(this,SecondActivity.class);
        startActivity(intent);
    }

    public void WrongAnswer2(View view) {
        Intent intent = new Intent(this,SecondActivity.class);
        startActivity(intent);
    }
}
