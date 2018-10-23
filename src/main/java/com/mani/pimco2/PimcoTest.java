package com.mani.pimco2;


import java.util.ArrayList;
import java.util.List;

public class PimcoTest
{

    public static void main(String[] args)
    {

        List<String> names = new ArrayList<>();

        names.add("James");
        names.add("John");
        names.add("Jacky");
        names.add("Manish");


        FilteringIterator filteringIterator = new FilteringIterator(names.iterator(),
                new myFilter());

     while (filteringIterator.hasNext())
     {
         System.out.println(filteringIterator.next());
     }
    }

    private static final class myFilter<T> implements IObjectTest<T>
    {

        @Override
        public  boolean test(T t)
        {
            return t.toString().startsWith("M");
        }
    }

}
