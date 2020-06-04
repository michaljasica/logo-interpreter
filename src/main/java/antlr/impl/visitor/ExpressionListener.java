package antlr.impl.visitor;

import antlr.generated.SimpleLogoBaseVisitor;
import antlr.generated.SimpleLogoParser;
import org.antlr.v4.runtime.RuleContext;
import org.antlr.v4.runtime.tree.ParseTree;
import command.Number;

import java.util.*;
import java.util.logging.Logger;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ExpressionListener extends SimpleLogoBaseVisitor {

    private final HashMap<String, String> variableMemory = new HashMap<>();
    private final static Logger LOGGER = Logger.getLogger(ExpressionListener.class.getName());

    public HashMap<String, String> getVariableMemory() {
        return variableMemory;
    }

    @Override
    public Number visitSignExpression(SimpleLogoParser.SignExpressionContext ctx) {
        LOGGER.info("visitSignExpression");
        String operator = ctx.plusOrMinus()
                .stream()
                .map(RuleContext::getText)
                .reduce(this::mergeOperators)
                .orElse("");
        Long accept = (Long) ctx.expressionValue().accept(this);
        return new Number(accept, operator);
    }

    @Override
    public Long visitExpressionValue(SimpleLogoParser.ExpressionValueContext ctx) {
        return Long.valueOf(ctx.children.stream()
                .map(obj -> (String) obj.accept(this))
                .findFirst()
                .orElse("0"));
    }

    @Override
    public Number visitMultiplyingExpression(SimpleLogoParser.MultiplyingExpressionContext ctx) {
        LOGGER.info("visitMultiplyingExpression");
        List<String> operators = getOperators(ctx);
        List<SimpleLogoParser.SignExpressionContext> signExpressionContexts = ctx.signExpression();
        List<Long> numbers = signExpressionContexts.stream()
                .map(obj -> (Number) obj.accept(this))
                .map(Number::getNumber)
                .collect(Collectors.toList());

        return IntStream.range(0, numbers.size())
                .boxed()
                .map(index -> new Number(numbers.get(index), operators.get(index)))
                .reduce(Number::merge)
                .orElse(new Number(numbers.get(0), ""));
    }

    @Override
    public Long visitExpression(SimpleLogoParser.ExpressionContext ctx) {
        LOGGER.info("ENTER EXPRESSION");
        List<String> operators = getOperators(ctx);
        List<Long> numbers = ctx.multiplyingExpression().stream()
                .map(obj -> (Number) obj.accept(this))
                .map(Number::getNumber)
                .collect(Collectors.toList());

        return IntStream.range(0, numbers.size())
                .boxed()
                .map(index -> new Number(numbers.get(index), operators.get(index)))
                .reduce(Number::merge)
                .orElse(new Number(numbers.get(0), ""))
                .getNumber();
    }

    @Override
    public String visitPlusOrMinus(SimpleLogoParser.PlusOrMinusContext ctx) {
        return ctx.getChild(0)
                .getText();
    }

    @Override
    public String visitMulOrDiv(SimpleLogoParser.MulOrDivContext ctx) {
        return ctx.getChild(0)
                .getText();
    }

    @Override
    public String visitFunc(SimpleLogoParser.FuncContext ctx) {
        return (String) ctx.random().accept(this);
    }

    @Override
    public String visitRandom(SimpleLogoParser.RandomContext ctx) {
        String accept = (String) ctx.expression().accept(this);
        double random = new Random().nextDouble() * Long.parseLong(accept);
        return Integer.valueOf((int) random).toString();
    }

    @Override
    public String visitNumber(SimpleLogoParser.NumberContext ctx) {
        return String.valueOf(ctx.NUMBER());
    }

    @Override
    public String visitDeref(SimpleLogoParser.DerefContext ctx) {
        return String.valueOf(variableMemory.get(ctx.name().STRING().toString()));
    }

    @Override
    public String visitValue(SimpleLogoParser.ValueContext ctx) {
        return Objects.nonNull(ctx.STRINGLITERAL())
                ? ctx.STRINGLITERAL().toString()
                : ctx.children.stream()
                    .map(obj -> obj.accept(this))
                    .map(Object::toString)
                    .findFirst()
                    .orElse("");
    }

    private List<String> getOperators(SimpleLogoParser.MultiplyingExpressionContext ctx) {
        List<String> operators = ctx.mulOrDiv().stream()
                .map(obj -> (String) obj.accept(this))
                .collect(Collectors.toList());
        List<String> mockOperator = new ArrayList<>();
        mockOperator.add("+");
        mockOperator.addAll(operators);
        return mockOperator;
    }

    //TODO
    private List<String> getOperators(SimpleLogoParser.ExpressionContext ctx) {
        List<String> operators = ctx.plusOrMinus().stream()
                .map(obj -> (String) obj.accept(this))
                .collect(Collectors.toList());
        List<String> mockOperator = new ArrayList<>();
        mockOperator.add("+");
        mockOperator.addAll(operators);
        return mockOperator;
    }

    private String mergeOperators(String a, String b) {
        return a.equals(b) ? "+" : "-";
    }

}
