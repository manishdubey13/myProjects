package com.mani.codingtest;

public class SingletonEnum
{
    enum Singleton
    {
        SINGLETON;
        int i=5;

        public String SayHello(String name)
        {
            i++;
            return name +i;
        }
        public String SayHelloIncrementBy2(String name)
        {
            i=i+2;
            return name +i;
        }
    }


    public static void main(String[] args)
    {
        Singleton instance = Singleton.SINGLETON;
        Singleton instance2 = Singleton.SINGLETON;

        System.out.println(instance.SayHello("Manish"));
        System.out.println(instance.SayHelloIncrementBy2("Manish"));

        if (instance==instance2 && instance.equals(instance2))
        {
            System.out.println("its same");
        }else
            {
                System.out.println("its difference");
            }
    }
}
