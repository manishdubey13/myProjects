package com.mani.practice.core;

public class PassByRef
{
    public static void main(String[] args)
    {
        Integer a = 1;
        Integer b =2;
        PassByRef ref =   new PassByRef();
        ref.swapInteger(a,b);
        System.out.println("a " + a + " b "+ b);
    }

    private  void swapInteger(Integer a, Integer b)
    {
        Integer tmp = b;
        b = a;
        a=tmp;
        System.out.println("a " + a + " b "+ b);
    }




}
