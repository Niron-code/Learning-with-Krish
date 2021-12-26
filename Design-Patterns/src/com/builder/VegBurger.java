package com.builder;

/**
 * @author Philip Niron Nithianandan
 * email - philip.niron@gmail.com
 * LinkedIn - @philip-niron
 * on 20-December-2021 at 11:55
 * @Project Design-Patterns
 * Happy Coding..!
 */
public class VegBurger extends Burger {

    @Override
    public float price() {
        return 650.0f;
    }

    @Override
    public String name() {
        return "Veg Burger";
    }
}