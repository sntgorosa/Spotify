package com.example.spotify;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.provider.MediaStore;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class MainActivity extends AppCompatActivity {

    ImageView ivMusic;
    Button btnPlay;
    MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ivMusic = (ImageView) findViewById(R.id.ivMusic);
        Glide.with(this).load("https://img.youtube.com/vi/2YE1oz30yNo/0.jpg").into(ivMusic);

        mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.baco);
    }

    @Override
    protected void onResume() {
        super.onResume();
        mediaPlayer.start();
    }
}