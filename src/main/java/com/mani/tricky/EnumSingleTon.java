package com.mani.tricky;

public class EnumSingleTon
{
    enum Singleton
    {
        SINGLETON
                {
                    @Override
                    public String sayHi(String string)
                    {
                        return "Hi " + string;
                    }
                },
        SINGLETON2{
            @Override
            public String sayHi(String string)
            {
                return "Hiiiii " + string;
            }

    };



        public String sayHello(String name)
        {
            return "Hello " +name;
        }

        public abstract String sayHi(String string);
    }

    public static void main(String[] args)
    {
        Singleton singleton= Singleton.SINGLETON;
        Singleton singleton1= Singleton.SINGLETON;
        Singleton singleton2= Singleton.SINGLETON2;

        System.out.println(singleton.sayHello("Akash"));
        System.out.println(singleton.sayHi("Akash"));
        System.out.println(singleton2.sayHi("Akash"));

        System.out.println(singleton1.SINGLETON.sayHello("Manish"));

        System.out.println(singleton==singleton1);

        System.out.println(singleton==singleton2);


        System.out.println(singleton.equals(singleton1));
    }
}
