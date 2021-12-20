package com.prototype;

/**
 * @author Philip Niron Nithianandan
 * email - philip.niron@gmail.com
 * LinkedIn - @philip-niron
 * on 20-December-2021 at 11:13
 * @Project Design-Patterns
 * Happy Coding..!
 */
public class Circle extends Shape{
    public Circle(){
        type = "Circle";
    }
    @Override
    public void draw() {
        System.out.println("Hello from Circle::draw() method");
    }
}
