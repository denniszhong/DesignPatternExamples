package com.dennsizhong.chainOfResponsibility;

public class Logger extends Handler {
    public Logger(Handler next) {
        super(next);
    }

    @Override
    public boolean doHandle(HttpRequest request) {
        System.out.println("Logging: user: " + request.getUserName());
        return true;
    }
}
