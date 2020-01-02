package com.example.dwawertest.SubscribeScreen;

import android.content.Context;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.MediaController;
import android.widget.Toast;
import android.widget.VideoView;

import com.example.dwawertest.R;

public class Mpesa_Pay extends AppCompatActivity{
  EditText phones,amounts;
  Button etsubscribe;
  String emails;
  Context context;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_mpesa__pay);

    VideoView videoView = (VideoView) findViewById(R.id.videoView1);
    MediaController mediaController = new MediaController(this);
    mediaController.setAnchorView(videoView);
    // Uri uri=Uri.parse("/sdcard/media/1.mp4");
    // Uri uri= Uri.parse("http://127.0.0.1/video");
    Uri uri = Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.video1);
    videoView.setMediaController(mediaController);
    videoView.setVideoURI(uri);
    videoView.requestFocus();
    videoView.start();

  }
}
