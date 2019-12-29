package com.example.dwawertest.SubjectCategories;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ProgressBar;

import com.example.dwawertest.R;

import java.util.ArrayList;
import java.util.List;

public class GalleryActivity extends AppCompatActivity {
    RecyclerView mRecyclerview;
    RecyclerView.Adapter mAdapter;
    RecyclerView.LayoutManager mManager;
    private GridLayoutManager layoutManager;
    List<Details> mListitems;
    ProgressBar progressBar;
    public GalleryActivity(){
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gallery);
        mRecyclerview=(RecyclerView)findViewById(R.id.recyclerTemp);
        progressBar=(ProgressBar)findViewById(R.id.pb);
        mListitems=new ArrayList<>();
        layoutManager=new GridLayoutManager(this,2);
        mRecyclerview.setHasFixedSize(true);
        mRecyclerview.setLayoutManager(layoutManager);
        mAdapter=new AdapterListdetails(mListitems,this);
        mRecyclerview.setAdapter(mAdapter);
        request();
    }

    private void request(){
        progressBar.setVisibility(View.VISIBLE);
        //mListitems=new ArrayList<>();
        // model.setTitle(data.getString("title"));
        mListitems.add(new Details("MATHEMATICS","IMAGE 1",R.drawable.maths));
        mListitems.add(new Details("ENGLISH","IMAGE 2", R.drawable.eng));
        mListitems.add(new Details("KISWAHILI","IMAGE 4",R.drawable.kisw));
        mListitems.add(new Details("PHYSICS","IMAGE 3",R.drawable.phyc));
        mListitems.add(new Details("CHEMISTRY","IMAGE 4",R.drawable.chem));
        mListitems.add(new Details("BIOLOGY","IMAGE 4",R.drawable.bio));

        progressBar.setVisibility(View.GONE);
    }
}
