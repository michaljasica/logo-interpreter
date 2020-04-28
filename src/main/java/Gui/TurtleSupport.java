package Gui;

import command.Command;
import command.ICommand;

import java.util.List;
import java.util.Stack;
import java.util.stream.Collectors;

public class TurtleSupport {

    public static Stack<ICommand> COMMANDS2;
    public String inputcommand; //string z inputa z frontu do przekazania do Main
    public Stack<ICommand> VALUES;
    public void ValuesStackFill(Stack<ICommand> VALUES) {
        List<String> collect = VALUES.stream().map(ICommand::calculate).collect(Collectors.toList());
    }
    public void StacksMerge(List<String> values, Stack<ICommand> COMMANDS2){
        //łączenie listy i stacka do mapy
    }
}
