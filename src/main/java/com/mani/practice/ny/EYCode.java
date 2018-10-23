package com.mani.practice.ny;

//JUnique in char]

//Sort array[2,4,5,6]
//Sort int [2,4,7,9]

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;

public class EYCode
{

    public static void main(String[] args)
    {
        int[] a = new int[] {1,2,3,5,3};
        int[] b = new int[] {1,8,3,11,4};


        int[] c = new int[a.length+b.length];

        System.arraycopy(b,0,c,0,b.length);
        System.arraycopy(a,0,c,b.length,a.length);
        Arrays.sort(c);

        Arrays.stream(c).forEach(System.out::println);

      for (int num :c)
      {
          System.out.println(num);
      }
        System.out.println("*******************");

       sortInt(a,b);

        AtomicInteger atomicInteger;
        ArrayList arrayList;
        ConcurrentHashMap concurrentHashMap;

    }


    public static int[] sortInt(int[] a, int[]b)
    {

        int size = a.length +b.length;
        int[] ints= new  int[size] ;

        for (int i=0;i<a.length ;i++)
        {
            ints[i]=a[i];
        }
        for (int i=0;i<b.length ;i++)
        {
            ints[a.length+i]=b[i];
        }

        Arrays.sort(ints);

        for(int n : ints)
        {
            System.out.println(n);
        }
        return ints;


    }
}
