package com.example.dwawertest.Mathematics.FormOneMathTopics;

public class Form_One_Math_Model {
    String title,description;
    int img;
    public Form_One_Math_Model(){

    };
    public Form_One_Math_Model(String title, String description, int img) {
        this.title = title;
        this.description = description;
        this.img = img;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public int getImg() {
        return img;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setImg(int img) {
        this.img = img;
    }
}
