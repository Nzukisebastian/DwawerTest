package com.example.dwawertest.Mathematics.FormThreeMathTopics;

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

public class Form_Three_Math_AdapterList extends RecyclerView.Adapter<Form_Three_Math_AdapterList.HolderItem> {

  List<Form_Three_Math_Model> mListItem;
  View modelBottomSheet;
  Context context;
  public Form_Three_Math_AdapterList(List<Form_Three_Math_Model> mListItem, Context context) {
    this.mListItem = mListItem;
    this.context = context;}

  @Override
  public HolderItem onCreateViewHolder(ViewGroup parent, int viewType) {
    View layout= LayoutInflater.from(parent.getContext()).inflate(R.layout.form_one_math_topics,parent,false);
    HolderItem holder=new HolderItem(layout);
    return holder;
  }
  @Override
  public void onBindViewHolder(final HolderItem holder, final int position) {final Form_Three_Math_Model mlist=mListItem.get(position);
    holder.title.setText(mlist.getTitle());
    holder.description.setText(mlist.getDescription());
    holder.thubnail.setImageResource(mlist.getImg());
    holder.cardView.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View v) {
        String title=mlist.getTitle();
        if(title.equals("Quadratic Expressions")){
          final String url="http://mtaani-academy.co.ke/mtaani/Math_form_three_work/form_three_Quadratic_Expressions.php";
          Intent i=new Intent(context, Client_Reports_Screen.class);
          i.putExtra("title",url);
          context.startActivity(i);
        }else if(title.equals("Approximation and Errors")){
          final String url="http://mtaani-academy.co.ke/mtaani/Math_form_three_work/form_three_Approximation_and_Errors.php";
          Intent i=new Intent(context, Client_Reports_Screen.class);
          i.putExtra("title",url);
          context.startActivity(i);
        }
        else if(title.equals("Trigonometry")){
          final String url="http://mtaani-academy.co.ke/mtaani/Math_form_three_work/form_three_Trigonometry.php";
          Intent i=new Intent(context, Client_Reports_Screen.class);
          i.putExtra("title",url);
          context.startActivity(i);
        }
        else if(title=="SURDS"){
          final String url="http://mtaani-academy.co.ke/mtaani/Math_form_three_work/form_three_SURDS.php";
          Intent i=new Intent(context, Client_Reports_Screen.class);
          i.putExtra("title",url);
          context.startActivity(i);
        }
        else if(title=="Further Logarithms"){
          final String url="http://mtaani-academy.co.ke/mtaani/Math_form_three_work/form_three_Further_Logarithms.php";
          Intent i=new Intent(context, Client_Reports_Screen.class);
          i.putExtra("title",url);
          context.startActivity(i);
        }
        else if(title=="Commercial Arithmetic"){
          final String url="http://mtaani-academy.co.ke/mtaani/Math_form_three_work/form_three_Commercial_Arithmetic.php";
          Intent i=new Intent(context, Client_Reports_Screen.class);
          i.putExtra("title",url);
          context.startActivity(i);
        }
        else if(title=="Circle Chords and tangents"){
          final String url="http://mtaani-academy.co.ke/mtaani/Math_form_three_work/form_three_Circle_Chords_and_tangents.php";
          Intent i=new Intent(context, Client_Reports_Screen.class);
          i.putExtra("title",url);
          context.startActivity(i);
        }
        else if(title=="Matrices"){
          final String url="http://mtaani-academy.co.ke/mtaani/Math_form_three_work/form_three_Matrices.php";
          Intent i=new Intent(context, Client_Reports_Screen.class);
          i.putExtra("title",url);
          context.startActivity(i);
        }
        else if(title=="Formulae and Variations"){
          final String url="http://mtaani-academy.co.ke/mtaani/Math_form_three_work/form_three_Formulae_and_Variations.php";
          Intent i=new Intent(context, Client_Reports_Screen.class);
          i.putExtra("title",url);
          context.startActivity(i);
        }
        else if(title=="Sequences and Series"){
          final String url="http://mtaani-academy.co.ke/mtaani/Math_form_three_work/form_three_Sequences_and_Series.php";
          Intent i=new Intent(context, Client_Reports_Screen.class);
          i.putExtra("title",url);
          context.startActivity(i);
        }
        else if(title=="Vectors"){
          final String url="http://mtaani-academy.co.ke/mtaani/Math_form_three_work/form_three_Vectors.php";
          Intent i=new Intent(context, Client_Reports_Screen.class);
          i.putExtra("title",url);
          context.startActivity(i);
        }
        else if(title=="Binomial Expansions"){
          final String url="http://mtaani-academy.co.ke/mtaani/Math_form_three_work/form_three_Binomial_Expansions.php";
          Intent i=new Intent(context, Client_Reports_Screen.class);
          i.putExtra("title",url);
          context.startActivity(i);
        }
        else if(title=="Probability"){
          final String url="http://mtaani-academy.co.ke/mtaani/Math_form_three_work/form_three_Probability.php";
          Intent i=new Intent(context, Client_Reports_Screen.class);
          i.putExtra("title",url);
          context.startActivity(i);
        }
        else if(title=="Compound Proportions and Rates of Work"){
          final String url="http://mtaani-academy.co.ke/mtaani/Math_form_three_work/form_three_Compound_Proportions_and_Rates_of_Work.php";
          Intent i=new Intent(context, Client_Reports_Screen.class);
          i.putExtra("title",url);
          context.startActivity(i);
        }
        else if(title=="Graphical Methods"){
          final String url="http://mtaani-academy.co.ke/mtaani/Math_form_three_work/form_three_Graphical_Methods.php";
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
