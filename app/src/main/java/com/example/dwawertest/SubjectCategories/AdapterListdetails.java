package com.example.dwawertest.SubjectCategories;

import android.content.Context;
import android.content.Intent;
import android.support.design.widget.BottomSheetDialog;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.dwawertest.Mathematics.FormFourMathTopics.Form_Four_Math_Topics;
import com.example.dwawertest.Mathematics.FormOneMathTopics.Form_One_Math_Topics;
import com.example.dwawertest.Mathematics.FormThreeMathTopics.Form_Three_Math_Topics;
import com.example.dwawertest.Mathematics.FormTwoMathTopics.Form_Two_Math_Activity;
import com.example.dwawertest.R;

import java.util.List;

public class AdapterListdetails extends RecyclerView.Adapter<AdapterListdetails.HolderItem>{
    List<Details> mListItem;
    View modelBottomSheet;
    Context context;
    public AdapterListdetails(List<Details> mListItem, Context context) {
        this.mListItem = mListItem;
        this.context = context;}

    @Override
    public HolderItem onCreateViewHolder(ViewGroup parent, int viewType) {
        View layout= LayoutInflater.from(parent.getContext()).inflate(R.layout.layout_subjecttypes,parent,false);
        HolderItem holder=new HolderItem(layout);
        return holder;
    }
    @Override
    public void onBindViewHolder(final HolderItem holder, final int position) {final Details mlist=mListItem.get(position);
        holder.title.setText(mlist.getTitle());
        holder.description.setText(mlist.getDescription());
        holder.thubnail.setImageResource(mlist.getImg());
        holder.cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String subject=mlist.getTitle();
                if(subject=="MATHEMATICS"){


                    modelBottomSheet=LayoutInflater.from(context).inflate(R.layout.math_education_level,null);
                    BottomSheetDialog dialog=new BottomSheetDialog(context);
                    dialog.setContentView(modelBottomSheet);
                    dialog.show();}
                Button f1 = (Button)modelBottomSheet.findViewById(R.id.btn_f1);
                Button f2 = (Button)modelBottomSheet.findViewById(R.id.btn_f2);
                Button f3 = (Button)modelBottomSheet.findViewById(R.id.btn_f3);
                Button f4 = (Button)modelBottomSheet.findViewById(R.id.btn_f4);
                f1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent i=new Intent(context, Form_One_Math_Topics.class);
                        context.startActivity(i);
                    }
                });
                f2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent i=new Intent(context, Form_Two_Math_Activity.class);
                        context.startActivity(i);
                    }
                });
                f3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent i=new Intent(context, Form_Three_Math_Topics.class);
                        context.startActivity(i);
                    }
                });
                f4.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent i=new Intent(context, Form_Four_Math_Topics.class);
                        context.startActivity(i);
                    }
                });
            }
        });
    }
    @Override
    public int getItemCount() {
        return mListItem.size();
    }

    public class HolderItem extends RecyclerView.ViewHolder{
        ImageView thubnail;
        TextView title,description;
        CardView cardView;

        public HolderItem(View v) {
            super(v);
            title=(TextView) v.findViewById(R.id.tv_title);
            description=(TextView) v.findViewById(R.id.tv_description);
            thubnail =(ImageView) v.findViewById(R.id.img_cover);
            cardView=(CardView)v.findViewById(R.id.cardview);
        }
    }
}

