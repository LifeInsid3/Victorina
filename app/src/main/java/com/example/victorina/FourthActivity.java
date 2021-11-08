package com.example.victorina;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.MediaController;
import android.widget.RadioButton;
import android.widget.VideoView;

import androidx.appcompat.app.AppCompatActivity;

public class FourthActivity extends AppCompatActivity {

    int res;
    VideoView videoView4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fourth);


        Bundle argument = getIntent().getExtras();

        if(argument!=null)
        {
            res = argument.getInt("result");
        }

        videoView4 = findViewById(R.id.Vidi5);


        videoView4.setVideoPath("android.resource://" +getPackageName()+"/"+R.raw.vid4);
        videoView4.start();
    }

    public void rightAnswer4(View view) {
        RadioButton radioButton;
        radioButton = findViewById(R.id.Bt8);

        Intent intent4;
        intent4 = new Intent(this, FifthActivity.class);
        if(radioButton.isChecked())
        {
            res = res + 1;
            intent4.putExtra("result", res);
        }
        startActivity(intent4);
    }

    public void WrongAnswer7(View view) {
        Intent intent4 = new Intent(this, FifthActivity.class);
        startActivity(intent4);
    }

    public void WrongAnswer8(View view) {
        Intent intent4 = new Intent(this, FifthActivity.class);
        startActivity(intent4);
    }
}
