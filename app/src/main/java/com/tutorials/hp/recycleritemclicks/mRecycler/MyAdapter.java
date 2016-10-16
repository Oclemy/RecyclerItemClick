package com.tutorials.hp.recycleritemclicks.mRecycler;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Filter;
import android.widget.Filterable;
import android.widget.Toast;


import com.tutorials.hp.recycleritemclicks.R;

import java.util.ArrayList;

/**
 * Created by Oclemy on 9/13/2016 for ProgrammingWizards Channel and http://www.camposha.com.
 */
public class MyAdapter extends RecyclerView.Adapter<MyViewHolder>  {

    Context c;
    String[] spacecrafts;

    public MyAdapter(Context c, String[] spacecrafts) {
        this.c = c;
        this.spacecrafts = spacecrafts;

    }

    //INITIALIZE VH
    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v= LayoutInflater.from(parent.getContext()).inflate(R.layout.model,parent,false);

        return new MyViewHolder(v);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {

        //BIND DATA
        holder.nametxt.setText(spacecrafts[position]);

        //ITEM CLICK
        holder.setItemClickListener(new ItemClickListener() {
            @Override
            public void onItemClick(int pos) {
                Toast.makeText(c, spacecrafts[pos], Toast.LENGTH_SHORT).show();
            }
        });

    }

    //TOTAL NUM
    @Override
    public int getItemCount() {
        return spacecrafts.length;
    }


}
