/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package gofpatterns.behavioral.mediator;

public class TankLoader {

    private TankCommanderAsMediator commander;

    public TankLoader(TankCommanderAsMediator commander) {
        this.commander = commander;
        this.commander.setLoader(this);
    }

    public String prepareWeapon(String target) {
        String weapon = "MachineGun";
        if (target.equals("armored")) {
            weapon = "Cannon";
        }
        System.out.println("Loader: " + weapon + " is ready!");
        return weapon;
    }
}
