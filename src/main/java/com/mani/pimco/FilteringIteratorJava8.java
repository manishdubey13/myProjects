package com.mani.pimco;


import java.util.Iterator;
import java.util.Spliterators;
import java.util.stream.StreamSupport;

public class FilteringIteratorJava8
{
    IObjectTest test;
    Iterator iterator;

    public FilteringIteratorJava8(Iterator iterator, IObjectTest test)
    {
        this.test = test;
        this.iterator = iterator;
    }

    public Iterator iterator()
    {
        return StreamSupport.stream(Spliterators.spliteratorUnknownSize(iterator, 0), false)
                .filter(o -> test.test(o)).iterator();
    }
}
