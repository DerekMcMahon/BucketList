package com.example.android.bucketlist;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.TextView;

import java.util.List;

public class BucketListAdapter extends RecyclerView.Adapter<BucketListAdapter.DesireViewHolder> {


    public static class DesireViewHolder extends RecyclerView.ViewHolder {
        CheckBox cb;
        TextView tv;

        DesireViewHolder(View view){
            super(view);
            cb = (CheckBox)view.findViewById(R.id.Box);
            tv = (TextView)view.findViewById(R.id.title);
        }
    }

   List<String> desires;
//Test comment
    public BucketListAdapter(List<String> desires){
        this.desires = desires;
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
    public void onBindViewHolder(DesireViewHolder d, int position) {
        d.tv.setText(desires.get(position));
    }

}
