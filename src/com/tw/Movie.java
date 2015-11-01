package com.tw;

public abstract class Movie {
    private String title;
    private int priceCode;

    public Movie(String title) {
        this.title = title;
    }

    public int getPriceCode() {
        return priceCode;
    }


    public void setPriceCode(int arg) {
        priceCode = arg;
    }
    public String getTitle() {
        return title;
    }


    protected abstract double getPrice(int daysRented);

    protected abstract int numberOfExtraDays(int daysRented);

    public abstract int frequentRenterPoints(int daysRented);
}
