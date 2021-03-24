package com.vti.academy.entity;

import java.util.Date;

public class Group {
    private int id;
    private String groupName;
    private Date createDate;

    public String getGroupName(String groupName){
        return groupName;
    }

    public void setGroupName(String groupName){
        this.groupName = groupName;
    }

    public String getCreateDate(String createDate){
        return createDate;
    }
}
