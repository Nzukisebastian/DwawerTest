package com.example.dwawertest.Mathematics.KCSE_REVISION_MATHS;

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
import com.example.dwawertest.Mathematics.FormFourMathTopics.Form_Four_Math_AdapterList;
import com.example.dwawertest.Mathematics.FormFourMathTopics.Form_Four_Math_Model;
import com.example.dwawertest.R;

import java.util.List;

public class Math_Kcse_AdapterList extends RecyclerView.Adapter<Math_Kcse_AdapterList.HolderItem>  {

    List<Math_Kcse_Model> mListItem;
    Context context;
    public Math_Kcse_AdapterList(List<Math_Kcse_Model> mListItem, Context context) {
        this.mListItem = mListItem;
        this.context = context;}

    @Override
    public Math_Kcse_AdapterList.HolderItem onCreateViewHolder(ViewGroup parent, int viewType) {
        View layout= LayoutInflater.from(parent.getContext()).inflate(R.layout.form_one_math_topics, parent,false);
        Math_Kcse_AdapterList.HolderItem holder=new Math_Kcse_AdapterList.HolderItem(layout);
        return holder;
    }
    @Override
    public void onBindViewHolder(final Math_Kcse_AdapterList.HolderItem holder, final int position) {final Math_Kcse_Model mlist=mListItem.get(position);
        holder.title.setText(mlist.getTitle());
        holder.description.setText(mlist.getDescription());
        holder.thubnail.setImageResource(mlist.getImg());
        holder.cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String title=mlist.getTitle();
                if(title.equals("KCSE 2019")){
                    final String url="http://mtaani-academy.co.ke/mtaani/KCSE_Revision/KCSE_Revision_2018/maths/math_kcse_2019.php";
                    Intent i=new Intent(context, Client_Reports_Screen.class);
                    i.putExtra("title",url);
                    context.startActivity(i);
                }else if(title.equals("KCSE 2018")){
                    final String url="http://mtaani-academy.co.ke/mtaani/KCSE_Revision/KCSE_Revision_2018/maths/math_2018_math.php";
                    Intent i=new Intent(context, Client_Reports_Screen.class);
                    i.putExtra("title",url);
                    context.startActivity(i);
                }
                else if(title.equals("KCSE 2017")){
                    final String url="http://mtaani-academy.co.ke/mtaani/KCSE_Revision/KCSE_Revision_2018/maths/math_kcse_2017.php";
                    Intent i=new Intent(context, Client_Reports_Screen.class);
                    i.putExtra("title",url);
                    context.startActivity(i);
                }
                else if(title=="KCSE 2016"){
                    final String url="http://mtaani-academy.co.ke/mtaani/KCSE_Revision/KCSE_Revision_2018/maths/math_kcse_2016.php";
                    Intent i=new Intent(context, Client_Reports_Screen.class);
                    i.putExtra("title",url);
                    context.startActivity(i);
                }
                else if(title=="KCSE 2015"){
                    final String url="http://mtaani-academy.co.ke/mtaani/KCSE_Revision/KCSE_Revision_2018/maths/math_kcse_2015.php";
                    Intent i=new Intent(context, Client_Reports_Screen.class);
                    i.putExtra("title",url);
                    context.startActivity(i);
                }
                else if(title=="KCSE 2014"){
                    final String url="http://mtaani-academy.co.ke/mtaani/KCSE_Revision/KCSE_Revision_2018/maths/math_kcse_2014.php";
                    Intent i=new Intent(context, Client_Reports_Screen.class);
                    i.putExtra("title",url);
                    context.startActivity(i);
                }
                else if(title=="KCSE 2013"){
                    final String url="http://mtaani-academy.co.ke/mtaani/KCSE_Revision/KCSE_Revision_2018/maths/math_kcse_2013.php";
                    Intent i=new Intent(context, Client_Reports_Screen.class);
                    i.putExtra("title",url);
                    context.startActivity(i);
                }
                else if(title=="KCSE 2012"){
                    final String url="http://mtaani-academy.co.ke/mtaani/KCSE_Revision/KCSE_Revision_2018/maths/math_kcse_2012.php";
                    Intent i=new Intent(context, Client_Reports_Screen.class);
                    i.putExtra("title",url);
                    context.startActivity(i);
                }
                else if(title=="KCSE 2011"){
                    final String url="http://mtaani-academy.co.ke/mtaani/KCSE_Revision/KCSE_Revision_2018/maths/math_kcse_2011.php";
                    Intent i=new Intent(context, Client_Reports_Screen.class);
                    i.putExtra("title",url);
                    context.startActivity(i);
                }
                else if(title=="KCSE 2010"){
                    final String url="http://mtaani-academy.co.ke/mtaani/KCSE_Revision/KCSE_Revision_2018/maths/math_kcse_2010.php";
                    Intent i=new Intent(context, Client_Reports_Screen.class);
                    i.putExtra("title",url);
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
            title=(TextView) v.findViewById(R.id.form_one_math_title);
            description=(TextView) v.findViewById(R.id.form_one_math_description);
            thubnail =(ImageView) v.findViewById(R.id.form_one_math_img_cover);
            cardView=(CardView)v.findViewById(R.id.form_one_math_cardview);
        }
    }
}
