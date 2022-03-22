package com.techelevator;

import java.util.ArrayList;
import java.util.List;

public class Diner
{
    public static void main(String[] args)
    {
//        sliceDemo();
        breadDemo();
    }

    private static void breadDemo()
    {
        // here we use the Bread CLASS as the template
        // to create a "grandmas" object - that is of type Bread
        // when we create a new class we have to pass in a name
        Bread grandmas = new Bread("Grandma Sycamores");

        // getNextSlice is a "method" of the grandmas object
        // and it will perform the logic to return the
        // next slice of bread - it will also remove that slice
        // from the list
        Slice firstSlice = grandmas.getNextSlice();

    }

    private static void sliceDemo()
    {
        // We are using the Slice CLASS as a template
        // to create a new object (slice)
        // because be pass in a value of true -
        // it will create an end slice
        Slice slice = new Slice(true);

        // setters allow us to change the internal
        // value of object the variable that they
        // are tied to
        slice.setHasJelly(true);

        // we use methods/functions to perform actions
        // notice that the value of isToasted
        // is false before we call the .toast methoc
        System.out.println("BEFORE is toasted: " + slice.isToasted());
        slice.toast();
        System.out.println("AFTER is toasted: " + slice.isToasted());

        // reading all of the slice values after the changes that we've made
        System.out.println("is end slice: " + slice.isEndSlice());
        System.out.println("is middle slice: " + slice.isMiddleSlice());
        System.out.println("is toasted: " + slice.isToasted());
        System.out.println("has peanut butter: " + slice.hasPeanutButter());
        System.out.println("has jelly: " + slice.hasJelly());
    }
}
