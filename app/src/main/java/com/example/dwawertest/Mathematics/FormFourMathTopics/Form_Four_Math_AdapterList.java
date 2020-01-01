package com.example.dwawertest.Mathematics.FormFourMathTopics;

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


import java.util.List;


public class Form_Four_Math_AdapterList  extends RecyclerView.Adapter<Form_Four_Math_AdapterList.HolderItem> {

  List<Form_Four_Math_Model> mListItem;
  Context context;
  public Form_Four_Math_AdapterList(List<Form_Four_Math_Model> mListItem, Context context) {
    this.mListItem = mListItem;
    this.context = context;}

  @Override
  public HolderItem onCreateViewHolder(ViewGroup parent, int viewType) {
    View layout= LayoutInflater.from(parent.getContext()).inflate(R.layout.form_one_math_topics, parent,false);
    HolderItem holder=new HolderItem(layout);
    return holder;
  }
  @Override
  public void onBindViewHolder(final HolderItem holder, final int position) {final Form_Four_Math_Model mlist=mListItem.get(position);
    holder.title.setText(mlist.getTitle());
    holder.description.setText(mlist.getDescription());
    holder.thubnail.setImageResource(mlist.getImg());
    holder.cardView.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View v) {
        String title=mlist.getTitle();
        if(title.equals("Matrices and Transformations")){
          final String url="http://mtaani-academy.co.ke/mtaani/form_four_Matrices_and_Transformations.php";
          Intent i=new Intent(context, Client_Reports_Screen.class);
         i.putExtra("title",url);
          context.startActivity(i);
        }else if(title.equals("Statistics")){
          final String url="http://mtaani-academy.co.ke/mtaani/form_four_Statistics.php";
          Intent i=new Intent(context, Client_Reports_Screen.class);
          i.putExtra("title",url);
          context.startActivity(i);
        }
        else if(title.equals("Loci")){
          final String url="http://mtaani-academy.co.ke/mtaani/form_four_Loci.php";
          Intent i=new Intent(context, Client_Reports_Screen.class);
          i.putExtra("title",url);
          context.startActivity(i);
        }
        else if(title=="Trigonometry"){
          final String url="http://mtaani-academy.co.ke/mtaani/form_four_Trigonometry.php";
          Intent i=new Intent(context, Client_Reports_Screen.class);
          i.putExtra("title",url);
          context.startActivity(i);
        }
        else if(title=="Three Dimensional Geometry"){
          final String url="http://mtaani-academy.co.ke/mtaani/form_four_Three_Dimensional_Geometry.php";
          Intent i=new Intent(context, Client_Reports_Screen.class);
          i.putExtra("title",url);
          context.startActivity(i);
        }
        else if(title=="Longitudes and Latitudes"){
          final String url="http://mtaani-academy.co.ke/mtaani/form_four_Longitudes%20and%20Latitudes.php";
          Intent i=new Intent(context, Client_Reports_Screen.class);
          i.putExtra("title",url);
          context.startActivity(i);
        }
        else if(title=="Linear Programming"){
          final String url="http://mtaani-academy.co.ke/mtaani/form_four_Linear%20Programming.php";
          Intent i=new Intent(context, Client_Reports_Screen.class);
          i.putExtra("title",url);
          context.startActivity(i);
        }
        else if(title=="Differentiation"){
          final String url="http://mtaani-academy.co.ke/mtaani/form_four_differentiation.php";
          Intent i=new Intent(context, Client_Reports_Screen.class);
          i.putExtra("title",url);
          context.startActivity(i);
        }
        else if(title=="Area Approximation"){
          final String url="http://mtaani-academy.co.ke/mtaani/form_four_Area%20Approximation.php";
          Intent i=new Intent(context, Client_Reports_Screen.class);
          i.putExtra("title",url);
          context.startActivity(i);
        }
        else if(title=="Integration"){
          final String url="http://mtaani-academy.co.ke/mtaani/form_four_Integration.php";
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
