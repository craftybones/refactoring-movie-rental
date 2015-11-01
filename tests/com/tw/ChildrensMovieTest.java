package com.tw;

import org.junit.Test;

import static org.junit.Assert.*;

public class ChildrensMovieTest {

    @Test
    public void testGetPrice() throws Exception {
        ChildrensMovie movie = new ChildrensMovie("Toy Story");
        assertEquals(1.5,movie.getPrice(1),0);
    }

    @Test
    public void testGetPriceForLateDays() throws Exception {
        ChildrensMovie movie = new ChildrensMovie("Toy Story");
        assertEquals(3.0, movie.getPrice(4), 0);
    }


}