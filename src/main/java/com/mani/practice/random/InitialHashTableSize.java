package com.mani.practice.random;

import java.util.HashMap;

public class InitialHashTableSize
{
    public static void main(String[] args)
    {
        //System.out.println(tableSizeFor());
        HashMap map = new HashMap();
        System.out.println(map.size());
        //System.out.println(HashMap.SimpleEntry);

        System.out.println(map.entrySet().size());


    }



    static final int tableSizeFor(int cap)
    {
        int n = cap - 1;
        n |= n >>> 1;
        n |= n >>> 2;
        n |= n >>> 4;
        n |= n >>> 8;
        n |= n >>> 16;
        return n;
    }
}
