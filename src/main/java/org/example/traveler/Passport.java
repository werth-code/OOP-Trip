package org.example.traveler;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Passport {
    private String id;
    private Traveler traveler;
    private List<Destination> destinations;


    public Passport(Traveler traveler) {
        this.id = UUID.randomUUID().toString();
        this.traveler = traveler;
        this.destinations = new ArrayList<>();
    }

//    public Boolean checkForDestination(Traveler traveler) {
//        for(Traveler trav : getDestinations()) {
//            if(trav.getName\.equals(destination)) return true;
//        }
//        return false;
//    }

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

}

