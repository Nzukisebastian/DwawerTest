package com.example.dwawertest.RegisterLogin;

import android.app.ProgressDialog;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;

import com.example.dwawertest.R;

public class ClientRegister extends AppCompatActivity implements View.OnClickListener {
    EditText etemail,etpassword,etphone,etfullname;
    private Button buttonSubmit,buttonlogin;
    private ProgressDialog progressDialog;
    //URL to RegisterDevice.php
    private static final String URL_REGISTER_DEVICE = "http://ictchops.me.ke/FcmExample/RegisterDevice.php";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_client_register);
        etemail = (EditText) findViewById(R.id.etemail);
        etphone = (EditText) findViewById(R.id.etphone);
        etfullname = (EditText) findViewById(R.id.etname);
        etpassword = (EditText) findViewById(R.id.etpassword);
        buttonSubmit = (Button) findViewById(R.id.buttonSubmit);
        buttonlogin = (Button) findViewById(R.id.ilogin);

        //adding listener to view
        buttonSubmit.setOnClickListener(this);
        buttonlogin.setOnClickListener(this);
    }

    /**
     * This method is to empty all input edit text
     */
    private void emptyInputEditText() {
        etemail.setText(null);
        etphone.setText(null);
        etfullname .setText(null);
        etpassword.setText(null);
    }


    private void submitForm() {

        //first validate the form then move ahead
        //if this becomes true that means validation is successfull
        String email=etemail.getText().toString().trim().toLowerCase();
        String password=etpassword.getText().toString().trim().toLowerCase();
        String fullname=etfullname.getText().toString().trim().toLowerCase();
        String phone=etphone.getText().toString().trim().toLowerCase();
        String type="register";
        Backgroundtask backgroundtask=new Backgroundtask(this);
        backgroundtask.execute(type,email,password,phone,fullname);
        emptyInputEditText();

    }

    private void login() {
        startActivity(new Intent(this,ClientLogins.class));

    }


    @Override
    public void onClick(View view) {
        if (view == buttonSubmit) {
            submitForm();
        }else if(view==buttonlogin){
            login();
        }
    }
}
