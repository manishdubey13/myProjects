package com.mani.codingtest;

import java.util.function.IntConsumer;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class PrimeNumber
{
    public static void main(String[] args)
    {
        System.out.println(isPrime(13));
        System.out.println(isPrimeStream(13));
    }

    private static boolean isPrime(int i)
    {
       if (i<2) return false;
       for (int num=2; num<=Math.sqrt(i);num++)
       {
           if (i%num==0) return false;
       }
       return true;
    }

    private static boolean isPrimeStream(int i)
    {
        return i>1 && IntStream.rangeClosed(2,(int)Math.sqrt(i)).noneMatch(n->i%n==0);
    }



}
