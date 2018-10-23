package com.mani.codingtest;

public class IsPrefactSquare
{
    public static void main(String[] args)
    {
        System.out.println(isPerfectSq(4));
        System.out.println(isPerfectSq1(16));

    }

    public static boolean isPerfectSq(int num)
    {
        if (Math.sqrt(num)*Math.sqrt(num)==num) return true;
        else return false;
    }

    public static boolean isPerfectSq1(int num)
    {

        int n =1;

        for (;;)
        {
            if (num<0) return false;
            if (num==0) return true;
            num = num-n;
            n= n+2;
        }

    }
}
