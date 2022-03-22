package com.techelevator;

import java.util.ArrayList;
import java.util.List;

public class Bread
{
    // private variables
    private String name;
    private List<Slice> slices;

    // getters and setters
    public String getName()
    {
        return this.name;
    }

    // this is a derived property because it uses
    // logic to determine the return value
    public boolean hasSlices()
    {
        return !this.slices.isEmpty();
    }

    // this is a derived property because it uses
    // logic to determine the return value
    public int getSliceCount()
    {
        return this.slices.size();
    }

    // constuctor
    public Bread(String name)
    {
        this.name = name;
        // make sure that the array list is created
        this.slices = new ArrayList<>();

        // populate the loaf of bread
        this.slices.add(new Slice(true));
        this.slices.add(new Slice());
        this.slices.add(new Slice());
        this.slices.add(new Slice());
        this.slices.add(new Slice());
        this.slices.add(new Slice());
        this.slices.add(new Slice(true));
    }

    // this is a function
    // we could just name it nextSlice()
    // so that it is not thought of as a getter
    public Slice getNextSlice()
    {
        Slice nextSlice = null;

        if(this.hasSlices())
        {
            nextSlice = this.slices.get(0);
            this.slices.remove(nextSlice);
        }

        return nextSlice;
    }

}
