package com.dennsizhong.observer;

import java.util.ArrayList;
import java.util.List;

public class Subject {
    private List<Observer> observers =  new ArrayList<>();

    public void addObserver (Observer observer) {
        observers.add(observer);
    }

    public void removeObserver (Observer observer) {
        observers.remove(observer);
    }

    protected void notifyObservers(int value) {
        for (var obs : observers) {
            obs.update(value);
        }
    }
}
