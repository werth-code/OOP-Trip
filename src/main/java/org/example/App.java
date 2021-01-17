package org.example;

import org.example.traveler.Passport;
import org.example.traveler.Traveler;

import java.time.LocalDate;

/**
 * Hello world!
 *
 */
public class App {
    public static void main( String[] args ) {


        Traveler mark = new Traveler("Mark Meadow", 7000.00);
        Passport passport = new Passport(mark);

        LocalDate ld = LocalDate.now();
        LocalDate ldminus = ld.minusDays(3);

        Integer test = ld.compareTo(ldminus); //// TODO: 1/17/21 this is how we test for 3 days past test

        System.out.println(ld);
        System.out.println(ldminus);
        System.out.println(test);
    }
}
