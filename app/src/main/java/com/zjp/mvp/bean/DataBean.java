package com.zjp.mvp.bean;

import java.io.Serializable;

/**
 * Created by zjp on 2018/6/7.
 *
 * @author zjp
 * @date 2018/6/7
 */
public class DataBean implements Serializable {
    private static final long serialVersionUID = 2433915875532592653L;

    String description;
    String title;
    int imageUrl;

    public DataBean(String description, String title, int imageUrl) {
        this.description = description;
        this.title = title;
        this.imageUrl = imageUrl;
    }

    public String getDescription() {
        return description;
    }

    public String getTitle() {
        return title;
    }

    public int getImageUrl() {
        return imageUrl;
    }

    public void setDescription(String description) {

        this.description = description;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setImageUrl(int imageUrl) {
        this.imageUrl = imageUrl;
    }
}
