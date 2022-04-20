package com.dennsizhong.command;

import com.dennsizhong.command.fx.Command;

public class ResizeCommand implements Command {
    @Override
    public void execute() {
        System.out.println("Resize image");
    }
}
