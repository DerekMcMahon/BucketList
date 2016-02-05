package com.example.android.bucketlist;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private List<String> desires;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        LinearLayoutManager linman = new LinearLayoutManager(this);
        RecyclerView bucketlist = (RecyclerView)this.findViewById(R.id.list);
        linman.setOrientation(LinearLayoutManager.VERTICAL);
        bucketlist.setLayoutManager(linman);

        initializeData();

        BucketListAdapter adapter = new BucketListAdapter(desires);
        bucketlist.setAdapter(adapter);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

    public void initializeData(){
        desires = new ArrayList<>();
        desires.add("Streak the Lawn");
        desires.add("Lighting of the Lawn");
        desires.add("Fourth year fifth");
        desires.add("Paint Beta Bridge");
        desires.add("Go to Foxfield");
        desires.add("Visit Edgar Allen Poe's room");
        desires.add("Go in the steam tunnels");
        desires.add("Eat a picnic on the Lawn");
        desires.add("Visit Montecello");
        desires.add("High five Cav Man");
        desires.add("See a movie at Virginia Film Festival");
        desires.add("Study in the Music Library");
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
