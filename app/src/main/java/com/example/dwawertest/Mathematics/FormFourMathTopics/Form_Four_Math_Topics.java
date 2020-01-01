package com.example.dwawertest.Mathematics.FormFourMathTopics;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ProgressBar;


import com.example.dwawertest.R;

import java.util.ArrayList;
import java.util.List;

public class Form_Four_Math_Topics extends AppCompatActivity {

  RecyclerView mRecyclerview;
  RecyclerView.Adapter mAdapter;
  RecyclerView.LayoutManager mManager;
  private LinearLayoutManager layoutManager;
  List<Form_Four_Math_Model > mListitems;
  ProgressBar progressBar;
  public  Form_Four_Math_Topics(){
  }
  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_form__four__math__topics);
    getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    // ImageView imageView=(ImageView)findViewById(R.id.image_list);
    mRecyclerview=(RecyclerView)findViewById(R.id.form_four_topics_recycler);
    progressBar=(ProgressBar)findViewById(R.id.form_four_topics_pb);
    mListitems=new ArrayList<>();
    layoutManager=new LinearLayoutManager(this);
    mRecyclerview.setHasFixedSize(true);
    mRecyclerview.setLayoutManager(layoutManager);
    mAdapter=new Form_Four_Math_AdapterList(mListitems,this);
    mRecyclerview.setAdapter(mAdapter);
    request();
  }

  private void request(){
    progressBar.setVisibility(View.VISIBLE);
    //mListitems=new ArrayList<>();
    // model.setTitle(data.getString("title"));
    mListitems.add(new Form_Four_Math_Model("Matrices and Transformations","",R.drawable.matrix));
    mListitems.add(new Form_Four_Math_Model("Statistics","", R.drawable.statistics));
    mListitems.add(new Form_Four_Math_Model("Loci","",R.drawable.loci));
    mListitems.add(new Form_Four_Math_Model("Trigonometry","",R.drawable.trigonometric));
    mListitems.add(new Form_Four_Math_Model("Three Dimensional Geometry","",R.drawable.three_dimension));
    mListitems.add(new Form_Four_Math_Model("Longitudes and Latitudes","",R.drawable.loglat));
    mListitems.add(new Form_Four_Math_Model("Linear Programming","",R.drawable.linearprog));
    mListitems.add(new Form_Four_Math_Model("Differentiation","",R.drawable.differentiation));
    mListitems.add(new Form_Four_Math_Model("Area Approximation","",R.drawable.area_approximation));
    mListitems.add(new Form_Four_Math_Model("Integration","",R.drawable.integration));

    progressBar.setVisibility(View.GONE);
  }
}
