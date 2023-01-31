package com.ictec.dpatterns;

//Create an Abstract class to get factories for Color and Shape Objects
public abstract class AbstractFactory {
    abstract Color getColor(String colorType);
    abstract Shape getShape(String shapeType) ;
}
