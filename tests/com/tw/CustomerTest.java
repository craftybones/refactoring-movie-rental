package com.tw;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CustomerTest {
    @Test
    public void testAmountPerRegularMovieRental() {
        Movie topGun = new Movie("Top Gun", Movie.REGULAR);
        Rental rental = new Rental(topGun, 1);
        Customer john = new Customer("John");

        assertEquals(2,john.amountPerRental(rental),0.0);
    }

    @Test
    public void testAmountPerRegularMovieRentalWithLateDues() {
        Movie topGun = new Movie("Top Gun", Movie.REGULAR);
        Rental rental = new Rental(topGun, 3);
        Customer john = new Customer("John");

        assertEquals(3.5,john.amountPerRental(rental),0.0);
    }

    @Test
    public void testAmountPerNewMovieRental() {
        Movie avatar = new Movie("Avatar", Movie.NEW_RELEASE);
        Rental rental = new Rental(avatar, 1);
        Customer john = new Customer("John");

        assertEquals(3,john.amountPerRental(rental),0.0);
    }


}