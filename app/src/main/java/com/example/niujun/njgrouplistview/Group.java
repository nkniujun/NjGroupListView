package com.example.niujun.njgrouplistview;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by niujun on 2017/2/24.
 */

public class Group {

    private String groupName; //组名
    private List<String> groupItems = new ArrayList<>();

    public Group() {

    }

    public Group(String groupName, List<String> groupItems) {
        this.groupName = groupName;
        this.groupItems = groupItems;
    }

    //获取组名
    public String getGroupName() {
        return groupName;
    }

    //设置组名
    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    //获取所有组内容
    public List<String> getAllItems() {
        return groupItems;
    }

    //设置所有组内容
    public void setAllItems(List<String> groupItems) {
        this.groupItems = groupItems;
    }

    //添加条目
    public void addItem(String item) {
        groupItems.add(item);
    }

    public String getItem(int position) {
        if (position == 0) {
            //first get group name
            return groupName;
        } else {
            //get content of right position
            return groupItems.get(position - 1);
        }

    }


    //获取组内数目
    public int getCountInGroup() {
        return groupItems.size();
    }

    //获取所有条目，包含组条目
    public int getCount() {
        return 1 + getCountInGroup();
    }

}
