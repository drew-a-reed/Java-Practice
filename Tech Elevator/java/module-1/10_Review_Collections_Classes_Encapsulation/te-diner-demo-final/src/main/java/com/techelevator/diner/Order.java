package com.techelevator.diner;

public class Order
{
    private String name;
    private boolean isToasted;
    private boolean hasExtraJelly;

    public Order(String name)
    {
        this.name = name;
    }

    public String getName()
    {
        return name;
    }

    public boolean isToasted()
    {
        return isToasted;
    }

    public void setToasted(boolean toasted)
    {
        isToasted = toasted;
    }

    public boolean hasExtraJelly()
    {
        return hasExtraJelly;
    }

    public void setHasExtraJelly(boolean hasExtraJelly)
    {
        this.hasExtraJelly = hasExtraJelly;
    }
}
