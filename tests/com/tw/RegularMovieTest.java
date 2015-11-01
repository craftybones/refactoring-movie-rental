package com.tw;

import org.junit.Test;

import static org.junit.Assert.*;

public class RegularMovieTest {

    @Test
    public void testGetPrice() throws Exception {
        RegularMovie movie = new RegularMovie("Top Gun");
        assertEquals(2.0,movie.getPrice(1),0);
    }

    @Test
    public void testGetPriceForLateDays() throws Exception {
        RegularMovie movie = new RegularMovie("Top Gun");
        assertEquals(3.5, movie.getPrice(3), 0);
    }

}