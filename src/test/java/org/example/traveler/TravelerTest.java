package org.example.traveler;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TravelerTest {
    Traveler traveler;
    Destination florida;

    @Before
    public void setUp() throws Exception {
        traveler = new Traveler("Amanda", 6500.00);
        florida = new Destination("Florida", 650.00, 2.5, true);
    }

    @Test
    public void bookATrip() {
        florida.bookATrip(traveler);
    }

    @Test
    public void getName() {
        String actual = traveler.getName();
        String expected = "Amanda";

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getMoney() {
        Double actual = traveler.getMoney();
        Double expected = 6500.00;

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getPassport() {
        String actual = traveler.getPassport().getId();
        String expected = "523ce355-b378-49aa-9b06-07ec7ba58bab"; //// TODO: 1/17/21 Generating a new String each time.... 

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getPlacesVisited() {
    }

    @Test
    public void getNoFlyList() {
    }

    @Test
    public void getCovidResults() {
    }

    @Test
    public void getCovidReport() {
    }
}