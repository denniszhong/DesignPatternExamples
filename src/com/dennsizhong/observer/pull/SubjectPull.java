package com.dennsizhong.observer.pull;

import java.util.ArrayList;
import java.util.List;

public class SubjectPull {
    private List<ObserverPull> observers =  new ArrayList<>();

    public void addObserver (ObserverPull observer) {
        observers.add(observer);
    }

    public void removeObserver (ObserverPull observer) {
        observers.remove(observer);
    }

    protected void notifyObservers() {
        for (var obs : observers) {
            obs.update();
        }
    }
}
