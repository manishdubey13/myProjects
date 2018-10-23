package com.mani.practice;

import java.util.Arrays;
import java.util.List;

public class MapReduce
{
    public static void main(String[] args)
    {
        String str = "find number of words in this sentence";

        List<String> list = Arrays.asList(str.split(" "));

       int wordCount =  list.stream().mapToInt(s->1).sum();
        System.out.println(wordCount);

        int charCount =  list.stream().mapToInt(s->s.length()).sum();
        System.out.println(charCount);

        int charCountReduction =  list.stream().mapToInt(s->s.length()).reduce(0,(a,b)->(a+b));
        int wordountReduction =  list.stream().mapToInt(s->1).reduce(0,(a,b)->(a+b));
        System.out.println("charCountReduction -> " +charCountReduction);
        System.out.println("wordountReduction -> " +wordountReduction);


    }
}
