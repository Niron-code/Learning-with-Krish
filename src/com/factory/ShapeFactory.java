package com.factory;

/**
 * @author Philip Niron Nithianandan
 * email - philip.niron@gmail.com
 * LinkedIn - @philip-niron
 * on 17-December-2021 at 16:11
 * @Project Design-Patterns
 * Happy Coding..!
 */

public class ShapeFactory {

    //use createShape method to get object of type shape
    public Shape createShape(String shapeType){

        if(shapeType == null){
            return null;
        }
        if(shapeType.equalsIgnoreCase("CIRCLE")){
            return new Circle();

        } else if(shapeType.equalsIgnoreCase("RECTANGLE")){
            return new Rectangle();

        } else if(shapeType.equalsIgnoreCase("SQUARE")){
            return new Square();
        }

        return null;
    }
}
