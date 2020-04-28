package v2;

import java.util.List;

public class Line {

    private final List<Cmd> cmdList;

    public Line(List<Cmd> cmdList) {
        this.cmdList = cmdList;
    }

    public List<Cmd> getCmdList() {
        return cmdList;
    }
}
