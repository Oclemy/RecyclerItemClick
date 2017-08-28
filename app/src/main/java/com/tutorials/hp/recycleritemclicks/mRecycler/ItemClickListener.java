package com.tutorials.hp.recycleritemclicks.mRecycler;

/**
 * Created by Oclemy for ProgrammingWizards TV Channel and http://www.camposha.info.
 - Our ItemClickIListener interface.
 - Defines signature for our RecyclerView onItemClick() event handler, which is an abstract method.
 - The event handler will take the clicked viewitem position.
 */
public interface ItemClickListener {
    //ABSTRACT METHOD
    void onItemClick(int pos);
}
