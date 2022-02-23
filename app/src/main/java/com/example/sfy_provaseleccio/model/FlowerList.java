package com.example.sfy_provaseleccio.model;

import java.util.ArrayList;

public class FlowerList {
    ArrayList<Flower> getSearchResults;

    public FlowerList(ArrayList<Flower> getSearchResults) {
        this.getSearchResults = getSearchResults;
    }

    public ArrayList<Flower> getSearchResults() {
        return getSearchResults;
    }

    public void setSearchResults(ArrayList<Flower> getSearchResults) {
        this.getSearchResults = getSearchResults;
    }
}
