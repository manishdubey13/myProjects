package com.mani.crack;


import java.util.Collections;
import java.util.Stack;

public class SortStack
{
    public static void main(String[] args)
    {
        Stack<Integer> integerStack = new Stack<>();
        integerStack.push(2);
        integerStack.push(11);
        integerStack.push(5);
        integerStack.push(15);

        //System.out.println(sortIntegerStack(integerStack));
        System.out.println(sortIntegerStack2(integerStack));
    }

    private static Stack<Integer> sortIntegerStack(Stack<Integer> s)
    {
        Stack<Integer> r = new Stack<>();
        while (!s.isEmpty())
        {
            int tmp = s.pop();
            while (!r.isEmpty() && r.peek()>tmp )
            {
                s.push(r.pop());
            }
            r.push(tmp);

        }
        return r;
    }

    private static Stack<Integer> sortIntegerStack2(Stack<Integer> s)
    {

       Collections.sort(s);
       return s;
    }



}
