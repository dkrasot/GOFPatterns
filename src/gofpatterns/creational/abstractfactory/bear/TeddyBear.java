
package gofpatterns.creational.abstractfactory.bear;

public class TeddyBear implements Bear{
    private String name;
    public TeddyBear() {
        this.name="TeddyBear";
        System.out.println("TeddyBear was created!");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }        
}
