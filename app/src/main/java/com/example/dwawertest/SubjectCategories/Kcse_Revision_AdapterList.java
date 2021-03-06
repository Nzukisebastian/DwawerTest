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
import com.example.dwawertest.Mathematics.KCSE_REVISION_MATHS.Math_Kcse_Activity;
import com.example.dwawertest.R;

import java.util.List;

public class Kcse_Revision_AdapterList extends RecyclerView.Adapter<Kcse_Revision_AdapterList.HolderItem> {

    List<Details> mListItem;
    View modelBottomSheet;
    Context context;
    public Kcse_Revision_AdapterList(List<Details> mListItem, Context context) {
        this.mListItem = mListItem;
        this.context = context;}

    @Override
    public Kcse_Revision_AdapterList.HolderItem onCreateViewHolder(ViewGroup parent, int viewType) {
        View layout= LayoutInflater.from(parent.getContext()).inflate(R.layout.layout_subjecttypes,parent,false);
        Kcse_Revision_AdapterList.HolderItem holder=new Kcse_Revision_AdapterList.HolderItem(layout);
        return holder;
    }
    @Override
    public void onBindViewHolder(final Kcse_Revision_AdapterList.HolderItem holder, final int position) {final Details mlist=mListItem.get(position);
        holder.title.setText(mlist.getTitle());
        holder.description.setText(mlist.getDescription());
        holder.thubnail.setImageResource(mlist.getImg());
        holder.cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                String subject=mlist.getTitle();
                if(subject=="MATHEMATICS"){
                    Intent i=new Intent(context, Math_Kcse_Activity.class);
                    context.startActivity(i);
                    }


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
