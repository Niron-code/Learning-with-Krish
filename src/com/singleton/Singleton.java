package com.singleton;

/**
 * @author Philip Niron Nithianandan
 * email - philip.niron@gmail.com
 * LinkedIn - @philip-niron
 * on 10-December-2021 at 07:55
 * @Project Design-Patterns
 * Happy Coding..!
 */

public class Singleton {

    //define private object
    private static volatile Singleton singleton;

    //create private constructor
    private Singleton(){
        if(singleton != null ){
            throw new RuntimeException("Use CreateObject method");
        }
    }

    //create method to invoke object
    public static Singleton CreateObject(){
        if(singleton == null){
            synchronized (Singleton.class) {
                if (singleton == null) {
                    singleton = new Singleton();
                    System.out.println("Object created Successfully first time \n");
                }
            }
        }else {
            System.out.println("We can't create another object");
            System.out.println("We already have an object and the hashcode is "+ singleton.hashCode()+ "\n");
        }
        return singleton;
    }


}
