package com.mani.hacker;

import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class IMP1
{
    public static void main(String[] args)
    {
        String string = "welcometojava";
        int num=4;

       SortedSet<String> stringSet = new TreeSet<>();
        for (int i=0; i<=string.length()-num;i++)
        {
            stringSet.add(string.substring(i,i+num));
        }

        System.out.println(stringSet.first() + " " + stringSet.last());
        System.out.println(stringSet);

    }
}
