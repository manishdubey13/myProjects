package com.mani.codingtest;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Prime
{


    public static void main(String[] args)
    {
      /* IntStream.rangeClosed(2,2).forEach(System.out::println);
       IntStream.range(2,2).forEach(System.out::println);*/

       // System.out.println("isPrime ->" +isPrime(8));

        primes(1,10).stream().forEach(System.out::println);

       // Stream.iterate("Manish", s -> s.substring(1)).limit(6)
        //        .collect(Collectors.toList()).stream().forEach( System.out::println);

/*
        Stream.iterate(1,Prime::primeAfter)//.peek(System.out::println)
                .limit(10).collect(Collectors.toList()).stream()
                .forEach(System.out::println);
*/

    }



    public static boolean isPrime(int number)
    {
         return number>1 && IntStream.rangeClosed(2,(int)
                 Math.sqrt(number)).noneMatch(i->number%i==0);
    }

    public static int primeAfter(int number)
    {

        return isPrime(number+1)?number+1:primeAfter(number+1);
    }

    public static List<Integer> primes(int start,int count)
    {
        return Stream.iterate(primeAfter(start-1), Prime::primeAfter)
                .limit(count).collect(Collectors.toList());
    }



}
