package com.ictec.dpatterns;

//Create concrete class Green implementing Shape Color
public class Green implements Color{
    @Override
    public void fill() {
        System.out.println("Filling Green Color...!!!");
    }
}