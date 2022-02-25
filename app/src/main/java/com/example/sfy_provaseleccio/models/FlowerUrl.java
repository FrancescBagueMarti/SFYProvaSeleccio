package com.example.sfy_provaseleccio.models;

import java.io.Serializable;

public class FlowerUrl implements Serializable {
    private String regular;

    public FlowerUrl(String regular) {
        this.regular = regular;
    }

    public String getRegular() {
        return regular;
    }
}
