package com.example.android.bucketlist;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.TextView;

import java.util.List;

public class BucketListAdapter extends RecyclerView.Adapter<BucketListAdapter.DesireViewHolder> {

    public static String[] checkboxStates = new String[20];

    public static class DesireViewHolder extends RecyclerView.ViewHolder {
        CheckBox cb;
        TextView tv;

        DesireViewHolder(View view){
            super(view);
            cb = (CheckBox)view.findViewById(R.id.Box);
            tv = (TextView)view.findViewById(R.id.title);
        }
    }

    List<List<String>> desires;

    public BucketListAdapter(List<List<String>> desires) {
        this.desires = desires;
        if(checkboxStates[0] == null) {
            for (int i = 0; i < 20; i++) {
                checkboxStates[i] = "0";
            }
        }
    }

    @Override
    public int getItemCount(){
        return desires.size();
    }

    @Override
    public DesireViewHolder onCreateViewHolder(ViewGroup vg, int i){
        View v = LayoutInflater.from(vg.getContext()).inflate(R.layout.listitem, vg, false);
        DesireViewHolder d = new DesireViewHolder(v);

        return d;
    }

    @Override
    public void onBindViewHolder(DesireViewHolder d, final int position) {
        final String checkval = checkboxStates[position];
        d.tv.setText(desires.get(position).get(0));
        d.tv.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), ItemDescription.class);
                String message = desires.get(position).get(1);
                intent.putExtra("Description", message);
                v.getContext().startActivity(intent);
                ((Activity)v.getContext()).finish();
            }
        });

        d.cb.setOnCheckedChangeListener(null);

        if(checkval == "1"){
            d.cb.setChecked(true);
        }
        else{
            d.cb.setChecked(false);
        }

        d.cb.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked){
                    checkboxStates[position] = "1";
                }
                else{
                    checkboxStates[position] = "0";
                }
            }
        });
    }

    public static String[] getCheckboxStates(){
        return checkboxStates;
    }
}
