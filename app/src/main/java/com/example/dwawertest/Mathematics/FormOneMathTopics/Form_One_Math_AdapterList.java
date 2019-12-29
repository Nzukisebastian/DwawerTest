package com.example.dwawertest.Mathematics.FormOneMathTopics;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.dwawertest.KCSE.Client_Reports_Screen;
import com.example.dwawertest.Mathematics.Form_One_Full_Video;
import com.example.dwawertest.R;
import com.example.dwawertest.activity.Full_Video;

import java.util.List;

public class Form_One_Math_AdapterList extends RecyclerView.Adapter<Form_One_Math_AdapterList.HolderItem>{
    List<Form_One_Math_Model> mListItem;
    Context context;
    public Form_One_Math_AdapterList(List<Form_One_Math_Model> mListItem, Context context) {
        this.mListItem = mListItem;
        this.context = context;}

    @Override
    public HolderItem onCreateViewHolder(ViewGroup parent, int viewType) {
        View layout= LayoutInflater.from(parent.getContext()).inflate(R.layout.form_one_math_topics, parent,false);
        HolderItem holder=new HolderItem(layout);
        return holder;
    }
    @Override
    public void onBindViewHolder(final HolderItem holder, final int position) {final Form_One_Math_Model mlist=mListItem.get(position);
        holder.title.setText(mlist.getTitle());
        holder.description.setText(mlist.getDescription());
        holder.thubnail.setImageResource(mlist.getImg());
        holder.cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(context, Client_Reports_Screen.class);
                context.startActivity(i);
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
            title=(TextView) v.findViewById(R.id.form_one_math_title);
            description=(TextView) v.findViewById(R.id.form_one_math_description);
            thubnail =(ImageView) v.findViewById(R.id.form_one_math_img_cover);
            cardView=(CardView)v.findViewById(R.id.form_one_math_cardview);
        }
    }
}

