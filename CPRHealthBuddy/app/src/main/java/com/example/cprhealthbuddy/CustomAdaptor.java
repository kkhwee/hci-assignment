package com.example.cprhealthbuddy;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by k_kokhwee on 11/15/2017.
 */

public class CustomAdaptor extends BaseAdapter {
    Context context;
    int imgIds[];
    LayoutInflater inflter;

    public CustomAdaptor(Context applicationContext, int[] imgIds){
        this.context = context;
        this.imgIds = imgIds;
        inflter = (LayoutInflater.from(applicationContext));
    }

    @Override
    public int getCount(){
        return imgIds.length;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        view = inflter.inflate(R.layout.listitem_cpr_steps, null);
        ImageView icon = (ImageView) view.findViewById(R.id.imageButton);
        icon.setImageResource(imgIds[i]);

        return view;
    }
}
