package com.example.dcp.custom_spinner;

import android.content.Context;
import android.graphics.Typeface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

/**
 * Created by dcp on 12-10-2017.
 */

public class Base_adapter_usertype extends BaseAdapter {
    Context context;
    String[] month;
    LayoutInflater inflter;
    Typeface custom_font;

    public Base_adapter_usertype(Context context, String[] month) {
        this.context = context;
        this.month = month;
        inflter = (LayoutInflater.from(context));
    }

    @Override
    public int getCount() {
        return month.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        convertView = inflter.inflate(R.layout.list_item, null);
        TextView visitby = (TextView) convertView.findViewById(R.id.text_type);
        visitby.setText(month[position]);
        return convertView;
    }
}
