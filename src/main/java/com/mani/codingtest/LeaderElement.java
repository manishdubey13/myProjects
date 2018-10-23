package com.mani.codingtest;

public class LeaderElement
{
    public static void main(String[] args)
    {
        //98,54,27
        int[] input = { 98, 23, 54, 12, 20, 7, 27 };

        printLeaderElement(input);

    }

    private static void printLeaderElement(int[] input)
    {
        int currentLeader=0;

        for (int i = input.length-1 ; i>=0;i--)
        {
            if (input[i]>currentLeader)
            {
                currentLeader=input[i];
                System.out.println(input[i]);
            }
        }

    }


}
