package com.company;

public class Main
{

    public static void main(String[] args)
    {

        BiscuitFactory shapeFactory = new BiscuitFactory();

        Biscuit biscuit1 = shapeFactory.getBiscuit("Square biscuit");
        biscuit1.bake();

        Biscuit biscuit2 = shapeFactory.getBiscuit("Circle biscuit");
        biscuit2.bake();

    }
}
