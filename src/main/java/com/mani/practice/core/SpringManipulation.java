package com.mani.practice.core;

import java.util.StringJoiner;

public class SpringManipulation
{
    public static void main(String[] args)
    {
       /* System.out.println(doubleChar("The"));
        System.out.println(doubleChar("AAbb") );
        System.out.println(doubleChar("Hi-There"));
*/
        System.out.println(countHi("abc hi ho") );
        System.out.println(countHi("ABChi hi") );
        System.out.println(countHi("hihi") );
    }

    public static String doubleChar(String str)
    {
        String str1;
        StringBuilder stringBuilder = new StringBuilder();
        for(char c : str.toCharArray())
        {
            str1 = String.valueOf(c);
            stringBuilder.append(str1+str1);

        }
        return stringBuilder.toString();
    }

    public static int countHi(String str)
    {
        int count=0;

        if (str==null || str.isEmpty()) return count ;

        str = str.toUpperCase();


        for (int i=0;i<str.length()-1;i++)
        {
           if (str.substring(i,i+2).equals("HI"))
               count++;

        }

        return count;
    }

}
