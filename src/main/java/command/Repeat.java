package command;

import java.util.List;

public class Repeat implements Command {

    private Type type;
    private Long value;
    private List<Command> commands;

    public Repeat(Type type, Long value, List<Command> commands) {
        this.type = type;
        this.commands = commands;
        this.value = value;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public List<Command> getCommands() {
        return commands;
    }

    public void setCommands(List<Command> commands) {
        this.commands = commands;
    }

    public Long getValue() {
        return value;
    }

    public void setValue(Long value) {
        this.value = value;
    }
}
