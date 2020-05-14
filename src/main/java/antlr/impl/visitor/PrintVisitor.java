package antlr.impl.visitor;

import antlr.generated.SimpleLogoBaseVisitor;
import antlr.generated.SimpleLogoParser;
import command.PrintCommand;
import command.Type;

public class PrintVisitor extends SimpleLogoBaseVisitor {

    private final ExpressionListener expressionListener;

    public PrintVisitor(ExpressionListener expressionListener) {
        this.expressionListener = expressionListener;
    }

    @Override
    public PrintCommand visitValue(SimpleLogoParser.ValueContext ctx) {
        String result = ctx.expression().accept(expressionListener).toString();
        return new PrintCommand(Type.PRINT, result);
    }

}
