package com.mani.practice.stream;

import java.util.ArrayList;
import java.util.List;

public class Foo
{
    String name;
    List<Bar> barList = new ArrayList();

    public Foo(String name)
    {
        this.name = name;
    }

    @Override
    public String toString()
    {
        return "Foo{" +
                "name='" + name + '\'' +
                '}';
    }
}

class Bar
{
    String name;

    public Bar(String name)
    {
        this.name = name;
    }

    @Override
    public String toString()
    {
        return "Bar{" +
                "name='" + name + '\'' +
                '}';
    }
}