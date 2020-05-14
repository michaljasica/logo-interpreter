package antlr.impl.parser;

import antlr.generated.SimpleLogoBaseVisitor;
import antlr.generated.SimpleLogoLexer;
import antlr.generated.SimpleLogoParser;
import antlr.impl.visitor.SimpleCommandsListener;
import command.Command;
import org.antlr.v4.runtime.*;

import java.util.List;
import java.util.stream.Collectors;

public class SimpleLogoParserImpl extends SimpleLogoBaseVisitor {

    private final SimpleCommandsListener simpleCommandsListener;

    public SimpleLogoParserImpl(SimpleCommandsListener simpleCommandsListener) {
        this.simpleCommandsListener = simpleCommandsListener;
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
        return ctx.cmd().stream()
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

}
