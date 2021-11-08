package com.example.victorina;

import android.content.Context;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class ResultActivity extends AppCompatActivity {

    int res;
    MediaPlayer mediaPlayer;
    AudioManager audioManager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        mediaPlayer = MediaPlayer.create(this, R.raw.mus1);
        audioManager = (AudioManager) getSystemService(Context.AUDIO_SERVICE);
    }



    public void resulti(View view) {
        mediaPlayer.start();

        Bundle argument = getIntent().getExtras();
        if(argument!=null)
        {
            res = argument.getInt("result");
        }
        switch (res)
        {
            case 0:
                Toast.makeText(this, "Вы набрали 0 очков", Toast.LENGTH_SHORT).show();
                break;
            case 1:
                Toast.makeText(this, "Вы набрали 1 очко", Toast.LENGTH_SHORT).show();
                break;
            case 2:
                Toast.makeText(this, "Вы набрали 2 очка", Toast.LENGTH_SHORT).show();
                break;
            case 3:
                Toast.makeText(this, "Вы набрали 3 очка", Toast.LENGTH_SHORT).show();
                break;
            case 4:
                Toast.makeText(this, "Вы набрали 4 очка", Toast.LENGTH_SHORT).show();
                break;
            case 5:
                Toast.makeText(this, "Вы набрали 5 очков", Toast.LENGTH_SHORT).show();
                break;
        }
    }
}
