package com.mani.codingtest;

public class FinallyTest
{
    public static void main(String[] args) throws Exception
    {
        try
        {


              //System.exit(0);


            throw new Exception("Coming out");
            //throw new Exception();



            //return;
        }finally
        {
            System.out.println("print me");
        }
    }
}
