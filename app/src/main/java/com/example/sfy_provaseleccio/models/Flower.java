package com.example.sfy_provaseleccio.models;

import java.io.Serializable;

public class Flower implements Serializable {
    private String id;
    private String created_at;
    private String description;
    private FlowerUrl urls;
    private long likes;

    public Flower(String id, String created_at, String description, FlowerUrl urls, long likes) {
        this.id = id;
        this.created_at = created_at;
        this.description = description;
        this.urls = urls;
        this.likes = likes;
    }

    public String getId() {
        return id;
    }

    public String getCreated_at() {
        return created_at;
    }

    public String getDescription() {
        return description;
    }

    public FlowerUrl getUrls() {
        return urls;
    }

    public long getLikes() {
        return likes;
    }

}
