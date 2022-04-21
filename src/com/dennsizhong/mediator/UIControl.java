package com.dennsizhong.mediator;

public class UIControl {
    // Every UI control knows it's owner
    protected DialogBox owner;

    public UIControl(DialogBox owner) {
        this.owner = owner;
    }
}
