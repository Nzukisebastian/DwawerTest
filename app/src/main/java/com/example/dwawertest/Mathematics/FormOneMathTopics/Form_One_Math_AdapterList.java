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

                String title=mlist.getTitle();
                if(title=="Algebraic expressions"){
                    final String url="http://mtaani-academy.co.ke/mtaani/form_one_maths_algebraic_expressions.php";
                    Intent i=new Intent(context, Client_Reports_Screen.class);
                    i.putExtra("title",url);
                    context.startActivity(i);
                }else if(title=="Angles and plane figures"){
                    final String url="http://mtaani-academy.co.ke/mtaani/angles_and_plane_figures.php";
                    Intent i=new Intent(context, Client_Reports_Screen.class);
                    i.putExtra("title",url);
                    context.startActivity(i);
                }
                else if(title=="Area"){
                    final String url="http://mtaani-academy.co.ke/mtaani/form_one_area.php";
                    Intent i=new Intent(context, Client_Reports_Screen.class);
                    i.putExtra("title",url);
                    context.startActivity(i);
                }
                else if(title=="Commercial arithmetic"){
                    final String url="http://mtaani-academy.co.ke/mtaani/form_one_commercial_arithmetic.php";
                    Intent i=new Intent(context, Client_Reports_Screen.class);
                    i.putExtra("title",url);
                    context.startActivity(i);
                }
                else if(title=="Common solids"){
                    final String url="http://mtaani-academy.co.ke/mtaani/form_one_common_solids.php";
                    Intent i=new Intent(context, Client_Reports_Screen.class);
                    i.putExtra("title",url);
                    context.startActivity(i);
                }
                else if(title=="Coordinates and graphs"){
                    final String url="http://mtaani-academy.co.ke/mtaani/form_one_coordinates_and_graphs.php";
                    Intent i=new Intent(context, Client_Reports_Screen.class);
                    i.putExtra("title",url);
                    context.startActivity(i);
                }
                else if(title=="Decimals"){
                    final String url="http://mtaani-academy.co.ke/mtaani/form_one_decimals.php";
                    Intent i=new Intent(context, Client_Reports_Screen.class);
                    i.putExtra("title",url);
                    context.startActivity(i);
                }
                else if(title=="Divisibility test"){
                    final String url="http://mtaani-academy.co.ke/mtaani/%20%09form_one_divisibility_test.php";
                    Intent i=new Intent(context, Client_Reports_Screen.class);
                    i.putExtra("title",url);
                    context.startActivity(i);
                }
                else if(title=="Factors"){
                    final String url="http://mtaani-academy.co.ke/mtaani/form_one_factors.php";
                    Intent i=new Intent(context, Client_Reports_Screen.class);
                    i.putExtra("title",url);
                    context.startActivity(i);
                }
                else if(title=="Fractions"){
                    final String url="http://mtaani-academy.co.ke/mtaani/form_one_fractions.php";
                    Intent i=new Intent(context, Client_Reports_Screen.class);
                    i.putExtra("title",url);
                    context.startActivity(i);
                }
                else if(title=="Geometric construction"){
                    final String url="http://mtaani-academy.co.ke/mtaani/form_one_geometry.php";
                    Intent i=new Intent(context, Client_Reports_Screen.class);
                    i.putExtra("title", url);
                    context.startActivity(i);
                }
                else if(title=="Greatest common divisor"){
                    final String url="http://mtaani-academy.co.ke/mtaani/form_one_gcd.php";
                    Intent i=new Intent(context, Client_Reports_Screen.class);
                    i.putExtra("title",url);
                    context.startActivity(i);
                }
                else if(title=="Integers"){
                    final String url="http://mtaani-academy.co.ke/mtaani/form_one_integers.php";
                    Intent i=new Intent(context, Client_Reports_Screen.class);
                    i.putExtra("title",url);
                    context.startActivity(i);
                }
                else if(title=="Least common multiples"){
                    final String url="http://mtaani-academy.co.ke/mtaani/form_one_lcm.php";
                    Intent i=new Intent(context, Client_Reports_Screen.class);
                    i.putExtra("title",url);
                    context.startActivity(i);
                }

                 else if(title=="Length"){
                    final String url=" http://mtaani-academy.co.ke/mtaani/form_one_length.php";
                    Intent i=new Intent(context, Client_Reports_Screen.class);
                    i.putExtra("title",url);
                    context.startActivity(i);
                }
                else if(title=="Mass weight and density"){
                    final String url="http://mtaani-academy.co.ke/mtaani/form_one_mass_and_density.php";
                    Intent i=new Intent(context, Client_Reports_Screen.class);
                    i.putExtra("title",url);
                    context.startActivity(i);
                }
                else if(title=="Natural numbers"){
                    final String url="http://mtaani-academy.co.ke/mtaani/form_one_natural_numbers.php";
                    Intent i=new Intent(context, Client_Reports_Screen.class);
                    i.putExtra("title",url);
                    context.startActivity(i);
                }
                else if(title=="Rate, ratio, proportion and percentage"){
                    final String url="http://mtaani-academy.co.ke/mtaani/form_one_ratio_and_proportion.php";
                    Intent i=new Intent(context, Client_Reports_Screen.class);
                    i.putExtra("title",url);
                    context.startActivity(i);
                }
                else if(title=="Scale drawing"){
                    final String url="http://mtaani-academy.co.ke/mtaani/form_one_scale_drawing.php";
                    Intent i=new Intent(context, Client_Reports_Screen.class);
                    i.putExtra("title",url);
                    context.startActivity(i);
                }
                else if(title=="Squares and square roots"){
                    final String url="http://mtaani-academy.co.ke/mtaani/form_one_square_roots.php";
                    Intent i=new Intent(context, Client_Reports_Screen.class);
                    i.putExtra("title",url);
                    context.startActivity(i);
                }
                else if(title=="Time"){
                    final String url="http://mtaani-academy.co.ke/mtaani/form_one_time.php";
                    Intent i=new Intent(context, Client_Reports_Screen.class);
                    i.putExtra("title",url);
                    context.startActivity(i);
                }
                else if(title=="Volume and capacity"){
                    final String url="http://mtaani-academy.co.ke/mtaani/form_one_volume_and_capacity.php";
                    Intent i=new Intent(context, Client_Reports_Screen.class);
                    i.putExtra("title",url);
                    context.startActivity(i);
                }
                else if(title=="Linear equations"){
                    final String url="http://mtaani-academy.co.ke/mtaani/form_one_linear_equations.php";
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

