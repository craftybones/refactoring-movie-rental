package com.tw;

/**
 * Created by srijays on 01/11/15.
 */
public class DefaultStatementFormatter implements IStatementFormatter {
    private String finalStatement;

    public DefaultStatementFormatter() {
        finalStatement="";
    }

    @Override
    public void customerName(String name) {
        finalStatement+="Rental Record for "+name+"\n";
    }

    @Override
    public void addRental(String title, double amount) {
        String rental="\t"+title+"\t"+amount;
        finalStatement+=rental+"\n";
    }

    @Override
    public String statement() {
        return finalStatement;
    }

    @Override
    public void footer(double totalAmount, int frequentRenterPoints) {
        String amountOwed="Amount owed is "+totalAmount;
        String renterPoints="You earned "+frequentRenterPoints+" frequent renter points";
        finalStatement+=amountOwed+"\n"+renterPoints;
    }
}
