package com.mani.hacker;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class RegExp
{
    public static void main(String[] args)
    {
       splitAndPrint("He is a very very good boy, isn't he?");
    }

    public static void splitAndPrint(String string)
    {
        String[] strings = string.split("[ .,?!']+");

        System.out.println(strings.length);
        for (String str :strings)
        {
            System.out.println(str);
        }

       List<String>  list = Arrays.stream(strings).map(s->s.trim()).filter(s ->  !s.isEmpty()).collect(Collectors.toList());
       Set<String> set = Arrays.stream(strings).map(s->s.trim()).filter(s ->  !s.isEmpty())
               .collect(Collectors.toSet());

        if (list.size()<1)
        {
            System.out.println("0");
            return;
        }
        if (list.size()>=40000)
        {
            System.out.println();
            return;
        }
        System.out.println(list.size());
        list.stream().forEach(System.out::println);

        System.out.println("Will Remove duplicate if any");

        set.stream().forEach(System.out::println);
    }
}
