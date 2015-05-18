package gofpatterns;

import gofpatterns.behavioral.command.Command;
import gofpatterns.behavioral.command.Command_FlipDown;
import gofpatterns.behavioral.command.Command_FlipUp;
import gofpatterns.behavioral.command.Invoker_Switch;
import gofpatterns.behavioral.command.Receiver_Light;
import gofpatterns.behavioral.mediator.TankCommanderAsMediator;
import gofpatterns.behavioral.mediator.TankDriver;
import gofpatterns.behavioral.mediator.TankGunner;
import gofpatterns.behavioral.mediator.TankLoader;
import gofpatterns.behavioral.strategy.Customer;
import gofpatterns.behavioral.strategy.HappyHourStrategy;
import gofpatterns.behavioral.strategy.NormalStrategy;
import gofpatterns.creational.LoggerSingleton;
import gofpatterns.creational.abstractfactory.bear.Bear;
import gofpatterns.creational.abstractfactory.cat.Cat;
import gofpatterns.creational.abstractfactory.AbstractFactory;
import gofpatterns.creational.abstractfactory.TeddyToyAbstractFactory;
import gofpatterns.creational.abstractfactory.WoodenToyAbstractFactory;
import gofpatterns.structural.facade.ComputerFacade;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class GOFPatterns {

    public static void main(String[] args) {

        //page 4
        LoggerSingleton logger = LoggerSingleton.getInstance();
        System.out.println("***CREATIONAL PATTERNS 2/5***");
        //System.out.println("____1 Abstract Factory 11____");
        logger.log("Abstract factory");
        C_absFactory_Wooden();
        C_absFactory_Teddy();
        //System.out.println("____2 Builder 14____");
        logger.log("Builder");
        C_builderWork();
        //...3 4
        //System.out.println("____5 Singleton 24____");        
        logger.log("Singleton was started before AbsFactory for logging");
        System.out.println("\n***STRUCTURAL PATTERNS 1/7***");
        //...6 7 8 9
        //System.out.println("____10 Facade 39____");
        logger.log("Facade");
        S_facadeWork();
        //...11 12        
        System.out.println("\n***BEHAVIORAL PATTERNS 4/11***");
        //13
        //System.out.println("____14 Command 55____");
        logger.log("Command");
        B_commandWork("ON");
        B_commandWork("OFF");
        B_commandWork("Test");
        //15
        //System.out.println("____16 Iterator 61____");
        logger.log("Iterator");
        B_iteratorWork();
        //System.out.println("____17 Mediator 64____");
        logger.log("Mediator");
        B_mediatorWork();
        //...18 20
        //System.out.println("____21 Strategy 79____");
        logger.log("Strategy");
        B_strategyWork();
        //...22 23
    }

    private static void C_absFactory_Wooden() {
        //Abstract factory
        AbstractFactory factory = new WoodenToyAbstractFactory();
        Bear bear = factory.getBear();
        Cat cat = factory.getCat();
        System.out.println("I've got " + bear.getName() + " and " + cat.getName());
    }

    private static void C_absFactory_Teddy() {
        //Abstract factory
        AbstractFactory factory = new TeddyToyAbstractFactory();
        Bear bear = factory.getBear();
        Cat cat = factory.getCat();
        System.out.println("I've got " + bear.getName() + " and " + cat.getName());
    }

    private static void S_facadeWork() {
        //Facade : http://en.wikipedia.org/wiki/Facade_pattern
        ComputerFacade pc = new ComputerFacade();
        pc.start();
    }

    private static void B_mediatorWork() {
        TankCommanderAsMediator mediator = new TankCommanderAsMediator();
        TankDriver driver = new TankDriver(mediator);
        TankGunner gunner = new TankGunner(mediator);
        TankLoader loader = new TankLoader(mediator);
        mediator.targetDetected("Puylo");
    }

    private static void B_iteratorWork() {
        //http://stackoverflow.com/questions/18410035/ways-to-iterate-over-a-list-in-java
        List<Integer> list = new ArrayList<>();
        for (Integer i : Arrays.asList(0, 1, 2, 3, 4, 5, 6, 7, 8, 9)) {
            list.add(i);
        }
        for (Integer i : list) {
            System.out.print(i + ", ");
        }
        System.out.println("");
//        for (Iterator<String> iter = list.iterator(); iter.hasNext();) {
//            // 1 - can call methods of element
//            // 2 - can use iter.remove() to remove the current element from the list
//        }
        for (ListIterator<Integer> iter = list.listIterator(); iter.hasNext();) {
            Integer number = iter.next();
            iter.add(number + 10);
            // 1 - can call methods of element
            // 2 - can use iter.remove() to remove the current element from the list
            // 3 - can use iter.add(...) to insert a new element into the list
            //     between element and iter->next()
            // 4 - can use iter.set(...) to replace the current element
        }
        for (Integer i : list) {
            System.out.print(i + ", ");
        }
        System.out.println("");
    }

    private static void B_strategyWork() {
        Customer a = new Customer();
        a.setStrategy(new NormalStrategy());
        // Normal billing
        a.add(1.0, 1);
        // Start Happy Hour
        a.setStrategy(new HappyHourStrategy());
        a.add(10.0, 2);
        // New Customer
        Customer b = new Customer();
        b.setStrategy(new HappyHourStrategy());
        b.add(1.0, 1);
        // The Customer Pays
        a.printBill();
        // End Happy Hour    
        b.setStrategy(new NormalStrategy());
        b.add(10.0, 2);
        b.add(100.0, 3);
        b.printBill();
    }

    private static void B_commandWork(String cmd) {
        Receiver_Light lamp = new Receiver_Light();
        Command switchUp = new Command_FlipUp(lamp);
        Command switchDown = new Command_FlipDown(lamp);

        Invoker_Switch mySwitch = new Invoker_Switch();

        switch (cmd) {
            case "ON":
                mySwitch.storeAndExecute(switchUp);
                break;
            case "OFF":
                mySwitch.storeAndExecute(switchDown);
                break;
            default:
                System.out.println("Argument \"ON\" or \"OFF\" is required.");
        }
    }
    
    private static void C_builderWork(){
        System.out.println("14 page. ADD BUILDER THERE");
    }
}