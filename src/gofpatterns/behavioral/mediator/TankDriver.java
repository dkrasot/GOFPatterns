/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package gofpatterns.behavioral.mediator;

import java.util.Random;

public class TankDriver {
    private TankCommanderAsMediator commander;
    private int fuel = 1;

    public TankDriver(TankCommanderAsMediator commander) {
        this.commander = commander;
        this.commander.setDriver(this);
    }
    public void move(){
        if (fuel<=0){
            System.out.println("Driver: no fuel!");
            return;
        }
        System.out.println("Driver: tank is moving!");
        fuel--;
        //looking for new Target
        if ((new Random()).nextInt(2)==0){
            commander.targetDetected("armored");            
        } else {
            commander.targetDetected("infantry");
        }
    }
    
    public void halt(){
        System.out.println("Driver: tank has halted!");
    }
}
