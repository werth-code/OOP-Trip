package org.example;

import org.example.traveler.Destination;
import org.example.traveler.Passport;
import org.example.traveler.Traveler;

import java.time.LocalDate;

/**
 * Hello world!
 *
 */
public class App {
    public static void main( String[] args ) {


        Traveler mark = new Traveler("Mark Meadow", 7700.00);
        Destination florida = new Destination("Florida", 1200.00, 2.5, true);

        System.out.println(florida.calculateTripCost());

        florida.bookATrip(mark);

        System.out.println(mark.getPlacesVisited());

    }
}
