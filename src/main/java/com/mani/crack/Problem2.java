package com.mani.crack;

public class Problem2
{
    /*
    * Write code to reverse a C-Style String. (C-String means that “abcd” is
    * represented as five characters,
    * including the null character.)
    * */

    public static void main(String[] args)
    {
        System.out.println(reverseCStyle("abcd"));
    }

    private static String reverseCStyle(String string)
    {

        return new StringBuilder(string).reverse().toString();
    }
}
