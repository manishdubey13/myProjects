package com.mani.practice.random;

public class Singleton1
{
    private static Singleton1 singleton1= new Singleton1();

    private Singleton1(){}

    public static Singleton1 getSingleton1 ()
    {
        return singleton1;
    }
}

