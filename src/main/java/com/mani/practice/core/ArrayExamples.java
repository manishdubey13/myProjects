package com.mani.practice.core;

import java.util.Arrays;

public class ArrayExamples
{

    public static void main(String[] args)
    {

        int[] a = new int[]{2,4};

        int[] b = new int[]{3};

        //Arrays.sort(a);

        //Arrays.stream(a).sorted().forEach(System.out::println);

     /*    int[] ints= sortArray(a,b);

        Arrays.stream(ints).forEach(System.out::println);

        char[] chars = new char[]{'a','c','c','b'};

        Arrays.sort(chars);


        System.out.println();*/

        int[] c = new int[]{0, 4, 0, 3};

        zeroLeft(c);

    }

    public static int[] sortArray(int[]a,int[]b)
    {
        int size = a.length+b.length;

        int[] ints = new int[size];


         for (int i=0;i<a.length;i++)
         {
             ints[i]=a[i];
         }

        for (int i=0;i<b.length;i++)
        {
            ints[a.length+i]=b[i];
        }

        return Arrays.stream(ints).sorted().toArray();

    }


    private static void zeroLeft(int[] ints)
    {
        int size=ints.length;

        int maxtoZero=0;
        for (int i=0;i<size;i++)
        {
            if (i<size-1 && ints[i]==0 &&ints[i]<ints[i+1])
            {
                if ((ints[i+1]%2>1) && (ints[i+1]>maxtoZero))
                {
                    maxtoZero=ints[i+1];
                }
            }
        }

        for (int i=0; i<size;i++)
        {
            if (ints[i]==0)
            {
                ints[i]=maxtoZero;
            }
        }

        for (int a : ints)
        {
            System.out.println(a);
        }

    }
}
