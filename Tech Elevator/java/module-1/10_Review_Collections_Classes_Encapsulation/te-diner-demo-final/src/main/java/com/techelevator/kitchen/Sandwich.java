package com.techelevator.kitchen;

import java.util.ArrayList;
import java.util.List;

public class Sandwich
{
    List<Slice> slices;

    public Sandwich()
    {
        slices = new ArrayList<>();
    }

    public boolean hasExtraJelly()
    {
        int jellyCount = 0;

        for(Slice slice : slices)
        {
            if(slice.hasJelly()) jellyCount++;
        }

        return jellyCount > 1;
    }

    public boolean canAddSlice()
    {
        return  slices.size() < 2;
    }



    public boolean addSlice(Slice slice)
    {
        if(canAddSlice())
        {
            this.slices.add(slice);
            return true;
        }

        return false;
    }
}
