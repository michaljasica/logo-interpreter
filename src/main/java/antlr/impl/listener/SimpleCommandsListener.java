package antlr.impl.listener;

import antlr.generated.SimpleLogoBaseVisitor;
import antlr.generated.SimpleLogoParser;
import command.*;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SimpleCommandsListener extends SimpleLogoBaseVisitor {

    private ExpressionListener expressionListener = new ExpressionListener();

    @Override
    public List<OneArgCommand> visitFd(SimpleLogoParser.FdContext ctx) {
        Long accept = (Long) ctx.expression().accept(expressionListener);
        return Collections.singletonList(new OneArgCommand(Type.FD, accept));
    }
    @Override
    public List<OneArgCommand> visitBk(SimpleLogoParser.BkContext ctx) {
        Long accept = (Long) ctx.expression().accept(expressionListener);
        return Collections.singletonList(new OneArgCommand(Type.BK, accept));
    }

    @Override
    public List<OneArgCommand> visitRt(SimpleLogoParser.RtContext ctx) {
        Long accept = (Long) ctx.expression().accept(expressionListener);
        return Collections.singletonList(new OneArgCommand(Type.RT, accept));
    }

    @Override
    public List<OneArgCommand> visitLt(SimpleLogoParser.LtContext ctx) {
        Long accept = (Long) ctx.expression().accept(expressionListener);
        return Collections.singletonList(new OneArgCommand(Type.LT, accept));
    }

    @Override
    public List<NoArgCommand> visitCs(SimpleLogoParser.CsContext ctx) {
        return Collections.singletonList(new NoArgCommand(Type.CS));
    }

    @Override
    public List<NoArgCommand> visitPu(SimpleLogoParser.PuContext ctx) {
        return Collections.singletonList(new NoArgCommand(Type.PU));
    }

    @Override
    public List<NoArgCommand> visitPd(SimpleLogoParser.PdContext ctx) {
        return Collections.singletonList(new NoArgCommand(Type.PD));
    }

    @Override
    public List<NoArgCommand> visitHt(SimpleLogoParser.HtContext ctx) {
        return Collections.singletonList(new NoArgCommand(Type.HT));
    }

    @Override
    public List<NoArgCommand> visitSt(SimpleLogoParser.StContext ctx) {
        return Collections.singletonList(new NoArgCommand(Type.ST));
    }

    @Override
    public List<NoArgCommand> visitHome(SimpleLogoParser.HomeContext ctx) {
        return Collections.singletonList(new NoArgCommand(Type.HOME));
    }

    @Override
    public List<NoArgCommand> visitStop(SimpleLogoParser.StopContext ctx) {
        return Collections.singletonList(new NoArgCommand(Type.STOP));
    }

    @Override
    public List<NoArgCommand> visitLabel(SimpleLogoParser.LabelContext ctx) {
        return Collections.singletonList(new NoArgCommand(Type.LABEL));
    }

    @Override
    public List<Command> visitRepeat(SimpleLogoParser.RepeatContext ctx) {
        Long expressionValue = (Long) ctx.expression().accept(expressionListener);
        return (List<Command>) ctx.block().accept(this);
    }

    @Override
    public List<Command> visitBlock(SimpleLogoParser.BlockContext ctx) {
        SimpleCommandsListener methodListener = new SimpleCommandsListener();
        return ctx.cmd().stream()
                .flatMap(cmd -> ((List<Command>) cmd.accept(methodListener)).stream())
                .collect(Collectors.toList());
    }

}
