package command;

import java.util.List;

public class Expression extends ICommand {

    @Override
    public String calculate() {
        return ARGS.get(0);
    }

}
