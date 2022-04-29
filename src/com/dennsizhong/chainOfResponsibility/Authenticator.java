package com.dennsizhong.chainOfResponsibility;

public class Authenticator extends Handler {
    public Authenticator(Handler next) {
        super(next);
    }

    @Override
    public boolean doHandle(HttpRequest request) {
        if (request.getUserName() == "Admin" && request.getPassword() == "123") {
            System.out.println("Authenticating: Succeeded");
            return true;
        }

        System.out.println("Authenticating: Failed");
        return false;
    }
}
