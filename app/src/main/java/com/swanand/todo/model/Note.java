package com.swanand.todo.model;

/**
 * Created by swanand on 7/9/2016.
 */
public class Note {
    private String title;
    private String description;

    public Note(int id, String title, String description) {
        this.title = title;
        this.description = description;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}