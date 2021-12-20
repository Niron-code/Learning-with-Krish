package com.prototype;

/**
 * @author Philip Niron Nithianandan
 * email - philip.niron@gmail.com
 * LinkedIn - @philip-niron
 * on 20-December-2021 at 11:12
 * @Project Design-Patterns
 * Happy Coding..!
 */
public class Square extends Shape{
    public Square(){
        type = "Square";
    }
    @Override
    public void draw() {
        System.out.println("Hello from Square::draw() method");
    }
}
