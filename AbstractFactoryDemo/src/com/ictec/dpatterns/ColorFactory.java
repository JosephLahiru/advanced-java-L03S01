package com.ictec.dpatterns;

//Create Factory classes extending AbstractFactory to generate object of concrete class based on
//given information
public class ColorFactory extends AbstractFactory{

    @Override
    Shape getShape(String shapeType) {
        return null;
    }
    @Override
    Color getColor(String colorType) {
        if(colorType == null){
            return null;
        }
        if(colorType.equalsIgnoreCase("RED")){
            return new Red();
        }else if(colorType.equalsIgnoreCase("GREEN")){
            return new Green();
        }else if(colorType.equalsIgnoreCase("BLUE")){
            return new Blue();
        }
        return null;
    }

}
