package com.tw;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CustomerTest {

    private Movie regular;
    private Movie newRelease;
    private Movie childrens;
    private Customer customer;

    @Before
    public void setUp() throws Exception {
        regular = new RegularMovie("Top Gun");
        newRelease = new NewMovie("Avatar");
        childrens = new ChildrensMovie("Toy Story");
        customer = new Customer("John");
    }

    @Test
    public void testStatementForSingleRegularMovieRental() throws Exception {
        customer.addRental(new Rental(regular,1));
        assertEquals("Rental Record for John\n" +
                "\tTop Gun\t2.0\n" +
                "Amount owed is 2.0\n" +
                "You earned 1 frequent renter points",customer.statement());
    }

    @Test
    public void testStatementForSingleRegularMovieRentalWithLateDues() throws Exception {
        customer.addRental(new Rental(regular,3));
        assertEquals("Rental Record for John\n" +
                "\tTop Gun\t3.5\n" +
                "Amount owed is 3.5\n" +
                "You earned 1 frequent renter points",customer.statement());
    }

    @Test
    public void testStatementForSingleNewMovieRental() throws Exception {
        customer.addRental(new Rental(newRelease,1));
        assertEquals("Rental Record for John\n" +
                "\tAvatar\t3.0\n" +
                "Amount owed is 3.0\n" +
                "You earned 1 frequent renter points",customer.statement());
    }

    @Test
    public void testStatementForSingleNewMovieRentalOverMultipleDays() throws Exception {
        customer.addRental(new Rental(newRelease,2));
        assertEquals("Rental Record for John\n" +
                "\tAvatar\t6.0\n" +
                "Amount owed is 6.0\n" +
                "You earned 2 frequent renter points",customer.statement());
    }

    @Test
    public void testStatementForSingleChildrensMovieRental() throws Exception {
        customer.addRental(new Rental(childrens,1));
        assertEquals("Rental Record for John\n" +
                "\tToy Story\t1.5\n" +
                "Amount owed is 1.5\n" +
                "You earned 1 frequent renter points",customer.statement());
    }

    @Test
    public void testStatementForSingleChildrensMovieRentalWithLateDues() throws Exception {
        customer.addRental(new Rental(childrens,4));
        assertEquals("Rental Record for John\n" +
                "\tToy Story\t3.0\n" +
                "Amount owed is 3.0\n" +
                "You earned 1 frequent renter points",customer.statement());
    }

    @Test
    public void testStatementForMultipleRentals() throws Exception {
        customer.addRental(new Rental(regular,1));
        customer.addRental(new Rental(childrens,1));
        customer.addRental(new Rental(newRelease,1));
        assertEquals("Rental Record for John\n" +
                "\tTop Gun\t2.0\n" +
                "\tToy Story\t3.5\n" +
                "\tAvatar\t6.5\n" +
                "Amount owed is 12.0\n" +
                "You earned 3 frequent renter points", customer.statement());
    }

    @Test
    public void testStatementForMultipleRentalsWithLateDues() throws Exception {
        customer.addRental(new Rental(regular,3));
        customer.addRental(new Rental(childrens,4));
        customer.addRental(new Rental(newRelease,1));
        assertEquals("Rental Record for John\n" +
                "\tTop Gun\t3.5\n" +
                "\tToy Story\t6.5\n" +
                "\tAvatar\t9.5\n" +
                "Amount owed is 19.5\n" +
                "You earned 3 frequent renter points", customer.statement());
    }


}