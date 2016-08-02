package com.lombardo.giflib.model;

import java.time.LocalDate;

public class Gif {
    private String name;
    private int categoryID;
    private LocalDate dateUploaded;
    private String username;
    private Boolean favorite;

    public Gif(String name, int categoryID, LocalDate dateUploaded, String username, Boolean favorite) {
        this.name = name;
        this.categoryID = categoryID;
        this.dateUploaded = dateUploaded;
        this.username = username;
        this.favorite = favorite;
    }

    public int getCategoryID() {
        return categoryID;
    }

    public void setCategoryID(int categoryID) {
        this.categoryID = categoryID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDateUploaded() {
        return dateUploaded;
    }

    public void setDateUploaded(LocalDate dateUploaded) {
        this.dateUploaded = dateUploaded;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Boolean getFavorite() {
        return favorite;
    }

    public void setFavorite(Boolean favorite) {
        this.favorite = favorite;
    }
}
