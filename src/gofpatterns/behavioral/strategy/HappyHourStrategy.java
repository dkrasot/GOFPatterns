/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package gofpatterns.behavioral.strategy;

import java.util.List;

/**
 *
 * @author A.Panchenko
 */
public class HappyHourStrategy implements BillingStrategy {

    @Override
    public double sum(List<Double> drinks) {
        double sum=0;
        for(Double i:drinks){
            sum+=i;
        }
        return sum*0.9;
    }
}
