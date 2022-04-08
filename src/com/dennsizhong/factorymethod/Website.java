package com.dennsizhong.factorymethod;

import java.util.ArrayList;
import java.util.List;

public abstract class Website {
    protected List<Page> pages = new ArrayList<>();

    protected Website()
    {
        this.createWebsite();
    }

    protected abstract void createWebsite();

    public List<Page> getPages(){
        return pages;
    }
}
