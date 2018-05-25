package com.finder.infinitumk.findr;

public class ModelBar {

private int image;
private String name,type,pick;

    public ModelBar(int image, String name, String type, String pick) {
        this.image = image;
        this.name = name;
        this.type = type;
        this.pick = pick;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getPick() {
        return pick;
    }

    public void setPick(String pick) {
        this.pick = pick;
    }
}
