package org.example.traveler;

import java.util.UUID;

public class Passport {
    private String id;


    public Passport() {
        this.id = UUID.randomUUID().toString();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

}

