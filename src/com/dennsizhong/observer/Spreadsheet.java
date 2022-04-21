package com.dennsizhong.observer;

public class Spreadsheet implements Observer{
    @Override
    public void update(int value) {
        System.out.println("Spreadsheet updated: " + value);
    }
}
