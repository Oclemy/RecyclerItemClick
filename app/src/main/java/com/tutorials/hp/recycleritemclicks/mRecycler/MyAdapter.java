package com.tutorials.hp.recycleritemclicks.mRecycler;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.tutorials.hp.recycleritemclicks.R;

/**
 * Created by Oclemy for ProgrammingWizards TV Channel and http://www.camposha.info.
 * - Our adapter class.
 * - Derives from RecyclerView.Adapter<MyViewHolder>.
 * - MyViewHolder is our custom viewholder class.
 * - Here we: inflate our model xml layout to viewitems and recycle it, bind data to these viewitems.
 * - The data we bind is passed to us via constructor.
 * - Apart from the data being passed us, we are also passed a Context object that can help us during inflation of model layout.
 * - Being that we derive from RecyclerView.Adapter, we override getItemCount() which returns total count of our data, onCreateViewHolder()
 * which creates and returns our viewholder object, and onBindViewHolder() where we bind data to our views.
 */
public class MyAdapter extends RecyclerView.Adapter<MyViewHolder> {
    Context c;
    String[] spacecrafts;

    public MyAdapter(Context c, String[] spacecrafts) {
        this.c = c;
        this.spacecrafts = spacecrafts;
    }

    //INITIALIZE VH
    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.model, parent, false);
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
