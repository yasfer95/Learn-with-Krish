package com.company;

public abstract class Book implements Cloneable
{
    private String id;
    protected String category;

    abstract void print();

    public String getCategory()
    {
        return category;
    }

    public String getId()
    {
        return id;
    }

    public void setId(String id)
    {
        this.id = id;
    }

    public Object clone()
    {
        Object clone = null;
        try
        {
            clone = super.clone();
        }
        catch (CloneNotSupportedException e)
        {
            e.printStackTrace();
        }

        return clone;
    }
}
