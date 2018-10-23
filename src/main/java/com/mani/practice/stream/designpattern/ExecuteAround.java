package com.mani.practice.stream.designpattern;

import java.util.function.Consumer;

public class ExecuteAround
{
    public static void main(String[] args)
    {
        Resource.use(resource -> {

            resource.op1();
            resource.op2();
        });
    }
}

class Resource
{
    private Resource()
    {
        System.out.println("Creating Resource");
    }

    public Resource op1()
    {
        System.out.println("doing operation1");
        return this;
    }
    public Resource op2()
    {
        System.out.println("doing operation2");
        return this;
    }

    private void close()
    {
        System.out.println("closing the operation");
    };

    public static void use(Consumer<Resource> block)
    {
        Resource resource = new Resource();

        try
        {
            block.accept(resource);

        } finally
        {
            resource.close();
        }
    }


}