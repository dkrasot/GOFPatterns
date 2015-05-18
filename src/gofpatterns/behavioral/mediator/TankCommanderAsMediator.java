/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package gofpatterns.behavioral.mediator;
//
public class TankCommanderAsMediator {
    private TankDriver driver;
    private TankGunner gunner;
    private TankLoader loader;

    public void setDriver(TankDriver driver) {
        this.driver = driver;
    }
    public void setGunner(TankGunner gunner) {
        this.gunner = gunner;
    }
    public void setLoader(TankLoader loader) {
        this.loader = loader;
    }
    
    public void targetDetected(String target){
        System.out.println("Commander: new target detected!");
        gunner.setWeapon(loader.prepareWeapon(target));
        driver.halt();
        gunner.fire(target);        
    }
    
    public void noTarget(){
        System.out.println("Commander: no target.");
        gunner.stopFire();
        driver.move();
    }
}
