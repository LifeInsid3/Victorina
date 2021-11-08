package com.example.victorina;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.MediaController;
import android.widget.RadioButton;
import android.widget.VideoView;

import androidx.appcompat.app.AppCompatActivity;

public class ThirdActivity extends AppCompatActivity {

    int res;
    VideoView videoView3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);


        Bundle argument = getIntent().getExtras();

        if(argument!=null)
        {
            res = argument.getInt("result");
        }

        videoView3 = findViewById(R.id.Vidi4);

        videoView3.setVideoPath("android.resource://" +getPackageName()+"/"+R.raw.vid3);
        videoView3.start();
    }

    public void rightAnswer3(View view) {
        RadioButton radioButton;
        radioButton = findViewById(R.id.Bt7);

        Intent intent3;
        intent3 = new Intent(this, FourthActivity.class);
        if(radioButton.isChecked())
        {
            res = res + 1;
            intent3.putExtra("result", res);
        }
        startActivity(intent3);
    }

    public void WrongAnswer5(View view) {
        Intent intent3 = new Intent(this,FourthActivity.class);
        startActivity(intent3);
    }

    public void WrongAnswer6(View view) {
        Intent intent3 = new Intent(this,FourthActivity.class);
        startActivity(intent3);
    }
}
