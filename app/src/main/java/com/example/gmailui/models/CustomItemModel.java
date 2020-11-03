package com.example.gmailui.models;

public class CustomItemModel {
    String image;
    String name;
    String content;
    String time;
    boolean selected;



    public CustomItemModel (String name, String content, String time) {
        this.name = name;
        this.content = content;
        this.time = time;
        this.selected = false;
    }
    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getTime() {
        return time;
    }

    public boolean isSelected() {
        return selected;
    }

    public void setSelected(boolean selected) {
        this.selected = selected;
    }

    public void setTime(String time) {
        this.time = time;
    }
}
