package com.technocracy.app.aavartan.api;

/**
 * Created by MOHIT on 20-Sep-16.
 */
public class GalleryItem {

    private int id;
    private String title;
    private double ratio;
    private String url;

    public GalleryItem(int id, String title, double ratio, String url) {
        this.id = id;
        this.title = title;
        this.ratio = ratio;
        this.url = url;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getRatio() {
        return ratio;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
