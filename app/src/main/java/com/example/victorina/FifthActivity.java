package com.example.victorina;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.MediaController;
import android.widget.RadioButton;
import android.widget.VideoView;

import androidx.appcompat.app.AppCompatActivity;

public class FifthActivity extends AppCompatActivity {

    int res;
    VideoView videoView5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fifth);


        Bundle argument = getIntent().getExtras();

        if(argument!=null)
        {
            res = argument.getInt("result");
        }

        videoView5 = findViewById(R.id.Vidi6);

        videoView5.setVideoPath("android.resource://" +getPackageName()+"/"+R.raw.vid5);
        videoView5.start();
    }

    public void rightAnswer5(View view) {
        RadioButton radioButton;
        radioButton = findViewById(R.id.Bt9);

        Intent intent5;
        intent5 = new Intent(this, ResultActivity.class);
        if(radioButton.isChecked())
        {
            res = res + 1;
            intent5.putExtra("result", res);
        }
        startActivity(intent5);
    }

    public void WrongAnswer9(View view) {
        Intent intent5 = new Intent(this, ResultActivity.class);
        startActivity(intent5);
    }

    public void WrongAnswer10(View view) {
        Intent intent5 = new Intent(this, ResultActivity.class);
        startActivity(intent5);
    }
}
