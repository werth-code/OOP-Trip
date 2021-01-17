package org.example.traveler;

import jdk.jfr.Frequency;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Passport {
    private String id;
    private Traveler traveler;
    private List<Destination> destinations;
    private Boolean noFlyList;

    public Passport(Traveler traveler) {
        this.id = UUID.randomUUID().toString();
        this.traveler = traveler;
        this.noFlyList = false;
        this.destinations = new ArrayList<>();
    }

    public Boolean checkForDestination(String destination) {
        for(Destination dest : getDestinations()) {
            if(dest.getName.equals(destination)) return true;
        }
        return false;
    }

    public List<Destination> getDestinations() {
        return destinations;
    }

    public void setDestinations(List<Destination> destinations) {
        this.destinations = destinations;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Traveler getTraveler() {
        return traveler;
    }

    public void setTraveler(Traveler traveler) {
        this.traveler = traveler;
    }

    public Boolean getNoFlyList() {
        return noFlyList;
    }

    public void setNoFlyList(Boolean noFlyList) {
        this.noFlyList = noFlyList;
    }
}

