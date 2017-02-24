package com.example.niujun.njgrouplistview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

/**
 * Created by niujun on 2017/2/24.
 */

public class ComGroupAdapter extends CroupAdapter {

    private LayoutInflater mInflater;

    public ComGroupAdapter(Context context, List<Group> list) {
        super(context, list);
        mInflater = LayoutInflater.from(context);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        switch (getItemViewType(position)) {
            case 0://组标题
                if (null == convertView) {
                    convertView = mInflater.inflate(R.layout.layout_title, null);
                }
                TextView title = (TextView) convertView.findViewById(R.id.title);
                title.setText((String) getItem(position));
                break;
            case 1://组内容
                if (null == convertView) {
                    convertView = mInflater.inflate(R.layout.layout_cons, null);
                }
                TextView cons = (TextView) convertView.findViewById(R.id.con);
                cons.setText((String) getItem(position));
                break;
        }

        return convertView;
    }
}
