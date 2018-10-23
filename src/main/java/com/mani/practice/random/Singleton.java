package com.mani.practice.random;

public class Singleton
{
    private static Singleton singleton;

    private Singleton()
    {

    }

    public static  synchronized  Singleton getSingleton()
    {
        if (null==singleton)
        {
            singleton = new Singleton();
            return singleton;
        }
        return singleton;
    }

}
