package com.example.niujun.njgrouplistview;

import android.content.Context;
import android.widget.BaseAdapter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by niujun on 2017/2/24.
 */

public abstract class CroupAdapter extends BaseAdapter {

    protected Context mContext;

    protected List<Group> mList = new ArrayList<>();

    public CroupAdapter(Context context, List<Group> list) {
        mContext = context;
        mList = list;
    }


    @Override
    public Object getItem(int position) {
        if (mList == null || position < 0 || position > getCount()) {
            return null;
        }
        int firstIndex = 0;
        for (Group group : mList) {
            int size = group.getCount();
            int index = position - firstIndex;

            if (index < size) {
                return group.getItem(index);
            }

            firstIndex += size;
        }
        return null;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }


    @Override
    public int getCount() {
        int count = 0;
        if (mList != null) {
            for (Group group : mList) {
                count += group.getCount();
            }
        }
        return count;
    }


    @Override
    public int getItemViewType(int position) {
        if (mList == null || position < 0 || position > getCount()) {
            return DataType.TYPE_GROUP_NAME.ordinal();
        }
        int firstIndex = 0;
        for (Group group : mList) {
            int size = group.getCount();
            int index = position - firstIndex;
            if (index == 0) {
                return DataType.TYPE_GROUP_NAME.ordinal();
            }
            firstIndex += size;
        }
        return DataType.TYPE_GROUP_CONS.ordinal();
    }

    @Override
    public int getViewTypeCount() {
        return DataType.values().length;
    }

    @Override
    public boolean isEmpty() {
        return super.isEmpty();
    }

    //所有类型
    public enum DataType {
        TYPE_GROUP_NAME, TYPE_GROUP_CONS
    }
}
