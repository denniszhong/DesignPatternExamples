package com.dennsizhong.composite;

public class Shape implements Component {
    private String name;

    public Shape(String name) {
        this.name = name;
    }

    @Override
    public void render() {
        System.out.println("Rendering shape: " + name);
    }

    @Override
    public void move() {
        System.out.println("Moving shape: " + name);
    }
}
