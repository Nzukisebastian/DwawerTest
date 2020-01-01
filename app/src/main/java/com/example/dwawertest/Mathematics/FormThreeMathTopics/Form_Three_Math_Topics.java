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
        mListitems.add(new Form_Three_Math_Model("Quadratic Expressions","",R.drawable.vlcn));
        mListitems.add(new Form_Three_Math_Model("Approximation and Errors","", R.drawable.vlcn));
        mListitems.add(new Form_Three_Math_Model("Trigonometry","",R.drawable.vlcn));
        mListitems.add(new Form_Three_Math_Model("SURDS","",R.drawable.vlcn));
        mListitems.add(new Form_Three_Math_Model("Further Logarithms","",R.drawable.vlcn));
        mListitems.add(new Form_Three_Math_Model("Commercial Arithmetic","",R.drawable.vlcn));
        mListitems.add(new Form_Three_Math_Model("Circle Chords and tangents","",R.drawable.vlcn));
        mListitems.add(new Form_Three_Math_Model("Matrices","",R.drawable.vlcn));
        mListitems.add(new Form_Three_Math_Model("Formulae and Variations","",R.drawable.vlcn));
        mListitems.add(new Form_Three_Math_Model("Sequences and Series","",R.drawable.vlcn));
        mListitems.add(new Form_Three_Math_Model("Vectors","",R.drawable.vlcn));
        mListitems.add(new Form_Three_Math_Model("Binomial Expansions","",R.drawable.vlcn));
        mListitems.add(new Form_Three_Math_Model("Probability","",R.drawable.vlcn));
        mListitems.add(new Form_Three_Math_Model("Compound Proportions and Rates of Work","",R.drawable.vlcn));
        mListitems.add(new Form_Three_Math_Model("Graphical Methods","",R.drawable.vlcn));

        progressBar.setVisibility(View.GONE);
    }
}
