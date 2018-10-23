package com.mani.codingtest;

import java.util.ArrayDeque;
import java.util.Stack;

public class StackTest
{
    public static void main(String[] args)
    {
        System.out.println(checkWellFormedness("[{()}]"));
        System.out.println(checkWellFormedness("({)}"));
        System.out.println(checkWellFormedness("{}()"));


    }

    private static boolean checkWellFormedness( String input)
    {
        char[] chars = input.toCharArray() ;


        ArrayDeque<Character> deque = new ArrayDeque<>();

        for (char c : chars)
        {
            deque.push(c);
        }


       while (deque.size()>0)
        {
            if (Math.abs(deque.getFirst().compareTo(deque.getLast()))<=2)
            {

                deque.removeFirst();
                deque.removeLast();

            }else if ( false)
            {

            }else
                {
                    return false;
                }
        }
        return true;
    }

    private static boolean checkString(String string)
    {
        return false;
    }
}
