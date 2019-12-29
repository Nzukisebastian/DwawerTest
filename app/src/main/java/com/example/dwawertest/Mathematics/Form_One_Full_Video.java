package com.example.dwawertest.Mathematics;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.VideoView;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.widget.MediaController;
import android.widget.VideoView;

import com.example.dwawertest.R;

public class Form_One_Full_Video extends AppCompatActivity {

    Context context;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form__one__full__video);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        VideoView videoView =(VideoView)findViewById(R.id.videoView1);

        //receiving data
        Intent intent=getIntent();
        String url=intent.getExtras().getString("url");
        String description=intent.getExtras().getString("description");

        MediaController mediaController= new MediaController(this);
        mediaController.setAnchorView(videoView);

        // Uri uri=Uri.parse("/sdcard/media/1.mp4");
       // Uri uri= Uri.parse("http://127.0.0.1/video");
        Uri uri=Uri.parse("android.resource://"+ getPackageName()+"/"+ R.raw.video1);
        videoView.setMediaController(mediaController);
        videoView.setVideoURI(uri);
        videoView.requestFocus();
        videoView.start();

    }
    }

