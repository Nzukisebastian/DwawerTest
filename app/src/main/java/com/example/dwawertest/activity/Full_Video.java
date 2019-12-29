package com.example.dwawertest.activity;

import android.app.ProgressDialog;
import android.content.Intent;
import android.graphics.PixelFormat;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.TextView;
import android.widget.VideoView;

import com.example.dwawertest.R;

public class Full_Video extends AppCompatActivity {
    TextView description;
    private ProgressDialog bar;
    //private String path="https://videocdn.bodybuilding.com/video/mp4/62000/62792m.mp4";
    private MediaController ctlr;
    private VideoView videoView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_full__video);
        description=(TextView)findViewById(R.id.showdescription);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        //receiving data
        Intent intent=getIntent();
        String path=intent.getExtras().getString("url");
        String vdescription=intent.getExtras().getString("description");
        description.setText(vdescription);

        getWindow().setFormat(PixelFormat.TRANSLUCENT);
        bar=new ProgressDialog(Full_Video.this);
        bar.setTitle("Connecting server");
        bar.setMessage("Please Wait... ");
        bar.setCancelable(false);
        bar.show();
        if(bar.isShowing()) {
            VideoView videoView =(VideoView)findViewById(R.id.videoView1);
            Uri uri = Uri.parse(path);
            videoView.setVideoURI(uri);
            videoView.start();
            ctlr = new MediaController(this);
            ctlr.setMediaPlayer(videoView);
            videoView.setMediaController(ctlr);
            videoView.requestFocus();
        }
        bar.dismiss();
    }
}
