package com.ictec.dpatterns;

//Create concrete class Red implementing Shape Color
public class Red implements Color{
    @Override
    public void fill() {
        System.out.println("Filling Red Color...!!!");
    }
}
