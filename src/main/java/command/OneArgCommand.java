package command;

public class OneArgCommand implements Command {

    private final Type type;
    private final Long argument;

    public OneArgCommand(Type type, Long argument) {
        this.type = type;
        this.argument = argument;
    }

    public Type getType() {
        return type;
    }

    public Long getArgument() {
        return argument;
    }

}