package com.tw;

/**
 * Created by srijays on 01/11/15.
 */
public interface IStatementFormatter {
    void customerName(String name);

    void addRental(String title, double amount);

    String statement();

    void footer(double totalAmount, int frequentRenterPoints);
}
