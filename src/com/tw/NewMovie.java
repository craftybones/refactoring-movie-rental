package com.tw;

/**
 * Created by srijays on 01/11/15.
 */
public class NewMovie extends Movie {
    private static double basePrice=3.0;
    private static double lateFees=0.0;

    public NewMovie(String title) {
        super(title);
    }


    @Override
    public double getPrice(int daysRented) {
        return basePrice*daysRented;
    }

    @Override
    protected int numberOfExtraDays(int daysRented) {
        int extraDays=daysRented-2;
        return extraDays>0?extraDays:0;
    }
}
