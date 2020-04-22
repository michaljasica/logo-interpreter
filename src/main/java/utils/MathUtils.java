package utils;

import org.apache.commons.lang3.StringUtils;

import java.util.List;

public class MathUtils {

    public static String calculate(List<String> args) {
        Long result = args.stream()
                .map(MathUtils::toMathExpression)
                .reduce(MathExpression::calculate)
                .orElse(new MathExpression(0L))
                .getResult();
        return String.valueOf(result);
    }

    private static MathExpression toMathExpression(String arg) {
        if (StringUtils.isNumeric(arg)) {
            return new MathExpression(Long.valueOf(arg));
        } else {
            return new MathExpression(arg);
        }
    }

}
