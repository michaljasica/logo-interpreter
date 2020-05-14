package gui;

import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class ConsoleService {

    private static final String NEW_LINE = "\r\n";
    private static final String COMMAND_LINE_ELEMENT = ">> ";

    private final TextArea consoleView;
    private final TextField console;

    public ConsoleService(TextArea consoleView, TextField console) {
        this.consoleView = consoleView;
        this.console = console;
        console.setText(COMMAND_LINE_ELEMENT);
    }

    public String resolveCommands() {
        String command = console.getText();
        String transformedCommand = command.startsWith(COMMAND_LINE_ELEMENT) ? command.substring(2) : command;
        printOnConsoleView(transformedCommand);

        console.setText(COMMAND_LINE_ELEMENT);
        return transformedCommand;
    }

    private void printOnConsoleView (String newCommand) {
        consoleView.setText(getNewCommandLineText());
    }

    private String getNewCommandLineText() {
        return consoleView.getText() + NEW_LINE + console.getText();
    }

}
