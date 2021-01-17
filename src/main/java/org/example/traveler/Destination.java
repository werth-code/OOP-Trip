package org.example.traveler;

import org.example.traveler.exceptions.InfectionDateException;
import org.example.traveler.exceptions.InfectionException;
import org.example.traveler.exceptions.NoFlyListException;

public class Destination {
    private String name;
    private Double distance;
    private Double costPerMile;
    private Boolean requireCovidTest;

    public Destination(String name, Double distance, Boolean requireCovidTest) {
        this.name = name;
        this.distance = distance;
        this.requireCovidTest = requireCovidTest;
    }

    public Boolean bookATrip(Traveler traveler) { //// TODO: 1/17/21  
        return false;
    }

    public Boolean checkEligibility(Traveler traveler) throws InfectionException, NoFlyListException, InfectionDateException { //// TODO: 1/17/21 make these seperate functions that call each other.
        if(this.requireCovidTest) {
            if(traveler.getCovidResults()) throw new InfectionException();
        }
        if(traveler.getNoFlyList()) throw new NoFlyListException();
        if(traveler.getCovidReport().isTestExpired()) throw new InfectionDateException();
        return true;
    }

    public Double calculateTripCost() {
        return this.distance * costPerMile;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getDistance() {
        return distance;
    }

    public void setDistance(Double distance) {
        this.distance = distance;
    }

    public Double getCostPerMile() {
        return costPerMile;
    }

    public void setCostPerMile(Double costPerMile) {
        this.costPerMile = costPerMile;
    }

    public Boolean getRequireCovidTest() {
        return requireCovidTest;
    }

    public void setRequireCovidTest(Boolean requireCovidTest) {
        this.requireCovidTest = requireCovidTest;
    }

    public void allowToVisit(Traveler traveler) {}
}

