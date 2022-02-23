package com.example.sfy_provaseleccio.models;

import java.io.Serializable;
import java.util.ArrayList;

public class FlowerList implements Serializable {
    private ArrayList<Flower> results;

    public FlowerList(ArrayList<Flower> results) {
        this.results = results;
    }

    public ArrayList<Flower> getResults() {
        return results;
    }

    public void setResults(ArrayList<Flower> results) {
        this.results = results;
    }
}
