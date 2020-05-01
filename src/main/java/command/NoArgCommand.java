package command;

public class NoArgCommand implements Command {

    private final Type type;

    public NoArgCommand(Type type) {
        this.type = type;
    }

    @Override
    public Type getType() {
        return type;
    }

}
