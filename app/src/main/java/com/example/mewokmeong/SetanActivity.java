package com.example.mewokmeong;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.widget.Toast;

public class SetanActivity extends AppCompatActivity {

    private MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setan);
        mediaPlayer = MediaPlayer.create(this, R.raw.faith);
        mediaPlayer.start();
    }

    public void onBackPressed() {
        super.onBackPressed();
        Toast.makeText(this, "Now or Never!!!", Toast.LENGTH_SHORT).show();
        mediaPlayer.release();
    }
}
