package com.tutorials.hp.recycleritemclicks.mRecycler;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.tutorials.hp.recycleritemclicks.R;

/**
 * Created by Oclemy for ProgrammingWizards TV Channel and http://www.camposha.info.
  - Our MyViewHolder class.
  - Our ViewHolder class.
  - This class will hold views to be recycled for each viewitem by our adapter.
  - This class implements View.OnClickListener interface, hence our custom view shall be clickable.
  - Methods: onClick(),setItemClickListener().
  - In this case we have one textview.
  - A view object shall be passed via constructor and we use it to reference our widgets using findViewById.
 */
public class MyViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
    TextView nametxt;
    ItemClickListener itemClickListener;

    public MyViewHolder(View itemView) {
        super(itemView);

        nametxt = (TextView) itemView.findViewById(R.id.nameTxt);
        itemView.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        this.itemClickListener.onItemClick(this.getLayoutPosition());
    }

    public void setItemClickListener(ItemClickListener itemClickListener) {
        this.itemClickListener = itemClickListener;
    }
}
