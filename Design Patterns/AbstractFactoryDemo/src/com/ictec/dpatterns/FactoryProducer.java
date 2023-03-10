package com.ictec.dpatterns;

//Create a Factory generator/producer class to get factories by passing an information such as
//Shape or Color
public class FactoryProducer {
    //*****
    public static AbstractFactory getFactory(String choice){
        if(choice.equalsIgnoreCase("SHAPE")){
            return new ShapeFactory();
        }else if(choice.equalsIgnoreCase("COLOR")){
            return new ColorFactory();
        }
        return null;
    }
}
