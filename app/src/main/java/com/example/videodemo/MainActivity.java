package com.example.videodemo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.TypedValue;
import android.widget.MediaController;
import android.widget.RelativeLayout;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Intent i = new Intent(getApplicationContext(),VideoAssetActivity.class);
        startActivity(i);
        setContentView(R.layout.texture_video_simple);

//        VideoView videoView = findViewById(R.id.videoView);
//        videoView.setVideoPath("android.resource://"+getPackageName()+"/"+R.raw.demo);
//        MediaController mediaController = new MediaController(this);
//        mediaController.setAnchorView(videoView);
//        videoView.setMediaController(mediaController);
//        int height = (int) TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, 5000f, getResources().getDisplayMetrics());
//        int width =  (int) TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, 5000f, getResources().getDisplayMetrics());
//
//        videoView.setLayoutParams(new RelativeLayout.LayoutParams(width, height));
//        videoView.start();
    }
}
