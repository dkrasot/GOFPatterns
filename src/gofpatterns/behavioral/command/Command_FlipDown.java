package gofpatterns.behavioral.command;

/**
 * The Command for turning off the light - ConcreteCommand #2
 */
public class Command_FlipDown implements Command {

    private Receiver_Light light;

    public Command_FlipDown(Receiver_Light light) {
        this.light = light;
    }

    @Override    // Command
    public void execute() {
        light.turnOff();
    }
}