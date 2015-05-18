package gofpatterns.creational.abstractfactory.bear;

public class WoodenBear implements Bear{
    private String name;
    
    public WoodenBear() {
        this.name="WoodenBear";
        System.out.println("WoodenBear was created!");
    }    

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }        
}
