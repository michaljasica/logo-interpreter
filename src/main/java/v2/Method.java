package v2;

import command.Type;

import java.util.List;

public class Method {

    private final Type type;
    private final List<Expressions> expressions;

    public Method(Type type, List<Expressions> expressions) {
        this.type = type;
        this.expressions = expressions;
    }
}
