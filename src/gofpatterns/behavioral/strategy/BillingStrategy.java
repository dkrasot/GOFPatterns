/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package gofpatterns.behavioral.strategy;

import java.util.List;

interface BillingStrategy {
    public double sum(List<Double> drinks);
}
