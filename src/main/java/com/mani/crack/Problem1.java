package com.mani.crack;

/*
*
* Implement an algorithm to determine if a
* string has all unique characters. What if you can not use additional data structures?
* */
public class Problem1
{
    public static void main(String[] args)
    {

        System.out.println(isStringWithUniqueChars("MANISH"));
        System.out.println(isStringWithUniqueChars("MANISHA"));
        System.out.println(isStringWithUniqueChars("AKASH"));
        System.out.println(isStringWithUniqueChars(""));
        System.out.println(isStringWithUniqueChars(null));
        System.out.println(isStringWithUniqueChars("abcdefghijklmnopqrstuvwxyz"));
        System.out.println(isStringWithUniqueChars("~`,.ma '"));
        System.out.println(isStringWithUniqueChars1("~`,.ma '"));


    }

    public static  boolean isStringWithUniqueChars(String string)
    {
        //assuming ascii chars
        if (string ==null || string.isEmpty()) return true;
        int[] arrayInts= new int[256];
        for (char c : string.toCharArray())
        {
            arrayInts[c] = arrayInts[c]+1;
        }
        for (int i : arrayInts) //n2
        {
            if (i>1) return false;
        }
        return true;
    }

    public static boolean isStringWithUniqueChars1(String string)
    {
        boolean[] booleans = new boolean[256];
        for (char c : string.toCharArray())
        {
            if (booleans[c]) return false;
            booleans[c]=true;
        }
        return true;
    }
}
