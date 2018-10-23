package com.mani.codingtest;

import javax.xml.transform.stream.StreamSource;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class SumCount
{
    public static void main(String[] args)
    {
        int sum=0;

        for (int i=1;i<=100;i++)
        {
            sum=sum+i;
        }
        System.out.println(sum);

        System.out.println( sumf(100));
        System.out.println( sumStream(100));
        System.out.println( recursiveSum(100));

    }

    private static int sumf(int uperBound)
    {
        return uperBound*(uperBound+1)/2;
    }

    private static int sumStream(int upperBound)
    {
        //return IntStream.rangeClosed(0,upperBound).reduce(0,Integer::sum);
        return IntStream.rangeClosed(0,upperBound).reduce(0,(a,b)->(a+b));
    }

    private static int recursiveSum(int n)
    {
        if (n==1)
        {
            return 1;
        } else
            {
                return n+recursiveSum(n-1);
            }

    }

    private static int sum(int [] ints)
    {
       return Arrays.stream(ints).reduce(0,(a,b)->(a+b));
    }

    private static long sum(int n,long[] nums)
    {
        BigInteger[] integers = new BigInteger[nums.length];
       for (int i=0;i<nums.length;i++)
       {
           integers[i]= BigInteger.valueOf(nums[i]);
       }

          Map<Integer,Integer> maps = new HashMap<>();
          maps.put(1,2);
          Set<Map.Entry<Integer,Integer>> entries =  maps.entrySet();

           for (Map.Entry s : entries)
           {
              entries.stream().forEach(System.out::println);
           }


       return Arrays.stream(integers).limit(n).reduce(BigInteger.ZERO,(a,b)->a.add(b)).longValue();
    }


}
