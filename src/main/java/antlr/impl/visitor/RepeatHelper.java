package antlr.impl.visitor;

import command.Command;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class RepeatHelper {

    public static List<Command> convertToCommandList(List<Command> commandList, Integer value) {
        List<Command> commands = new ArrayList<>();
        IntStream.range(0, value)
                .forEach(index -> commands.addAll(commandList));
        return commands;
    }

}
