package org.example.traveler;

import java.time.LocalDate;
import java.util.Random;

public class CovidReport {
    private LocalDate date;

    public CovidReport() {
        this.date = LocalDate.now();
    }

    public void test(Traveler traveler) {
        Random rand = new Random();
        int random = rand.nextInt(100);
        if(random > 90) {
            traveler.setCovidResults(true);
            addToNoFlyList(traveler);
        }
    }
    
    public Boolean isTestExpired() {     // // TODO: 1/17/21 Test this works
        int days = this.date.compareTo(LocalDate.now());
        return days > 3;
    }

    public void addToNoFlyList(Traveler traveler) {
        traveler.setNoFlyList(true);
    }

    public LocalDate getDate() {
        return date;
    }
}
