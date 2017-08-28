package com.tutorials.hp.recycleritemclicks;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import com.tutorials.hp.recycleritemclicks.mRecycler.MyAdapter;
/*
- Our MainActivity class.
- Derives from AppCompatActivity which resides in the support library.
- Methods: onCreate().
- Inflated From content_main.xml using the setContentView() method.
- The views we use are RecyclerView.
- Reference RecyclerView from our layout specification using findViewById().
- Instantiate adapter and set it to RecyclerView.
 */
public class MainActivity extends AppCompatActivity {
    /*
    DECALARATIONS
     */
    RecyclerView rv;
    MyAdapter adapter;
    String[] spacecrafts={
            "Casini","Challenger","Spirit","Opportunity","Curiosity","Enterprise","Pioneer","Spitzer","Voyager",
            "Rosetter","Columbia","Apollo 15","Apollo 17","Kepler"
    };
    /*
    WHEN ACTIVITY IS CREATED.
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);

        //RFERENCE VIEWS
        rv = (RecyclerView) findViewById(R.id.rv);
        //RECYCLER PROPERTIES
        rv.setLayoutManager(new LinearLayoutManager(this));
        //ADAPTER
        adapter = new MyAdapter(this, spacecrafts);
        rv.setAdapter(adapter);

    }
}
