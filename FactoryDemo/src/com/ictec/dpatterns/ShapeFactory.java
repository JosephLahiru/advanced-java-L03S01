package com.ictec.dpatterns;

public class ShapeFactory {

    public Shape getShape(String name){
        if(name.equalsIgnoreCase("CIRCLE")){
            return new Circle();
        }else if(name.equalsIgnoreCase("SQUARE")){
            return new Square();
        }else if(name.equalsIgnoreCase("RECTANGLE")) {
            return new Rectangle();
        }else{
            return null;
        }
    }
}
