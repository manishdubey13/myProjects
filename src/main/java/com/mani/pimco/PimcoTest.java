package com.mani.pimco;

import java.util.ArrayList;
import java.util.List;

public class PimcoTest
{

  /*  1) IObjectTest interface with a single boolean test(Object o) method and
    (2) an implementation of Iterator (let's call it FilteringIterator) which is
        initialized with another Iterator and an IObjectTest instance:
        new FilteringIterator(myIterator, myTest). Your FilteringIterator will
    then allow iteration over 'myIterator', but skipping any objects which don't pass
    the 'myTest' test. Create a simple unit test for this framework.
    */

    public static void main(String[] args)
    {

        List<String> names = new ArrayList<>();

        names.add("James");
        names.add("John");
        names.add("Jacky");
        names.add("Manish");

    /*    FilteringIteratorJava8 filteringIterator = new
                FilteringIteratorJava8(names.iterator(), (o) -> o.toString().startsWith("J"));

        filteringIterator.iterator().forEachRemaining(System.out::println);
*/
//        FilteringIterator filteringIterator = new FilteringIterator(names.iterator(),
//                (o) -> o.toString().startsWith("J"));
/*
        FilteringIterator filteringIterator = new FilteringIterator(names.iterator(),
                (o) -> o.toString().startsWith("J"));

        filteringIterator.forEachRemaining(System.out::println);*/
    }

}
