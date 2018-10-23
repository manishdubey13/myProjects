package com.mani.practice.stream;

import java.util.*;

import static java.util.Collections.*;

public class StreamTest
{

    public static void main(String[] args)
    {
        List<Person> people = new ArrayList<>(); //maintains insertion order
        people.add(new Person(6,"Aarushi","Dubey"));
        people.add(new Person(6,"Amisha","Dubey"));
        people.add(new Person(11,"Akash","Dubey"));
        people.add(new Person(41,"Manish","Dubey"));

        people.forEach(person -> {
            System.out.println(person);
        });


        Set<Person> peopleSet = new HashSet<>(); //no duplicate to order guranty of insertion order
        //Set<Person> peopleSet = new TreeSet<>(); //maintains  order based on comparable

        peopleSet.add(new Person(6,"Aarushi","Dubey"));
        peopleSet.add(new Person(6,"Amisha","Dubey"));
        peopleSet.add(new Person(11,"Akash","Dubey"));
        peopleSet.add(new Person(41,"Manish","Dubey"));
        peopleSet.add(new Person(41,"Manish","Dubey"));

        System.out.println("****************");

        peopleSet.forEach(person ->
        {
            System.out.println(person);
        });


        sort(people);

        System.out.println("***************List after After sorting");
        people.forEach(person -> {
            System.out.println(person);
        });

        Comparator<Person> comparatorAge =(p1,p21)->{
            return p1.getAge()-p21.getAge();
        };

        //sort(people,comparatorAge);

        /*sort(people,(p1,p2)->{ return p1.getAge()-p2.getAge();
        });
       */

        sort(people, Comparator.comparingInt(Person::getAge));

        System.out.println("***************List after After sorting with Comparator");
        people.forEach(person -> {
            System.out.println(person);
        });


    }
}
