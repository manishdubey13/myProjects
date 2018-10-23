package com.mani.hacker;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.StreamSupport;

public class Ana
{
    public static void main(String[] args)
    {
        System.out.println(isAnnagram("anagram", "margana"));
    }

    public static boolean isAnnagram(String a,String b)
    {
        if (a.isEmpty()||  b.isEmpty()) return false;
        if (a.length()!=b.length()) return false;
        char[] c1 = a.toUpperCase().toCharArray();
        char[] c2 = b.toUpperCase().toCharArray();

        Arrays.sort(c1);
        Arrays.sort(c2);

        for (int i =0 ;i<c1.length ;i++)
        {
           if  (c1[i] !=c2[i])  return false;
        }
        return true;
    }
}
