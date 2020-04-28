package command;

public class NoArgCommand implements Command {

    private Type type;

    public NoArgCommand(Type type) {
        this.type = type;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }
}
