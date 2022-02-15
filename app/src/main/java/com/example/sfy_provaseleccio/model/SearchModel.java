package com.example.sfy_provaseleccio.model;

import java.util.ArrayList;

public class SearchModel {

    private ArrayList<ImageModel> results;

    public SearchModel(ArrayList<ImageModel> results) {
        this.results = results;
    }

    public ArrayList<ImageModel> getResults() {
        return results;
    }

    public void setResults(ArrayList<ImageModel> results) {
        this.results = results;
    }
}
