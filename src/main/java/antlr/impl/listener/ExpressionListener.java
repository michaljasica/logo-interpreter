package antlr.impl.listener;

import antlr.generated.SimpleLogoBaseVisitor;
import antlr.generated.SimpleLogoParser;
import org.antlr.v4.runtime.RuleContext;
import org.antlr.v4.runtime.tree.ParseTree;
import command.Number;

import java.util.Arrays;
import java.util.List;
import java.util.logging.Logger;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ExpressionListener extends SimpleLogoBaseVisitor {

    private final static Logger LOGGER = Logger.getLogger(ExpressionListener.class.getName());

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
                .map(ParseTree::getText)
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

        return IntStream.range(0, numbers.size() - 1)
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

        return IntStream.range(0, numbers.size() - 1)
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
    public String visitNumber(SimpleLogoParser.NumberContext ctx) {
        return String.valueOf(ctx.NUMBER());
    }

    private List<String> getOperators(SimpleLogoParser.MultiplyingExpressionContext ctx) {
        List<String> operators = ctx.mulOrDiv().stream()
                .map(obj -> (String) obj.accept(this))
                .collect(Collectors.toList());
        List<String> mockOperator = Arrays.asList("+");
        mockOperator.addAll(operators);
        return mockOperator;
    }

    //TODO
    private List<String> getOperators(SimpleLogoParser.ExpressionContext ctx) {
        List<String> operators = ctx.plusOrMinus().stream()
                .map(obj -> (String) obj.accept(this))
                .collect(Collectors.toList());
        List<String> mockOperator = Arrays.asList("+");
        mockOperator.addAll(operators);
        return mockOperator;
    }

    private String mergeOperators(String a, String b) {
        return a.equals(b) ? "+" : "-";
    }

}
