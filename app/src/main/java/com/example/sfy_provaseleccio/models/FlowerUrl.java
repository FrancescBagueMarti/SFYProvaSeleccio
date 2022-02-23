package com.example.sfy_provaseleccio.model;

import java.io.Serializable;

public class FlowerUrl implements Serializable {
    private String regular;

    public FlowerUrl(String regular) {
        this.regular = regular;
    }

    public String getRegular() {
        return regular;
    }

    public void setRegular(String regular) {
        this.regular = regular;
    }
}
