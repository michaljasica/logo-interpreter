package gui;

import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.logging.Logger;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ConsoleService {

    private final static Logger LOGGER = Logger.getLogger(ConsoleService.class.getName());

    private static final String NEW_LINE = "\r\n";
    private static final String COMMAND_LINE_ELEMENT = ">> ";

    private final List<String> commandMemory = new ArrayList<>();
    private final TextArea consoleView;
    private final TextField console;
    private final Label errorOutput;
    private Integer iterator = 0;

    public ConsoleService(TextArea consoleView, TextField console, Label errorOutput) {
        this.consoleView = consoleView;
        this.console = console;
        this.errorOutput = errorOutput;
        console.setText(COMMAND_LINE_ELEMENT);
    }

    public String resolveCommands() {
        iterator = 0;
        String command = console.getText();
        commandMemory.add(command);
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

    public void errorOutput(String errorMessage) {
        errorOutput.setText(errorMessage);
    }

    public void errorClearOutput() {
        errorOutput.setText("");
    }

    public void keyUp() {
        if (commandMemory.size() == 0) {
            return;
        }

        iterator++;
        String s = iterator <= commandMemory.size()
                ? commandMemory.get(commandMemory.size() - iterator)
                : null;
        if (Objects.nonNull(s)) {
            console.setText(s + "");
        } else {
            iterator = commandMemory.size();
        }
    }

    public void keyDown() {
        if (commandMemory.size() == 0) {
            return;
        }

        iterator--;
        String s = iterator > 0
                ? commandMemory.get(commandMemory.size() - iterator)
                : null;
        if (Objects.nonNull(s)) {
            console.setText(s + "");
        } else {
            iterator = 0;
            console.setText(COMMAND_LINE_ELEMENT);
        }
    }

    private String printOnConsoleView(String text) {
        return consoleView.getText() + NEW_LINE + text;
    }

    private String getNewCommandLineText() {
        return commandMemory.stream()
                .collect(reverseStream())
                .limit(5)
                .collect(reverseStream())
                .map(o -> (String) o)
                .collect(Collectors.joining(NEW_LINE));
    }

    public static <T> Collector<Object, Object, Stream<Object>> reverseStream() {
        return Collectors
                .collectingAndThen(Collectors.toList(),
                        list -> {
                            Collections.reverse(list);
                            return list.stream();
                        });
    }

}
