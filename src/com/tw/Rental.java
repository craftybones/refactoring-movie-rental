package com.tw;

public class Rental {

    private Movie movie;
    private int daysRented;

    public Rental(Movie movie, int daysRented) {
        this.movie = movie;
        this.daysRented = daysRented;
    }

    public int getDaysRented() {
        return daysRented;
    }

    public Movie getMovie() {
        return movie;
    }

    public double amount() {
        return movie.getPrice(daysRented);
    }

    public int frequentRenterPoints() {
        return movie.frequentRenterPoints(daysRented);
    }

    public String getTitle() {
        return movie.getTitle();
    }
}
