/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package gofpatterns.behavioral.mediator;

public class TankGunner {
    private TankCommanderAsMediator commander;
    private String weapon = "MachineGun";

    public TankGunner(TankCommanderAsMediator commander) {
        this.commander = commander;
        this.commander.setGunner(this);
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }
    
    public void fire(String target){
        System.out.println("Gunner ["+weapon+"]: "+target+" is under fire!");
        commander.noTarget();//target was destroyed
    }
    
    public void stopFire(){
        System.out.println("Gunner ["+weapon+"]: Fire is stopped.");
    }
}
