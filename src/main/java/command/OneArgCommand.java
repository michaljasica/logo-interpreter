package command;

public class OneArgCommand {

    private Type type;
    private Long argument;

    public OneArgCommand(Type type, Long argument) {
        this.type = type;
        this.argument = argument;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public Long getArgument() {
        return argument;
    }

    public void setArgument(Long argument) {
        this.argument = argument;
    }
}
