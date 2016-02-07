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

    private List<List<String>> desires;
    //This is a comment - Jacqueline
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
        ArrayList l1 = new ArrayList<String>();
        l1.add("Streak the Lawn");
        l1.add("At the top of the rotunda steps, strip down into your birthday suite and run down to the Homer Statue, cirle it three " +
                "times and then run back to the steps to look through the key hole of the rotunda and grab your clothes");
        desires.add(l1);

        /*
        desires.add("Streak the Lawn", "hello");
        desires.add("See the Lighting of the Lawn");
        desires.add("Run the Fourth Year 5K");
        desires.add("Paint Beta Bridge");
        desires.add("See a horse at Foxfield");
        desires.add("Visit Edgar Allen Poe's room");
        desires.add("Go Steam Tunneling");
        desires.add("Nab the #1 Ticket at Bodos");
        desires.add("Eat a picnic on the Lawn");
        desires.add("High five Cav Man");
        desires.add("Hike Humpback at Sunrise");
        desires.add("Sing the Good Ole Song");
        desires.add("Dress up 'Guys in Ties, Girls in Pearls'");
        desires.add("Order Food to Clemons");
        desires.add("Play in Madbowl");
        desires.add("Hug Ms Kathy in Newcomb");
        desires.add("Play an IM Sport");
        desires.add("Attend a Class You're not Enrolled in");
        desires.add("Go Wine Tasting");
        desires.add("Go to All the Gyms on Grounds");
*/
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
