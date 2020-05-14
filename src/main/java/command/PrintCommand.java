package command;

public class PrintCommand implements Command  {

    private final Type type;
    private final String text;

    public PrintCommand(Type type, String text) {
        this.type = type;
        this.text = text;
    }

    @Override
    public Type getType() {
        return type;
    }

    public String getText() {
        return text;
    }

}
