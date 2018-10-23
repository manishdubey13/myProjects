package com.mani.hacker;

import javax.xml.crypto.dom.DOMCryptoContext;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Median
{
    public static void main(String[] args)
    {
/*
        List<int[]> list = Arrays.asList( new int[]{1, 2, 3, 5,6});
        list.stream().forEach(a-> Arrays.stream(a).forEach(System.out::println));
*/

        // int[] ints = {12,4,5};
       // Integer[] ints = {12,4,5,3};
       // int[] ints = {12};

        //System.out.println(calculateMedian(ints));

       Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];

        for(int a_i=0; a_i < n; a_i++)
        {
            a[a_i] = in.nextInt();

        }
        for (int i =0 ;i<a.length;i++)
        {
            System.out.println(calculateMedian(Arrays.copyOfRange(a,0,i+1)));
        }




        //System.out.println(calculateMedian(a));



    }

    private static double calculateMedian(int[] ints)
    {
        Arrays.sort(ints);

        int size = ints.length;
        if (size < 2) return ints[0];
        if (size % 2 != 0)
        {
            return ints[(size / 2)];
        }

        double d1 = ints[(size / 2)];
        double d2 = ints[(size/2)-1];


        return (d1+d2)/2;
    }

}
