package com.faceswiping.app.bean;

import java.io.Serializable;

/**
 * Created by wanglin on 15/12/13.
 */
public class NewFriendBean implements Serializable {

    private int userId;

    private String name;

    private String userName;

    private String headerImageUrl;

    private String imageUrl;

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHeadImageUrl() {
        return headerImageUrl;
    }

    public void setHeadImageUrl(String headImageUrl) {
        this.headerImageUrl = headImageUrl;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }
}
