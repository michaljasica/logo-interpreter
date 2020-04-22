package command;

import java.util.ArrayList;
import java.util.List;

public class SignExpression extends ICommand {

    public SignExpression() {
        this.ARGS = new ArrayList<>();
    }

    @Override
    public String calculate() {
        return ARGS.get(0);
    }

}
