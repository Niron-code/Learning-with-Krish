package com.prototype;

/**
 * @author Philip Niron Nithianandan
 * email - philip.niron@gmail.com
 * LinkedIn - @philip-niron
 * on 20-December-2021 at 11:09
 * @Project Design-Patterns
 * Happy Coding..!
 */
public class Rectangle extends Shape{

    public Rectangle(){
        type = "Rectangle";
    }
    @Override
    public void draw() {
        System.out.println("Hello from Rectangle::draw() method");
    }
}
