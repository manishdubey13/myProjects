package com.mani.hacker;

public class P3
{
    public static void main(String[] args)
    {
        String string = "Helloworld";
        int upperBound = 7;

        if (!string.isEmpty() && string.length()>=upperBound)
        System.out.println(string.substring(3,upperBound));
    }
}
