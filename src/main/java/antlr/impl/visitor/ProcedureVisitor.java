package antlr.impl.visitor;

import antlr.generated.SimpleLogoBaseVisitor;
import antlr.generated.SimpleLogoParser;
import command.PrintCommand;
import command.Type;

public class ProcedureVisitor extends SimpleLogoBaseVisitor {

    private final SimpleCommandsListener simpleCommandsListener;

    public ProcedureVisitor(SimpleCommandsListener simpleCommandsListener) {
        this.simpleCommandsListener = simpleCommandsListener;
    }

    @Override
    public PrintCommand visitName(SimpleLogoParser.NameContext ctx) {
        String result = String.valueOf(ctx.STRING());
        return new PrintCommand(Type.PRINT, result);
    }

}
