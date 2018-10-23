package com.mani.tricky;

public class AbstractImpl extends AbstractTest
{
    @Override
    int add(int x, int y)
    {

        return super.x+ x+ super.y+y;
    }

    AbstractImpl()
    {

        super();
    }

    public AbstractImpl(int x, int y)
    {
        super(x, y);
    }

    public static void main(String[] args)
    {
        AbstractImpl a = new AbstractImpl();

        System.out.println( new AbstractImpl().add(3,4));
        System.out.println( new AbstractImpl(4,5).add(3,4));

        System.out.println(a.greeting("Akash"));
        System.out.println(a.sayHello("Akash"));
        System.out.println(Java8DefaultInterface.sayHi("Akash"));
    }

    @Override
    public String sayHello(String name)
    {
        return name + " Hello";
    }
}
