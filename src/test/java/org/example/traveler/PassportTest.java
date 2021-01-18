package org.example.traveler;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PassportTest {

    @Test
    public void getId() {
        Passport passport = new Passport();
        String actual = passport.getId();
        System.out.println(actual);

        Assert.assertNotNull(actual);
    }
}