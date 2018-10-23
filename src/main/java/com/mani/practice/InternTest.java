package com.mani.practice;

public class InternTest
{
    public static void main(String[] args)
    {
        TempObject object = new TempObject();
        TempObject object1 = new TempObject();

        String str = new String().intern();
        System.out.println(object==object1);
    }
}

class TempObject
{
    int count=0;
}
