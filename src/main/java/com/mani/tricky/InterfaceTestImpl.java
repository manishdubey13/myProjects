package com.mani.tricky;

import java.util.Collections;

public class InterfaceTestImpl implements InterfaceTest1,InterfaceTest2
{
    @Override
    public String sayHi(String name)
    {
        return "Hi " + name;
    }

    @Override
    public String sayHello(String name)
    {
        return "Hello "+name;
    }

    @Override /*if there is conflict with default methods need to override in implementation class */
    public void log(String msg)
    {
        System.out.println(msg);
    }

    //@Override /* can't override static method for interface can shadow it */
    public static void checkStaticOverride()
    {
        System.out.println("In checkStaticOverride in IMPL");
    }

    public static void main(String[] args)
    {
        InterfaceTestImpl interfaceTestImpl= new InterfaceTestImpl();

        System.out.println(interfaceTestImpl.sayHello("Akash"));
        System.out.println(interfaceTestImpl.sayHi("Akash"));

        interfaceTestImpl.log("Akash");
        interfaceTestImpl.log1("Akash");

        checkStaticOverride();

        //Collections.sort();
    }
}
