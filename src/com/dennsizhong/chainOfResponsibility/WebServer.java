package com.dennsizhong.chainOfResponsibility;

public class WebServer {
    private Handler handler;

    public WebServer(Handler handler) {
        this.handler = handler;
    }
    public void process(HttpRequest request) {
        handler.handle(request);
    }
}
