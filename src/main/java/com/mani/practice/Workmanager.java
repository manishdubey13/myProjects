package com.mani.practice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class Workmanager
{
    public static void main(String[] args)
    {
        List<String> list = Arrays.asList("a1","b1","c1","d1","e12");

        //shoulf not print anything
        list.stream().filter(a->a.length()>3).findAny().ifPresent(System.out::print);

        list.stream().map(a->a+"M").filter(s->!(s.indexOf("1M")>0)).forEach(System.out::println);

        IntStream.rangeClosed(1,5).forEach(System.out::print);
        System.out.println();
        IntStream.range(1,5).forEach(System.out::print);
        System.out.println();

        Arrays.stream(new int[] {1,2,3,4,5}).max().ifPresent(System.out::print);

        //System.out.println(Integer.valueOf(127) == Integer.valueOf(127));   // true
        System.out.println(Integer.valueOf(128) == Integer.valueOf(128));   // false
    }

}
