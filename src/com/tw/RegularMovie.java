package com.tw;

/**
 * Created by srijays on 01/11/15.
 */
public class RegularMovie extends Movie {
    private static double basePrice=2.0;
    private static double lateFees=1.5;

    public RegularMovie(String title) {
        super(title);
    }

    @Override
    public double getPrice(int daysRented) {
        return basePrice+lateFees*numberOfExtraDays(daysRented);
    }

    @Override
    protected int numberOfExtraDays(int daysRented) {
        int extraDays=daysRented-2;
        return extraDays>0?extraDays:0;
    }
}
