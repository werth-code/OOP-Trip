package org.example.traveler;

import java.time.LocalDate;
import java.util.Random;

public class CovidReport {
    private LocalDate date;

    public CovidReport() {
        this.date = LocalDate.now();
    }

    public Boolean test(Traveler traveler) {
        Random rand = new Random();
        int random = rand.nextInt(100);
        if(random > 85) {
            traveler.setCovidResults(true);
            return true;
        }
        return false;
    }
    
    public Boolean isTestExpired() {
        int days = this.date.compareTo(LocalDate.now());
        return days < 3;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public LocalDate getDate() {
        return date;
    }
}
