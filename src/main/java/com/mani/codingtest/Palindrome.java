package com.mani.codingtest;

import java.util.Arrays;

public class Palindrome
{
    public static void main(String[] args)
    {
        System.out.println(isPalindrome("xxhixx"));
        System.out.println(recusriveWay("xxhixx"));
        System.out.println(isPalindrome("xxxpx"));

    }

    private static boolean isPalindrome(String str)
    {
        int strlenght = str.length();
        if (strlenght<2) return true;
         char[] chars = str.toCharArray();

        int middle = strlenght/2;

        for (int i=0 , j=strlenght-1; i<middle ;i++,j--)
        {
            if (chars[i] != chars[j]) return false;
        }

        return true;
    }

    private static boolean recusriveWay(String str)
    {
        int lenght = str.length();
        if (str.length()<2) return true;
        return (str.charAt(0) != str.charAt(lenght-1))?false:
                recusriveWay( str.substring(1,lenght-1));
    }

}
