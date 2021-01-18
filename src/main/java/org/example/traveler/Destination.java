package org.example.traveler;

import org.example.traveler.exceptions.InfectionDateException;
import org.example.traveler.exceptions.InfectionException;
import org.example.traveler.exceptions.InsufficientFundsException;
import org.example.traveler.exceptions.NoFlyListException;

import java.util.logging.Logger;

public class Destination {
    Logger logger = Logger.getGlobal();
    private String name;
    private Double distance;
    private Double costPerMile;
    private Boolean requireCovidTest;

    public Destination(String name, Double distance, Double costPerMile, Boolean requireCovidTest) {
        this.name = name;
        this.distance = distance;
        this.costPerMile = costPerMile;
        this.requireCovidTest = requireCovidTest;
    }

    public void bookATrip(Traveler traveler) {
        try {
            traveler.getCovidReport().test(traveler);
            checkEligibility(traveler);
            enoughFundsForTrip(traveler);
        } catch (InfectionDateException | InfectionException | NoFlyListException | InsufficientFundsException e) {
            e.printStackTrace();
        }
        traveler.getPlacesVisited().add(this.name);
        logger.fine("You Just Booked A Trip!");
    }

    public Boolean checkEligibility(Traveler traveler) throws InfectionException, NoFlyListException, InfectionDateException {
        if(traveler.getCovidResults()) throw new InfectionException();
        if(traveler.getNoFlyList()) throw new NoFlyListException();
        if(traveler.getCovidReport().isTestExpired()) throw new InfectionDateException();
        return true;
    }

    public Boolean enoughFundsForTrip(Traveler traveler) throws InsufficientFundsException {
        if(calculateTripCost() > traveler.getMoney()) throw new InsufficientFundsException();
        logger.info("Have A Wonderful Trip!");
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

}

