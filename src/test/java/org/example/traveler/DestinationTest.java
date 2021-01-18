package org.example.traveler;

import org.example.traveler.exceptions.InfectionDateException;
import org.example.traveler.exceptions.InfectionException;
import org.example.traveler.exceptions.InsufficientFundsException;
import org.example.traveler.exceptions.NoFlyListException;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class DestinationTest {
    Traveler traveler;
    Traveler traveler2;
    Destination florida;

    @Before
    public void setUp() throws Exception {
        traveler = new Traveler("Amanda", 6500.00);
        traveler2 = new Traveler("Amanda", 00.00);
        florida = new Destination("Florida", 650.00, 2.5, true);
    }

    @Test
    public void bookATrip() {
        florida.bookATrip(traveler);
    }

    @Test
    public void checkEligibilityTrue() throws InfectionDateException, InfectionException, NoFlyListException {
        Boolean actual = florida.checkEligibility(traveler);
        Boolean expected = true;
        System.out.println(actual);

        Assert.assertEquals("Test If Traveler Can Go To Florida", expected, actual);
    }

    @Test
    public void checkEligibilityFalse() throws InfectionDateException, InfectionException, NoFlyListException { //// TODO: 1/18/21 Not working yet!
        Boolean actual = florida.checkEligibility(traveler2);
        System.out.println(actual);
    }

    @Test
    public void enoughFundsForTrip() throws InsufficientFundsException {
        Boolean actual = florida.enoughFundsForTrip(traveler);
        Boolean expected = true;
        System.out.println(actual);

        Assert.assertEquals("Test If Traveler Can Afford Florida", expected, actual);
    }

    @Test
    public void calculateTripCost() {
        Double actual = florida.calculateTripCost();
        Double expected = 1625.0;
        System.out.println(actual);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getName() {
        String actual = florida.getName();
        String expected = "Florida";
        System.out.println(actual);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getDistance() {
        Double actual = florida.getDistance();
        Double expected = 650.0;
        System.out.println(actual);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getCostPerMile() {
        Double actual = florida.getCostPerMile();
        Double expected = 2.5;
        System.out.println(actual);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getRequireCovidTest() {
        Boolean actual = florida.getRequireCovidTest();
        Boolean expected = true;
        System.out.println(actual);

        Assert.assertEquals(expected, actual);
    }

}