package antlr.impl.listener;

import antlr.generated.SimpleLogoBaseVisitor;
import antlr.generated.SimpleLogoParser;
import command.Command;
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
    public Command visitCs(SimpleLogoParser.CsContext ctx) {
        return new Command(Type.CS);
    }

    @Override
    public Command visitPu(SimpleLogoParser.PuContext ctx) {
        return new Command(Type.PU);
    }

    @Override
    public Command visitPd(SimpleLogoParser.PdContext ctx) {
        return new Command(Type.PD);
    }

    @Override
    public Command visitHt(SimpleLogoParser.HtContext ctx) {
        return new Command(Type.PD);
    }

    @Override
    public Command visitSt(SimpleLogoParser.StContext ctx) {
        return new Command(Type.ST);
    }

    @Override
    public Command visitHome(SimpleLogoParser.HomeContext ctx) {
        return new Command(Type.HOME);
    }

    @Override
    public Command visitStop(SimpleLogoParser.StopContext ctx) {
        return new Command(Type.STOP);
    }

    @Override
    public Command visitLabel(SimpleLogoParser.LabelContext ctx) {
        return new Command(Type.LABEL);
    }

    @Override
    public Command visitRepeat(SimpleLogoParser.RepeatContext ctx) {
        return new Command(Type.REPEAT);
    }

}
