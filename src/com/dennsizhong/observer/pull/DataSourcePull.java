package com.dennsizhong.observer.pull;

import com.dennsizhong.observer.Subject;

public class DataSourcePull extends SubjectPull {
    private int value;

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
        notifyObservers();
    }
}
