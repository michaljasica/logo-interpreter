package utils;

import java.util.HashMap;
import java.util.Objects;
import java.util.function.BiFunction;

public class MathExpression {

    private static final HashMap<String, BiFunction<Long, Long, Long>> MATH_OPERATIONS = new HashMap<>();
    static {
        MATH_OPERATIONS.put("+", (a, b) -> a + b);
        MATH_OPERATIONS.put("-", (a, b) -> a - b);
        MATH_OPERATIONS.put("*", (a, b) -> a * b);
        MATH_OPERATIONS.put("/", (a, b) -> a / b);
    }

    private final Long result;
    private final String operator;

    public MathExpression(Long result) {
        this.result = result;
        this.operator = null;
    }

    public MathExpression(String operator) {
        this.result = null;
        this.operator = operator;
    }

    public MathExpression(Long result, String operator) {
        this.operator = operator;
        this.result = result;
    }

    public MathExpression calculate(MathExpression mathExpression) {
        if (Objects.nonNull(operator)) {
            Long operationResult = MATH_OPERATIONS.get(operator).apply(result, mathExpression.result);
            return new MathExpression(operationResult);
        } else {
            return new MathExpression(result, mathExpression.getOperator());
        }
    }

    public Long getResult() {
        return result;
    }

    public String getOperator() {
        return operator;
    }

}
