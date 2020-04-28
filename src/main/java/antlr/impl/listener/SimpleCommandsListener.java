package antlr.impl.listener;

import antlr.generated.SimpleLogoBaseVisitor;
import antlr.generated.SimpleLogoParser;
import command.NoArgCommand;
import command.OneArgCommand;
import command.Type;

public class SimpleCommandsListener extends SimpleLogoBaseVisitor {

    private ExpressionListener expressionListener = new ExpressionListener();

    @Override
    public OneArgCommand visitFd(SimpleLogoParser.FdContext ctx) {
        Long accept = (Long) ctx.expression().accept(expressionListener);
        return new OneArgCommand(Type.FD, accept);
    }
    @Override
    public OneArgCommand visitBk(SimpleLogoParser.BkContext ctx) {
        Long accept = (Long) ctx.expression().accept(expressionListener);
        return new OneArgCommand(Type.BK, accept);
    }

    @Override
    public OneArgCommand visitRt(SimpleLogoParser.RtContext ctx) {
        Long accept = (Long) ctx.expression().accept(expressionListener);
        return new OneArgCommand(Type.RT, accept);
    }

    @Override
    public OneArgCommand visitLt(SimpleLogoParser.LtContext ctx) {
        Long accept = (Long) ctx.expression().accept(expressionListener);
        return new OneArgCommand(Type.LT, accept);
    }

    @Override
    public NoArgCommand visitCs(SimpleLogoParser.CsContext ctx) {
        return new NoArgCommand(Type.CS);
    }

    @Override
    public NoArgCommand visitPu(SimpleLogoParser.PuContext ctx) {
        return new NoArgCommand(Type.PU);
    }

    @Override
    public NoArgCommand visitPd(SimpleLogoParser.PdContext ctx) {
        return new NoArgCommand(Type.PD);
    }

    @Override
    public NoArgCommand visitHt(SimpleLogoParser.HtContext ctx) {
        return new NoArgCommand(Type.PD);
    }

    @Override
    public NoArgCommand visitSt(SimpleLogoParser.StContext ctx) {
        return new NoArgCommand(Type.ST);
    }

    @Override
    public NoArgCommand visitHome(SimpleLogoParser.HomeContext ctx) {
        return new NoArgCommand(Type.HOME);
    }

    @Override
    public NoArgCommand visitStop(SimpleLogoParser.StopContext ctx) {
        return new NoArgCommand(Type.STOP);
    }

    @Override
    public NoArgCommand visitLabel(SimpleLogoParser.LabelContext ctx) {
        return new NoArgCommand(Type.LABEL);
    }

    @Override
    public NoArgCommand visitRepeat(SimpleLogoParser.RepeatContext ctx) {
        return new NoArgCommand(Type.REPEAT);
    }

}
