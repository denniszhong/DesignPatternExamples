package com.dennsizhong.command;

import com.dennsizhong.command.fx.Command;

public class BlackAndWhiteCommand implements Command {
    @Override
    public void execute() {
        System.out.println("Apply Black and White");
    }
}
