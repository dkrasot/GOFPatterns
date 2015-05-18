/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package gofpatterns.creational.abstractfactory;

import gofpatterns.creational.abstractfactory.AbstractFactory;
import gofpatterns.creational.abstractfactory.bear.Bear;
import gofpatterns.creational.abstractfactory.bear.WoodenBear;
import gofpatterns.creational.abstractfactory.cat.Cat;
import gofpatterns.creational.abstractfactory.cat.WoodenCat;

public class WoodenToyAbstractFactory implements AbstractFactory {
    
    @Override
    public Bear getBear() {
        return new WoodenBear();
    }

    @Override
    public Cat getCat() {
        return new WoodenCat();
    }
}
