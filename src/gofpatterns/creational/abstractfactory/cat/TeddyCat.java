package gofpatterns.creational.abstractfactory.cat;

public class TeddyCat implements Cat{    
    
    private String name;
    
    public TeddyCat() {
        this.name="TeddyCat";
        System.out.println("TeddyCat was created!");
    }

    @Override
    public String meow() {
        return "Meow!";
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
