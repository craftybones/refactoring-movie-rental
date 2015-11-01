package com.tw;

import org.junit.Test;

import static org.junit.Assert.*;

public class NewMovieTest {
    @Test
    public void testGetPrice() throws Exception {
        NewMovie movie = new NewMovie("Avatar");
        assertEquals(3.0,movie.getPrice(1),0);
    }

    @Test
    public void testGetPriceForLateDays() throws Exception {
        NewMovie movie = new NewMovie("Avatar");
        assertEquals(9, movie.getPrice(3), 0);
    }
}