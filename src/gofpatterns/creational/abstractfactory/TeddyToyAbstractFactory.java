package gofpatterns.creational.abstractfactory;

import gofpatterns.creational.abstractfactory.AbstractFactory;
import gofpatterns.creational.abstractfactory.bear.Bear;
import gofpatterns.creational.abstractfactory.bear.TeddyBear;
import gofpatterns.creational.abstractfactory.cat.TeddyCat;
import gofpatterns.creational.abstractfactory.cat.Cat;

public class TeddyToyAbstractFactory implements AbstractFactory {
    @Override
    public Bear getBear(){
        return new TeddyBear();
    }
    
    @Override
    public Cat getCat(){
        return new TeddyCat();
    }
}
