package com.mani.pimco2;



import junit.framework.TestCase;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertNotEquals;

public class PimcoUnitTest extends TestCase
{


    @Test
    public void testPersonIterator()
    {

        List<Person> names = new ArrayList<>();

        names.add(new Person("James", 5000));
        names.add(new Person("John", 7000));
        names.add(new Person("Jacky", 9000));
        names.add(new Person("Tom", 5500));

        IObjectTestImpl<Person> personIObjectTest = new IObjectTestImpl (new Person("Tom", 5500));

        FilteringIterator<Person> filteringIterator = new
                FilteringIterator (names.iterator(),  personIObjectTest);

        int count = 0;

        while (filteringIterator.hasNext())
        {
            count++;
            Person p = (Person) filteringIterator.next();
            assertEquals(p.getSalary() >= 5500, true);
            assertNotEquals(!p.getName().equals("James"), false);

        }

        assertEquals(1, count);
    }



    @Test
    public void testCustomListIterator()
    {

        List<String> names = new ArrayList<>();

        names.add("James");
        names.add("John");
        names.add("Jacky");
        names.add("Manish");

        FilteringIterator filteringIterator = new
                FilteringIterator(names.iterator(), new IObjectTest<String>()
        {
            @Override
            public boolean test(String name)
            {
                return name.startsWith("J");
            }
        });

        ;
        int count = 0;

        while (filteringIterator.hasNext())
        {
            count++;
            filteringIterator.next();
        }

        assertEquals(names.size() - 1, count);
    }


    @Test
    public void testCustomIterator()
    {

        List<String> names = new ArrayList<>();

        names.add("James");
        names.add("John");
        names.add("Jacky");
        names.add("Manish");

        FilteringIterator filteringIterator = new
                FilteringIterator (names.iterator(), (o) -> o.toString().startsWith("J"));

        ;
        int count = 0;

        while (filteringIterator.hasNext())
        {
            count++;
            filteringIterator.next();
        }

        assertEquals(names.size() - 1, count);
    }
}


