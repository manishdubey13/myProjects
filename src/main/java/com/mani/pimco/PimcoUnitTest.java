package com.mani.pimco;


import junit.framework.TestCase;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import static org.junit.Assert.assertNotEquals;

public class PimcoUnitTest extends TestCase
{
    @Test
    public void testCustomIterator()
    {

        List<String> names = new ArrayList<>();

        names.add("James");
        names.add("John");
        names.add("Jacky");
        names.add("Manish");

        FilteringIteratorJava8 filteringIteratorJava8 = new
                FilteringIteratorJava8 (names.iterator(), (o) -> o.toString().startsWith("J"));

        Iterator iterator = filteringIteratorJava8.iterator();
        int count = 0;

        while (iterator.hasNext())
        {
            count++;
            iterator.next();
        }

        assertEquals(names.size() - 1, count);
    }

    @Test
    public void testPersonIterator()
    {

        List<Person> names = new ArrayList<>();

        names.add(new Person("James", 5000));
        names.add(new Person("John", 7000));
        names.add(new Person("Jacky", 9000));
        names.add(new Person("Tom", 5500));

        FilteringIteratorJava8 filteringIterator = new
                FilteringIteratorJava8 (names.iterator(), (person) -> ((Person) person).getSalary() > 5500);

        Iterator iterator = filteringIterator.iterator();
        int count = 0;

        while (iterator.hasNext())
        {
            count++;
            Person p = (Person) iterator.next();
            assertEquals(p.salary > 5500, true);
            assertNotEquals(!p.name.equals("James"), false);

        }

        assertEquals(names.size() - 2, count);
    }
}


class Person
{
    String name;
    long salary;

    public Person(String name, long salary)
    {
        this.name = name;
        this.salary = salary;
    }

    public long getSalary()
    {
        return salary;
    }

    @Override
    public String toString()
    {
        return "Person{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}
