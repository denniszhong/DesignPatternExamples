package com.dennsizhong.command;

import com.dennsizhong.command.fx.Command;

import java.util.ArrayList;
import java.util.List;

public class CompositCommand implements Command {
    private List<Command> commands = new ArrayList();

    public void add(Command command) {
        commands.add(command);
    }

    @Override
    public void execute() {
        for (var cmd: commands) {
            cmd.execute();
        }
    }
}
