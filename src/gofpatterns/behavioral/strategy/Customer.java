/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package gofpatterns.behavioral.strategy;

import java.util.ArrayList;
import java.util.List;

public class Customer {

    private List<Double> drinks;
    private BillingStrategy strategy;

    public Customer() {
        this.drinks = new ArrayList<Double>();
    }

    public void add(double price, int quantity) {
        drinks.add(price * quantity);
    }

    public void printBill() {
        System.out.println("Total due: " + strategy.sum(drinks));
        drinks.clear();
    }

    public void setStrategy(BillingStrategy strategy) {
        this.strategy = strategy;
    }
}
