package com.techelevator.kitchen;

public class Slice
{
    // private variables -- ALL should ALWAYS be private
    // what does it know
    private boolean isEndSlice;
    private boolean isToasted;
    private boolean hasPeanutButter;
    private boolean hasJelly;

    // public getters and setters
    // booleans don't have the word "get" in the front
    public boolean isEndSlice()
    {
        return this.isEndSlice;
    }

    public boolean isMiddleSlice()
    {
        return !this.isEndSlice;
    }

    public boolean hasJelly()
    {
        return this.hasJelly;
    }

    public void setHasJelly(boolean value)
    {
        this.hasJelly = value;
    }

    public boolean hasPeanutButter()
    {
        return this.hasPeanutButter;
    }

    // getters and setters can have custom logic
    // to determine HOW they are set
    public void setHasPeanutButter(boolean value)
    {
        if(!this.hasJelly)
        {
            this.hasPeanutButter = value;
        }
    }

    public boolean isToasted()
    {
        return this.isToasted;
    }



    // constructors
    // this is the default constructor - it takes no input parameters
    public Slice()
    {
    }

    // this is an overloaded constructor
    // we can require input parameters to help
    // determine HOW to create the slice
    public Slice(boolean isEndSlice)
    {
        this.isEndSlice = isEndSlice;
    }

    // actions
    // toast is a function
    // that knows how to do something
    // the final result is that the slice is also toasted
    public void toast()
    {
        // after all steps are complete
        this.isToasted = true;
    }

}
