package com.mani.practice.random;

public class StringHashcode
{
    public static void main(String[] args)
    {
        String string = new String("Manish");
        String string1 = new String("Akash");

        System.out.println(string.hashCode());
        System.out.println(string1.hashCode());
    }
}
