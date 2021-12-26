package com.singleton;

/**
 * @author Philip Niron Nithianandan
 * email - philip.niron@gmail.com
 * LinkedIn - @philip-niron
 * on 10-December-2021 at 09:29
 * @Project Design-Patterns
 * Happy Coding..!
 */
public class Main_Singleton {
    public static void main(String[] args) {

        /**
         * Singleton obj1 = new Singleton();
         * --> We can't create object like this
         */

        long hash_1 , hash_2;

        Singleton obj1 = Singleton.CreateObject();
        hash_1 = obj1.hashCode();

        Singleton obj2 = Singleton.CreateObject();
        hash_2 = obj2.hashCode();

        System.out.println("Does the hashcode matches?");
        if(hash_1==hash_2){
            System.out.println("Yes, Equal hashcode");
        }else{
            System.out.println("No, Different hashcode");
        }

    }

}
