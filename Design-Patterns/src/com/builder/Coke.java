package com.builder;

/**
 * @author Philip Niron Nithianandan
 * email - philip.niron@gmail.com
 * LinkedIn - @philip-niron
 * on 20-December-2021 at 12:05
 * @Project Design-Patterns
 * Happy Coding..!
 */
public class Coke extends ColdDrink {

    @Override
    public float price() {
        return 230.0f;
    }

    @Override
    public String name() {
        return "Coke";
    }
}