package antlr.impl.parser;

import antlr.generated.SimpleLogoBaseVisitor;
import antlr.generated.SimpleLogoLexer;
import antlr.generated.SimpleLogoParser;
import antlr.impl.listener.SimpleCommandsListener;
import command.Command;
import command.OneArgCommand;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.NotNull;
import v2.Line;
import v2.Prog;

import java.util.List;
import java.util.stream.Collectors;

public class SimpleLogoParserImpl {

    public List<OneArgCommand> parse(String input) {
        CharStream charStream = new ANTLRInputStream(input);
        SimpleLogoLexer markupLexer = new SimpleLogoLexer(charStream);
        CommonTokenStream commonTokenStream = new CommonTokenStream(markupLexer);
        SimpleLogoParser logoParser = new SimpleLogoParser(commonTokenStream);

        SimpleLogoParser.ProgContext prog = logoParser.prog();
        return new ClassListener()
                .visitProg(prog);
    }

    class ClassListener extends SimpleLogoBaseVisitor {

        @Override
        public List<OneArgCommand> visitProg(@NotNull SimpleLogoParser.ProgContext ctx) {
            LineListener lineListener = new LineListener();
            return ctx.line().stream()
                    .map(method -> method.accept(lineListener))
                    .flatMap(list -> ((List<OneArgCommand>)list).stream())
                    .collect(Collectors.toList());
        }

    }

    class LineListener extends SimpleLogoBaseVisitor {

        @Override
        public List<OneArgCommand> visitLine(@NotNull SimpleLogoParser.LineContext ctx) {
            CmdListener cmdListener = new CmdListener();
            return ctx.cmd().stream()
                    .map(method -> method.accept(cmdListener))
                    .flatMap(list -> ((List<OneArgCommand>)list).stream())
                    .collect(Collectors.toList());
        }

    }

    class CmdListener extends SimpleLogoBaseVisitor {

        @Override
        public List<OneArgCommand> visitCmd(@NotNull SimpleLogoParser.CmdContext ctx) {
            SimpleCommandsListener methodListener = new SimpleCommandsListener();
            List<OneArgCommand> collect = ctx.children.stream()
                    .map(method -> ((OneArgCommand) method.accept(methodListener)))
                    .collect(Collectors.toList());
            return collect;
        }
    }

}
