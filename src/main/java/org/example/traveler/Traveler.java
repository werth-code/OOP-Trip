package org.example.traveler;

import javax.print.attribute.standard.Destination;
import java.util.List;

public class Traveler {
    private String name;
    private Double money;
    private Passport passport;
    private List<Destination> placesVisited;
    private Boolean noFlyList;
    private Boolean covidResults;
    private CovidReport covidReport;

    public Traveler(String name, Double money) {
        this.name = name;
        this.money = money;
        this.covidResults = false;
        this.covidReport = new CovidReport();
        this.noFlyList = false;
        this.passport = new Passport();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getMoney() {
        return money;
    }

    public void setMoney(Double money) {
        this.money = money;
    }

    public Passport getPassport() {
        return passport;
    }

    public void setPassport(Passport passport) {
        this.passport = passport;
    }

    public List<Destination> getPlacesVisited() {
        return placesVisited;
    }

    public void setPlacesVisited(List<Destination> placesVisited) {
        this.placesVisited = placesVisited;
    }

    public Boolean getNoFlyList() {
        return noFlyList;
    }

    public void setNoFlyList(Boolean noFlyList) {
        this.noFlyList = noFlyList;
    }

    public boolean getCovidResults() {
        return covidResults;
    }

    public void setCovidResults(Boolean results) {
        this.covidResults = covidResults;
    }

    public CovidReport getCovidReport() {
        return covidReport;
    }

    public void setCovidReport(CovidReport covidReport) {
        this.covidReport = covidReport;
    }
}
