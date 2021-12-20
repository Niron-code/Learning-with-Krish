package com.factory;

/**
 * @author Philip Niron Nithianandan
 * email - philip.niron@gmail.com
 * LinkedIn - @philip-niron
 * on 17-December-2021 at 16:13
 * @Project Design-Patterns
 * Happy Coding..!
 */

public class Main_FactoryPattern {

    public static void main(String[] args) {

        //Create ShapeFactory object
        ShapeFactory shapeFactory = new ShapeFactory();

        //create an object using createShape method
        Shape shape1 = shapeFactory.createShape("CIRCLE");
        Shape shape2 = shapeFactory.createShape("RECTANGLE");
        Shape shape3 = shapeFactory.createShape("SQUARE");

        //call draw method
        shape1.draw();
        shape2.draw();
        shape3.draw();

    }
}
