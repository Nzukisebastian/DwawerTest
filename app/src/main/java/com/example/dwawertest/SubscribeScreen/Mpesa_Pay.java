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

public class Mpesa_Pay extends AppCompatActivity implements View.OnClickListener {
    EditText phones,amounts;
    Button etsubscribe;
    String emails;
    Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mpesa__pay);

        VideoView videoView =(VideoView)findViewById(R.id.videoView1);
        MediaController mediaController= new MediaController(this);
        mediaController.setAnchorView(videoView);
        // Uri uri=Uri.parse("/sdcard/media/1.mp4");
        // Uri uri= Uri.parse("http://127.0.0.1/video");
        Uri uri=Uri.parse("android.resource://"+ getPackageName()+"/"+ R.raw.video1);
        videoView.setMediaController(mediaController);
        videoView.setVideoURI(uri);
        videoView.requestFocus();
        videoView.start();

       // Intent intent=getIntent();
        //emails=intent.getExtras().getString("emailid");
        phones = (EditText) findViewById(R.id.etphone);
        amounts = (EditText) findViewById(R.id.etamount);
        etsubscribe = (Button) findViewById(R.id.btn_subscribe);
        etsubscribe.setOnClickListener(this);
    }
    private void sub(){
        //User user=new User(phone,amount);
        // sendnetworkrequest(user);
        String phone =phones.getText().toString();
        String amount=amounts.getText().toString();
        String email=emails;
        //Integer amountsx=Integer.parseInt(amounts.getText().toString());
        //Toast.makeText(Pesa.this,email,Toast.LENGTH_LONG).show();
        String type="subscribe";
        Mpesabackgroundtask mpesabackgroundtask=new Mpesabackgroundtask(this);
        mpesabackgroundtask.execute(type,phone,amount,email);
        Toast.makeText(Mpesa_Pay.this,email, Toast.LENGTH_LONG).show();

    }
    @Override
    public void onClick(View v) {
        if(v==etsubscribe){
            sub();
        }
    }

}
