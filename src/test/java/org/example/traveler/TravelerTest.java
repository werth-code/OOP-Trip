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
        System.out.println(actual);

        Assert.assertNotNull(actual);
    }

    @Test
    public void getPlacesVisited() {
        Integer actual = traveler.getPlacesVisited().size();
        Integer expected = 0;

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getNoFlyList() {
        Boolean actual = traveler.getNoFlyList();
        Boolean expected = false;

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getCovidResults() {
        Boolean actual = traveler.getCovidResults();
        Boolean expected = false;

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getCovidReport() {
        CovidReport actual = traveler.getCovidReport();

        Assert.assertNotNull(actual);
    }
}