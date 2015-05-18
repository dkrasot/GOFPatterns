/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package gofpatterns.creational.abstractfactory.cat;

/**
 *
 * @author A.Panchenko
 */
public class WoodenCat implements Cat{
    private String name;
    
    public WoodenCat() {
        this.name="WoodenCat";
        System.out.println("WoodenCat was created!");
    }

    @Override
    public String meow() {
        return "Meow-meow!";
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }
    
}
