package com.example.dwawertest.fragment;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;

import com.example.dwawertest.R;
import com.example.dwawertest.SubjectCategories.AdapterListdetails;
import com.example.dwawertest.SubjectCategories.Details;

import java.util.ArrayList;
import java.util.List;

public class HomeFragment extends Fragment {
    RecyclerView mRecyclerview;
    RecyclerView.Adapter mAdapter;
    RecyclerView.LayoutManager mManager;
    private GridLayoutManager layoutManager;
    List<Details> mListitems;
    ProgressBar progressBar;
    View v;
    private OnFragmentInteractionListener mListener;

    public HomeFragment() {
        // Required empty public constructor
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        v = inflater.inflate(R.layout.fragment_home, container, false);
        mRecyclerview=(RecyclerView)v.findViewById(R.id.recyclerTemp);
        progressBar=(ProgressBar)v.findViewById(R.id.pb);
        mListitems=new ArrayList<>();
        layoutManager=new GridLayoutManager(getActivity(),2);
        mRecyclerview.setHasFixedSize(true);
        mRecyclerview.setLayoutManager(layoutManager);
        mAdapter=new AdapterListdetails(mListitems,getActivity());
        mRecyclerview.setAdapter(mAdapter);
        request();
        return v;
    }

    private void request(){
        progressBar.setVisibility(View.VISIBLE);
        //mListitems=new ArrayList<>();
        // model.setTitle(data.getString("title"));
        mListitems.add(new Details("MATHEMATICS","IMAGE 1",R.drawable.volu));
        mListitems.add(new Details("ENGLISH","IMAGE 2", R.drawable.eng));
        mListitems.add(new Details("KISWAHILI","IMAGE 4",R.drawable.kisw));
        mListitems.add(new Details("PHYSICS","IMAGE 3",R.drawable.mag));
        mListitems.add(new Details("CHEMISTRY","IMAGE 4",R.drawable.chem));
        mListitems.add(new Details("BIOLOGY","IMAGE 4",R.drawable.bio));

        progressBar.setVisibility(View.GONE);
    }

    // TODO: Rename method, update argument and hook method into UI event
    public void onButtonPressed(Uri uri) {
        if (mListener != null) {
            mListener.onFragmentInteraction(uri);
        }
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
//        if (context instanceof OnFragmentInteractionListener) {
//            mListener = (OnFragmentInteractionListener) context;
//        } else {
//            throw new RuntimeException(context.toString()
//                    + " must implement OnFragmentInteractionListener");
//        }
    }

    @Override
    public void onDetach() {
        super.onDetach();
        mListener = null;
    }

    /**
     * This interface must be implemented by activities that contain this
     * fragment to allow an interaction in this fragment to be communicated
     * to the activity and potentially other fragments contained in that
     * activity.
     * <p>
     * See the Android Training lesson <a href=
     * "http://developer.android.com/training/basics/fragments/communicating.html"
     * >Communicating with Other Fragments</a> for more information.
     */
    public interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        void onFragmentInteraction(Uri uri);
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        // lstcontact=new ArrayList<>();
        //lstcontact=add(new Contact("seba",R.drawable.ic_action_call));

    }
}
