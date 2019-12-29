package com.example.dwawertest.Mathematics.FormThreeMathTopics;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ProgressBar;

import com.example.dwawertest.R;

import java.util.ArrayList;
import java.util.List;

public class Form_Three_Math_Topics extends AppCompatActivity {

    RecyclerView mRecyclerview;
    RecyclerView.Adapter mAdapter;
    RecyclerView.LayoutManager mManager;
    private LinearLayoutManager layoutManager;
    List<Form_Three_Math_Model> mListitems;
    ProgressBar progressBar;
    public Form_Three_Math_Topics(){
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form__three__math__topics);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        mRecyclerview=(RecyclerView)findViewById(R.id.form_three_topics_recycler);
        progressBar=(ProgressBar)findViewById(R.id.form_three_topics_pb);
        mListitems=new ArrayList<>();
        layoutManager=new LinearLayoutManager(this);
        mRecyclerview.setHasFixedSize(true);
        mRecyclerview.setLayoutManager(layoutManager);
        mAdapter=new Form_Three_Math_AdapterList(mListitems,this);
        mRecyclerview.setAdapter(mAdapter);
        request();
    }

    private void request(){
        progressBar.setVisibility(View.VISIBLE);
        //mListitems=new ArrayList<>();
        // model.setTitle(data.getString("title"));
        mListitems.add(new Form_Three_Math_Model("Algebraic expressions","",R.drawable.algebra1));
        mListitems.add(new Form_Three_Math_Model("Angles and plane figures","", R.drawable.angle));
        mListitems.add(new Form_Three_Math_Model("Area","",R.drawable.area));
        mListitems.add(new Form_Three_Math_Model("Commercial arithmetic","",R.drawable.money));
        mListitems.add(new Form_Three_Math_Model("Common solids","",R.drawable.vol));
        mListitems.add(new Form_Three_Math_Model("Coordinates and graphs","",R.drawable.geometry));
        mListitems.add(new Form_Three_Math_Model("Decimals","",R.drawable.decimals));
        mListitems.add(new Form_Three_Math_Model("Divisibility test","",R.drawable.divisible));
        mListitems.add(new Form_Three_Math_Model("Factors","",R.drawable.factor));
        mListitems.add(new Form_Three_Math_Model("Fractions","",R.drawable.fractions));
        mListitems.add(new Form_Three_Math_Model("Geometric construction","",R.drawable.geometry));
        mListitems.add(new Form_Three_Math_Model("Greatest common divisor","",R.drawable.gcd));
        mListitems.add(new Form_Three_Math_Model("Integers","",R.drawable.integer));
        mListitems.add(new Form_Three_Math_Model("Least common multiples","",R.drawable.gcd));
        mListitems.add(new Form_Three_Math_Model("Length","",R.drawable.lengths));
        mListitems.add(new Form_Three_Math_Model("Mass weight and density","",R.drawable.mass));
        mListitems.add(new Form_Three_Math_Model("Natural numbers","",R.drawable.integer));
        mListitems.add(new Form_Three_Math_Model("Rate, ratio, proportion and percentage","",R.drawable.ratio));
        mListitems.add(new Form_Three_Math_Model("Scale drawing","",R.drawable.similar));
        mListitems.add(new Form_Three_Math_Model("Squares and square roots","",R.drawable.root));
        mListitems.add(new Form_Three_Math_Model("Time","",R.drawable.time));
        mListitems.add(new Form_Three_Math_Model("Volume and capacity","",R.drawable.volu));
        mListitems.add(new Form_Three_Math_Model("Linear equations","",R.drawable.linear));


        progressBar.setVisibility(View.GONE);
    }
}