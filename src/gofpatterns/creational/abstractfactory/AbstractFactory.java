package gofpatterns.creational.abstractfactory;

import gofpatterns.creational.abstractfactory.bear.Bear;
import gofpatterns.creational.abstractfactory.cat.Cat;

public interface AbstractFactory {
    Bear getBear();
    Cat getCat();
}
