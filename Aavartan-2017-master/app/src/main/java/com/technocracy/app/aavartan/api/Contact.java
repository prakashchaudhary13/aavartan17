package com.technocracy.app.aavartan.api;

/**
 * Created by MOHIT on 22-Sep-16.
 */
public class Contact {
    private int id;
    private String name;
    private String designation;
    private String imageUrl;
    private String facebookUrl;

    public Contact(int id, String name, String designation, String imageUrl, String facebookUrl){
        this.id = id;
        this.name = name;
        this.designation = designation;
        this.imageUrl = imageUrl;
        this.facebookUrl = facebookUrl;
    }

    public int getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public String getDesignation(){
        return designation;
    }
    public String getImageUrl(){
        return imageUrl;
    }
    public String getFacebookUrl(){
        return facebookUrl;
    }
}
