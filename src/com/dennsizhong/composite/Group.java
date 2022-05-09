package com.dennsizhong.composite;

import java.util.ArrayList;
import java.util.List;

public class Group implements Component{
    private List<Component> components = new ArrayList<>();
    private String name;

    public Group(String name) {
        this.name = name;
    }

    @Override
    public void render() {
        System.out.println("Rendering group start: " + name);
        for (var com: components)
            com.render();
        System.out.println("Rendering group - end: "+ name);
    }

    @Override
    public void move() {
        System.out.println("Moving a group - start");
        for (var com: components)
            com.render();
        System.out.println("Moving a group - end");
    }

    public void add(Component component) {
        components.add(component);
    }
}
