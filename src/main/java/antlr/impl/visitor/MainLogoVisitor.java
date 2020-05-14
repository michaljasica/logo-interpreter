package antlr.impl.visitor;

import antlr.generated.SimpleLogoBaseVisitor;
import antlr.generated.SimpleLogoLexer;
import antlr.generated.SimpleLogoParser;
import command.Command;
import org.antlr.v4.runtime.*;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class MainLogoVisitor extends SimpleLogoBaseVisitor {

    private final SimpleCommandsListener simpleCommandsListener;
    private final PrintVisitor printVisitor;

    public MainLogoVisitor(SimpleCommandsListener simpleCommandsListener, PrintVisitor printVisitor) {
        this.simpleCommandsListener = simpleCommandsListener;
        this.printVisitor = printVisitor;
    }

    public List<Command> parse(String input) {
        CharStream charStream = new ANTLRInputStream(input);
        SimpleLogoLexer markupLexer = new SimpleLogoLexer(charStream);
        CommonTokenStream commonTokenStream = new CommonTokenStream(markupLexer);
        SimpleLogoParser logoParser = new SimpleLogoParser(commonTokenStream);

        SimpleLogoParser.ProgContext prog = logoParser.prog();
        return visitProg(prog);
    }

    @Override
    public List<Command> visitProg(SimpleLogoParser.ProgContext ctx) {
        return ctx.line().stream()
                .map(method -> ((List<Command>) method.accept(this)))
                .flatMap(list -> ((List<Command>) list).stream())
                .collect(Collectors.toList());
    }

    @Override
    public List<Command> visitLine(SimpleLogoParser.LineContext ctx) {
        return ctx.children.stream()
                .map(method -> (List<Command>) method.accept(this))
                .flatMap(list -> ((List<Command>) list).stream())
                .collect(Collectors.toList());
    }

    @Override
    public List<Command> visitCmd(SimpleLogoParser.CmdContext ctx) {
        List<Command> collect = ctx.children.stream()
                .map(method -> ((List<Command>) method.accept(simpleCommandsListener)))
                .flatMap(list -> ((List<Command>) list).stream())
                .collect(Collectors.toList());
        return collect;
    }

    @Override
    public List<Command> visitPrint(SimpleLogoParser.PrintContext ctx) {
        Command accept = (Command) ctx.value().accept(printVisitor);
        return Collections.singletonList(accept);
    }

}
