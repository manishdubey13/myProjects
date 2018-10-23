package com.mani.tricky;

public abstract class AbstractTest implements Java8DefaultInterface
{
    int x;
    int y;

    public AbstractTest(int x, int y)
    {
        this.x = x;
        this.y = y;
    }

    public AbstractTest()
    {
    }

    abstract int add(int x, int y);

    public static void main(String[] args)
    {
        //new AbstractTest();
        System.out.println("inside abstract class");
    }

    public  String greeting(String name)
    {
        return name + " Good Evening ";
    }

}
