package command;

public class TwoArgCommand implements Command {
    private final Type type;
    private final Long argument1;
    private final Long argument2;

    public TwoArgCommand(Type type, Long argument1, Long argument2) {
        this.type = type;
        this.argument1 = argument1;
        this.argument2 = argument2;
    }

    public Type getType() {
        return type;
    }

    public Long getArgumentOne() {
        return argument1;
    }

    public Long getArgumentTwo() {
        return argument2;
    }

}
