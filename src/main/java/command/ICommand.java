package command;

import java.util.ArrayList;
import java.util.List;

public abstract class ICommand {

    protected Type type;
    protected List<String> ARGS;

    public ICommand() {
        this.ARGS = new ArrayList<>();
    }

    public List<String> getARGS() {
        return ARGS;
    }

    public Type getType() {
        return type;
    }

    public abstract String calculate();

}
