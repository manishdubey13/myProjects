package com.mani.practice.core;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Test1
{
    public static void main(String[] args)
    {
   /*     System.out.println(addStar(["a", "bb", "ccc"]));
        addStar(["hello", "there"]) → ["hello*", "there*"]
        addStar(["*"]) → ["**"]
        */

        List<String> stringList = new ArrayList<>();

        stringList.add("a");
        stringList.add("bb");
        stringList.add("ccc");
        System.out.println(copies3(stringList));

    }

    public List<String> addStar(List<String> strings)
    {


        return strings.stream().map(m->m+"*").collect(Collectors.toList());
    }

    public static List<String> copies3(List<String> strings)
    {
            return strings.stream().map(m ->
                    {
                        String str ="";
                        for (int i=0 ; i<3;i++)
                        {
                            str = str+m;
                        }
                        return str;
                    }
            ).collect(Collectors.toList());
    }

}
