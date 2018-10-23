package com.mani.practice.random;

import java.time.Year;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class StaticInitializer
{

    public static final Year year = Year.of(2018);
    public static final Set<String> keywords ;


    static {

        Set<String> set = new HashSet<>();

        set.add("Manish");
        set.add("Akash");

       keywords = Collections.unmodifiableSet(set);
       //Collections.unmodifiableList();
        //Collections.singleton(set);

    }


    public static void main(String[] args)
    {
        for (String str : keywords)
        {
            System.out.println(str);
            //keywords.add("Amisha");
        }
    }
}
