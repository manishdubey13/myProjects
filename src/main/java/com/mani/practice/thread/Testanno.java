package com.mani.practice.thread;

import com.mani.practice.TestMe;

import java.util.List;

public class Testanno
{
    @TestMe
    String string;
    @TestMe
    public Testanno()
    {

    }

    public static void main(String[] args)
    {
        Testanno testanno = new Testanno();

        System.out.println(testanno.string);

        List list;
    }
}
