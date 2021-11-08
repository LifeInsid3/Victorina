package com.example.victorina;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.MediaController;
import android.widget.RadioButton;
import android.widget.VideoView;

import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {

    int res;
    VideoView videoView2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Bundle argument = getIntent().getExtras();

        if(argument!=null)
        {
            res = argument.getInt("result");
        }

        videoView2 = findViewById(R.id.Vidi3);

        videoView2.setVideoPath("android.resource://" +getPackageName()+"/"+R.raw.vid2);
        videoView2.start();
    }

    public void rightAnswer2(View view) {
        RadioButton radioButton;
        radioButton = findViewById(R.id.Bt9);


        Intent intent2;
        intent2 = new Intent(this, ThirdActivity.class);
        if(radioButton.isChecked())
        {
            res = res + 1;
            intent2.putExtra("result", res);
        }
        startActivity(intent2);
    }


    public void WrongAnswer3(View view) {
        Intent intent2 = new Intent(this,ThirdActivity.class);
        startActivity(intent2);
    }

    public void WrongAnswer4(View view) {
        Intent intent2 = new Intent(this,ThirdActivity.class);
        startActivity(intent2);
    }
}
