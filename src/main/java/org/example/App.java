package org.example;

import org.example.traveler.Destination;
import org.example.traveler.Traveler;

import java.util.logging.Logger;

public class App {
    public static void main( String[] args ) {
        Logger logger = Logger.getGlobal();

        Traveler mark = new Traveler("Mark Meadow", 7700.00);
        Destination florida = new Destination("Florida", 1200.00, 2.5, true);

        logger.info(florida.calculateTripCost().toString());
        florida.bookATrip(mark);
        logger.info(mark.getPlacesVisited().toString());

    }
}
