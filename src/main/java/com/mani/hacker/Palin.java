package com.mani.hacker;

public class Palin
{
    public static void main(String[] args)
    {
        System.out.println(isPalinRecursive("car a rac"));
        System.out.println(isPalinRecursive("madam"));
        System.out.println(isPalinRecursive("ab"));
        System.out.println(isPalinRecursive("b"));
    }

    public static boolean isPalindrome(String string)
    {
        int length = string.length();
        char[] chars = string.toCharArray();
        if (length<2) return true;

        for (int i=0,j=length-1 ;i <length/2;i++,j--)
        {
            if (!(chars[i]==chars[j])) return false;
        }
        return true;
    }

    public static boolean isPalinRecursive(String string)
    {
        int len = string.length();
        if (len<2) return true;

        return (string.charAt(0)!=string.charAt(len-1))? false:
                isPalinRecursive(string.substring(1,string.length()-1));
    }
}
