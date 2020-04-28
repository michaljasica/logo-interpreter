package v2;

import java.util.HashMap;
import java.util.function.BiFunction;

public class Number {

    private static final HashMap<String, BiFunction<Long, Long, Long>> MATH_OPERATIONS = new HashMap<>();
    static {
        MATH_OPERATIONS.put("+", (a, b) -> a + b);
        MATH_OPERATIONS.put("-", (a, b) -> a - b);
        MATH_OPERATIONS.put("*", (a, b) -> a * b);
        MATH_OPERATIONS.put("/", (a, b) -> a / b);
    }

    private Long number;
    private String operator;

    public Number(Long number, String operator) {
        this.number = number;
        this.operator = operator;
    }

    public Long getNumber() {
        return number;
    }

    public void setNumber(Long number) {
        this.number = number;
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    public Number merge (Number number) {
        Long apply = MATH_OPERATIONS
                .get(number.getOperator())
                .apply(this.number, number.getNumber());
        return new Number(apply, number.getOperator());
    }

}
