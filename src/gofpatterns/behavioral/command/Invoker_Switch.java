package gofpatterns.behavioral.command;

import java.util.ArrayList;
import java.util.List;

// class Invoker
public class Invoker_Switch {

    private List<Command> history = new ArrayList<>();

    public void storeAndExecute(Command cmd) {
        this.history.add(cmd);
        cmd.execute();
    }
}
