package com.tw;
import java.util.ArrayList;
import java.util.List;

public class Customer {

    private String name;
    private Rentals rentals = new Rentals();

    public Customer(String name) {
        this.name = name;
    }

    public void addRental(Rental arg) {
        rentals.add(arg);
    }

    public String getName() {
        return name;
    }

    public String statement(IStatementFormatter formatter) {
        double thisAmount = 0;
        double totalAmount = 0;
        int frequentRenterPoints = 0;

        formatter.customerName(getName());

        for (Rental rental: rentals) {
            thisAmount = rental.amount();
            frequentRenterPoints += rental.frequentRenterPoints();
            formatter.addRental(rental.getTitle(),thisAmount);
            totalAmount += thisAmount;
        }

        formatter.footer(totalAmount,frequentRenterPoints);
        return formatter.statement();
    }

}
