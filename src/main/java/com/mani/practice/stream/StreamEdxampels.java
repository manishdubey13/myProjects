package com.mani.practice.stream;

import com.sun.tools.doclets.formats.html.SourceToHTMLConverter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamEdxampels
{

    public static void main(String[] args)
    {

        List<String> stringList = Arrays.asList("a1", "a2", "b1", "c2", "c1");
        stringList.stream().filter(s->s.startsWith("c")).map(i->i.toUpperCase())
                .sorted().forEach(System.out::println);

        System.out.println("***************");
        stringList.stream().filter(s->s.startsWith("c")).map(String::toUpperCase)
                .sorted().forEach(System.out::println);
        System.out.println("***************");

        Stream.of("a1", "a2", "b1", "c2", "c1").findFirst().ifPresent(System.out::println);
        System.out.println("***************");

        IntStream.range(0,5).forEach(System.out::println);
        System.out.println("***************");

        Arrays.stream(new int []{1,2,3}).map(n->2*n+1).average().ifPresent(System.out::println);

        System.out.println("***************");


        Stream.of("m1","m2","m3").map(s->s.substring(1)).mapToInt
                (s ->Integer.parseInt(s)).max().ifPresent(System.out::println);

        System.out.println("***************");

        Stream.of("d2", "a2", "b1", "b3", "c").filter(s->{
            System.out.println( "Filter " + s);
             return true;
        }).forEach(s->System.out.println("For Each " +s));

        System.out.println("***************");

        Stream.of("d2", "a2", "b1", "b3", "c").map(s ->{

            System.out.println("im Map ->" + s);
            return s.toUpperCase();

        }).filter(s -> s.startsWith("A")).forEach(System.out::println);
        System.out.println("***************");

        Supplier<Stream<String>> streamSupplier = ()-> Stream.of("d2", "a2", "b1", "b3", "c").filter(s->s.startsWith("a"));

        streamSupplier.get().anyMatch(s->true);

        streamSupplier.get().allMatch(s->true);

        System.out.println("***************");




    }
}
