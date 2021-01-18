package org.example.traveler;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CovidReportTest {
    CovidReport covidReport;
    Traveler traveler;

    @Before
    public void setUp() throws Exception {
        covidReport = new CovidReport();
        traveler = new Traveler("Mark Meadow", 7700.00);
    }

    @Test
    public void testForCovid() {
        Boolean actual = covidReport.test(traveler);
        System.out.println(actual);

        Assert.assertNotNull("15% Chance Of Having Covid", actual);
    }

    @Test
    public void isTestExpired() {
        covidReport.setDate(covidReport.getDate().minusDays(5));
        System.out.println(covidReport.getDate());
        Boolean actual = covidReport.isTestExpired();
        Boolean expected = true;

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getDate() {
        String actual = covidReport.getDate().toString();
        String expected = "2021-01-18";
        System.out.println(actual);

        Assert.assertEquals(expected, actual);
    }
}