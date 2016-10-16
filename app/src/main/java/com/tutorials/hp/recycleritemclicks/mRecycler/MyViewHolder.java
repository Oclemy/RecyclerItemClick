package com.tutorials.hp.recycleritemclicks.mRecycler;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.tutorials.hp.recycleritemclicks.R;

/**
 * Created by Oclemy on 9/13/2016 for ProgrammingWizards Channel and http://www.camposha.com.
 */
public class MyViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

        TextView nametxt;
        ItemClickListener itemClickListener;

        public MyViewHolder(View itemView) {
            super(itemView);

            nametxt= (TextView) itemView.findViewById(R.id.nameTxt);
            itemView.setOnClickListener(this);
        }


    @Override
    public void onClick(View view) {
        this.itemClickListener.onItemClick(this.getLayoutPosition());
    }

    public void setItemClickListener(ItemClickListener itemClickListener)
    {
        this.itemClickListener=itemClickListener;
    }
}
