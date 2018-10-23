package com.mani.codingtest;

import java.io.InputStream;
import java.math.BigInteger;
import java.util.stream.IntStream;

public class MyMath
{
    public static void main(String[] args)
    {

        PerformOperation isOdd= (p)->
        {
             return p%2==0;
        };

        PerformOperation isPrime=(p)->
        {
               //return p> 1 && IntStream.rangeClosed(2,(int)Math.sqrt(p)).noneMatch(pri->p%pri==0);
           return p>1 && IntStream.rangeClosed(2,(int)
                 Math.sqrt(p)).noneMatch(i->p%i==0);

           // return BigInteger.valueOf(5).isProbablePrime(1);
        };

        PerformOperation  isPalindrome = (p)->
        {
            return Integer.toString(p).equals(new StringBuilder(Integer.toString(p)).reverse().toString());
        };


        System.out.println(checker(isOdd ,1));
        System.out.println(checker(isPalindrome ,55));
        System.out.println(checker(isPrime ,3));

    }

    public static boolean checker(PerformOperation p, int num)
    {
        return p.check(num);
    }
}

interface PerformOperation
{
    boolean check(int a);
}