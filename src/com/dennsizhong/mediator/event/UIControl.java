package com.dennsizhong.mediator.event;

import java.util.ArrayList;
import java.util.List;

public abstract class UIControl {
    private List<EventHandler> eventHandlers = new ArrayList<>();

    public void addEventHandler(EventHandler handler) {
        eventHandlers.add(handler);
    }

    protected void notifyEventHandler() {
        for (var handler: eventHandlers) {
            handler.handle();
        }
    }
}
