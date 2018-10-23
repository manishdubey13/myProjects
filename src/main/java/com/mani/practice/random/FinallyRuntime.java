package com.mani.practice.random;

public class FinallyRuntime
{
    public static void main(String[] args) throws Throwable
    {
        try
        {
            //throw new RuntimeException("Throwing run time");
            //throw new Error("Sonme error");
            throw new Throwable("");
        } finally
        {
            System.out.println("Want to see this one executed");
        }
    }
}


