package command;

import java.util.List;

public class MultiplyingExpression extends ICommand {

    @Override
    public String calculate() {
        return ARGS.get(0);
    }
}
