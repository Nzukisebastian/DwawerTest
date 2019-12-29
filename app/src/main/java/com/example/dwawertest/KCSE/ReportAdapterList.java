package com.example.dwawertest.KCSE;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.example.dwawertest.Mathematics.Form_One_Full_Video;
import com.example.dwawertest.R;
import com.example.dwawertest.activity.Full_Video;

import java.util.List;

public class ReportAdapterList extends RecyclerView.Adapter<ReportAdapterList.HolderItem> {

    List<ReportModelList> mListItem;
    Context context;
    public ReportAdapterList(List<ReportModelList> mListItem, Context context) {
        this.mListItem = mListItem;
        this.context = context;}

    @Override
    public HolderItem onCreateViewHolder(ViewGroup parent, int viewType) {
        View layout= LayoutInflater.from(parent.getContext()).inflate(R.layout.screenlayout,parent,false);
        HolderItem holder=new HolderItem(layout);
        return holder;
    }
    @Override
    public void onBindViewHolder(final HolderItem holder, final int position) {
        final ReportModelList mlist=mListItem.get(position);
        holder.description.setText(mlist.getDescription());
        holder.url.setText(mlist.getUrl());

        holder.cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(context, Full_Video.class);
                intent.putExtra("url",mlist.getUrl());
                intent.putExtra("description",mlist.getDescription());
                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return mListItem.size();
    }

    public class HolderItem extends RecyclerView.ViewHolder{
        ImageView thubnail;
        TextView url,description,place;
        CardView cardView;
        public ImageView imgs;

        public HolderItem(View v) {
            super(v);
            url=(TextView) v.findViewById(R.id.url);
            description=(TextView) v.findViewById(R.id.description);
           cardView =(CardView)v.findViewById(R.id.videocardview);
        }
    }
}

