package gui;

import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

import java.util.List;
import java.util.logging.Logger;
import java.util.stream.Collectors;

public class ConsoleService {

    private final static Logger LOGGER = Logger.getLogger(ConsoleService.class.getName());

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
        consoleView.setText(getNewCommandLineText());
        console.setText(COMMAND_LINE_ELEMENT);

        return transformedCommand;
    }

    public void doPrintCommands(List<String> commands) {
        String collect = commands.stream()
                .collect(Collectors.joining(" "));

        LOGGER.info("PRINTING VALUE: " + collect);
        String value = printOnConsoleView(collect);

        consoleView.setText(value);
        console.setText(COMMAND_LINE_ELEMENT);
    }

    private String printOnConsoleView (String text) {
        return consoleView.getText() + NEW_LINE + text;
    }

    private String getNewCommandLineText() {
        return consoleView.getText() + NEW_LINE + console.getText();
    }

}
