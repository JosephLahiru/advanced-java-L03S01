package com.ictec.dpatterns;

public class SimpleNameClass implements SimpleNameInterface {
    private String name = null;
    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }
}
