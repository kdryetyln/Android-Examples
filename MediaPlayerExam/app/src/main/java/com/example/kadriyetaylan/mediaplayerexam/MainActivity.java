package com.example.kadriyetaylan.mediaplayerexam;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    MediaPlayer song;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void Play(View view) {
        song=MediaPlayer.create(MainActivity.this,R.raw.thunder);
        song.start();
    }

}
