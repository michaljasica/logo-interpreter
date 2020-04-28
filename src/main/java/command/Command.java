package command;

import java.util.List;

public class Command extends ICommand {

    public Command(Type type) {
        this.type = type;

    }

    @Override
    public String calculate() {
        return ARGS.get(0);
    }

}
