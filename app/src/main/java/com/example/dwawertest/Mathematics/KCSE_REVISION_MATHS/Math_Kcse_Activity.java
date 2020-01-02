package com.example.dwawertest.Mathematics.KCSE_REVISION_MATHS;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ProgressBar;

import com.example.dwawertest.Mathematics.FormFourMathTopics.Form_Four_Math_AdapterList;
import com.example.dwawertest.Mathematics.FormFourMathTopics.Form_Four_Math_Model;
import com.example.dwawertest.R;

import java.util.ArrayList;
import java.util.List;

public class Math_Kcse_Activity extends AppCompatActivity {

    RecyclerView mRecyclerview;
    RecyclerView.Adapter mAdapter;
    RecyclerView.LayoutManager mManager;
    private LinearLayoutManager layoutManager;
    List<Math_Kcse_Model> mListitems;
    ProgressBar progressBar;
    public  Math_Kcse_Activity(){
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_math_kcse);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        // ImageView imageView=(ImageView)findViewById(R.id.image_list);
        mRecyclerview=(RecyclerView)findViewById(R.id.kcse_math_recycler);
        progressBar=(ProgressBar)findViewById(R.id.kcse_math_pb);
        mListitems=new ArrayList<>();
        layoutManager=new LinearLayoutManager(this);
        mRecyclerview.setHasFixedSize(true);
        mRecyclerview.setLayoutManager(layoutManager);
        mAdapter=new Math_Kcse_AdapterList(mListitems,this);
        mRecyclerview.setAdapter(mAdapter);
        request();
    }

    private void request(){
        progressBar.setVisibility(View.VISIBLE);
        //mListitems=new ArrayList<>();
        // model.setTitle(data.getString("title"));
        mListitems.add(new Math_Kcse_Model("KCSE 2019","",R.drawable.vlcn));
        mListitems.add(new Math_Kcse_Model("KCSE 2018","", R.drawable.vlcn));
        mListitems.add(new Math_Kcse_Model("KCSE 2017","",R.drawable.vlcn));
        mListitems.add(new Math_Kcse_Model("KCSE 2016","",R.drawable.vlcn));
        mListitems.add(new Math_Kcse_Model("KCSE 2015","",R.drawable.vlcn));
        mListitems.add(new Math_Kcse_Model("KCSE 2014","",R.drawable.vlcn));
        mListitems.add(new Math_Kcse_Model("KCSE 2013","",R.drawable.vlcn));
        mListitems.add(new Math_Kcse_Model("KCSE 2012","",R.drawable.vlcn));
        mListitems.add(new Math_Kcse_Model("KCSE 2011","",R.drawable.vlcn));
        mListitems.add(new Math_Kcse_Model("KCSE 2010","",R.drawable.vlcn));

        progressBar.setVisibility(View.GONE);
    }
}
