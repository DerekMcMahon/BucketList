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
        List l1 = new ArrayList<>();
        l1.add("Streak the Lawn");
        l1.add("At the top of the rotunda steps, strip down into your birthday suite and run down to the Homer Statue, cirle it three " +
                "times and then run back to the steps to look through the key hole of the rotunda and grab your clothes");
        desires.add(l1);
        List l2 = new ArrayList<>();
        l2.add("Lighting of the Lawn");
        l2.add("In early December, bring a blanket and come enjoy some hot chocolate, a capella singers and a light show on the Rotunda!");
        desires.add(l2);
        List l3 = new ArrayList<>();
        l3.add("Run the Fourth Year 5K");
        l3.add("Wake up early on a Saturday morning in October to run a 5k to support the Fourth Year class");
        desires.add(l3);
        List l4 = new ArrayList<>();
        l4.add("Paint Beta Bridge");
        l4.add("On Rugby Road, you will find a bridge covered in layers of paint. Bring some paint and brushes " +
                "and cover the bridge in your own masterpiece whether marketing for a CIO event or wishing a friend Happy Birthday!");
        desires.add(l4);
        List l5 = new ArrayList<>();
        l5.add("See a horse at Foxfield");
        l5.add("Girls: grab your finest Lily Pulitzer dress and fancy hats, Boys: find your preppiest shirt and bowtie and attend the" +
                " annual Foxfield Races in Charlottesville in the Spring and spot a horse during a race around the Foxfield Track! ");
        desires.add(l5);
        List l6 = new ArrayList<>();
        l6.add("Visit Edgar Allen Poe's room");
        l6.add("Make your way to 13 West Range where you'll find the room of famous poet and Cavalier, Edgar Allen Poe.");
        desires.add(l6);
        List l7 = new ArrayList<>();
        l7.add("Go on a Random Road Trip");
        l7.add("Find a couple buddies, a car, a killer playlist and some snacks and travel: DC, New York, Nashville, Baltimore, etc.");
        desires.add(l7);
        List l8 = new ArrayList<>();
        l8.add("Nab the #1 Ticket at Bodos");
        l8.add("Wake up before the sun and wait outside of Bodos Bagels on the Corner to be the first cusotmer of the day when the doors open at 6am!");
        desires.add(l8);
        List l9 = new ArrayList<>();
        l9.add("Eat a picnic on the Lawn");
        l9.add("Grab a blanket, some food and friends and enjoy a meal on the Lawn.");
        desires.add(l9);
        List l10 = new ArrayList<>();
        l10.add("Hike Humpback at Sunrise");
        l10.add("No better way to start your day than an early morning hike and watching the sunrise from the top of Humpback Rock.");
        desires.add(l10);
        List l11 = new ArrayList<>();
        l11.add("Sing the Good Ole Song");
        l11.add("Many opportunities to do so, but it is important to learn the lyrics to the Good Ole Song if you are a true wahoo. Don't forget the chant as well!");
        desires.add(l11);
        List l12 = new ArrayList<>();
        l12.add("Dress up 'Guys in Ties, Girls in Pearls'");
        l12.add("Attend a UVa Football gamea at Scott Stadium in proper UVa student attire. Stand on the Hill and cheer on your Hoos!");
        desires.add(l12);
        List l13 = new ArrayList<>();
        l13.add("Order Food to Clemons");
        l13.add("Order some food - College Inn, Dominos, Campus Cookies - for delivery to Clemons Libary and enjoy your food of choice during your " +
                "late night study session");
        desires.add(l13);
        List l14 = new ArrayList<>();
        l14.add("Play in Madbowl");
        l14.add("On Rugby Road, you will find MadBowl field, surrounded by fraternity and sorrority houses. Bring a football, frisbee, dog " +
                "and some friends to play!");
        desires.add(l14);
        List l15 = new ArrayList<>();
        l15.add("Hug Ms Kathy in Newcomb");
        l15.add("Give a nice long hug to the famous Ms. Kathy in the Newcomb dining hall when she swipes you in!");
        desires.add(l15);
        List l16 = new ArrayList<>();
        l16.add("Play an IM Sport");
        l16.add("Organize a sports team - volleyball, basketball, water polo - with friends, organizations, hallmates and participate in UVa's Intermural Sports!");
        desires.add(l16);
        List l17 = new ArrayList<>();
        l17.add("Attend a Class You're not Enrolled in");
        l17.add("There are so many classes at UVa! You can't take them all. So, stop in at one you want to listen to, but don't have" +
                "time in your schedule to enroll in and attend a class!");
        desires.add(l17);
        List l18 = new ArrayList<>();
        l18.add("Go Wine Tasting");
        l18.add("Once you turn 21, of course, enjoy one of Charlottesville's finest vineyards and go wine tasting!");
        desires.add(l18);
        List l19 = new ArrayList<>();
        l19.add("Go Wine Tasting");
        l19.add("Once you turn 21, of course, enjoy one of Charlottesville's finest vineyards and go wine tasting!");
        desires.add(l19);
        List l20 = new ArrayList<>();
        l20.add("Go to All the Gyms on Grounds");
        l20.add("AFC, Slaughter, Memorial Gym and North Grounds! Visit them all!");
        desires.add(l20);
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

    /*@Override
    public void onSaveInstanceState(Bundle savedInstanceState){
        super.onSaveInstanceState(savedInstanceState);
    }*/
}
