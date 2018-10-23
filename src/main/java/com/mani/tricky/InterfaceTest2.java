package com.mani.tricky;

public interface InterfaceTest2
{
    public String sayHello(String name);
    public default void log(String msg)
    {
        System.out.println(msg);
    }
    public default void log1(String msg)
    {
        System.out.println(msg);
    }

}
