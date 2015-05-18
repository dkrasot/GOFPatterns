package gofpatterns.behavioral.command;

/**
 * The Command for turning on the light - ConcreteCommand #1
 */
public class Command_FlipUp implements Command {

    private Receiver_Light light;

    public Command_FlipUp(Receiver_Light light) {
        this.light = light;
    }

    @Override    // Command
    public void execute() {
        light.turnOn();
    }
}