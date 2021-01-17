package org.example.traveler;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Passport {
    private String id;
    private List<Destination> destinations;


    public Passport() {
        this.id = UUID.randomUUID().toString();
        this.destinations = new ArrayList<>();
    }

//    public Boolean checkForDestination(Traveler traveler) { //// TODO: 1/17/21
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

}

