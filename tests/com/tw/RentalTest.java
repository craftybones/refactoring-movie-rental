package com.tw;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class RentalTest {
    private Movie regular;
    private Movie newRelease;
    private Movie childrens;

    @Before
    public void setUp() throws Exception {
        regular = new RegularMovie("Top Gun");
        newRelease = new NewMovie("Avatar");
        childrens = new ChildrensMovie("Toy Story");
    }

    @Test
    public void testAmountPerRegularMovieRental() {
        Rental rental = new Rental(regular, 1);

        assertEquals(2, rental.amount(),0.0);
    }

    @Test
    public void testAmountPerRegularMovieRentalWithLateDues() {
        Rental rental = new Rental(regular, 3);

        assertEquals(3.5, rental.amount(),0.0);
    }

    @Test
    public void testAmountPerNewMovieRental() {
        Rental rental = new Rental(newRelease, 1);

        assertEquals(3, rental.amount(),0.0);
    }

}