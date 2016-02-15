package com.example.android.bucketlist;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ItemDescription extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.content_item_description);

        final Intent intent = getIntent();
        String desc = intent.getStringExtra("Description");
        TextView tv = (TextView)findViewById(R.id.desc);
        tv.setText(desc);

    }

    public void goBack(View v){
        Intent intent = new Intent(this, MainActivity.class);
        v.getContext().startActivity(intent);
        ((Activity)v.getContext()).finish();
    }
}
