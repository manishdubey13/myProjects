package com.mani.java7;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class Java7Test
{
    ///*try with resource */

    static int i;
    static
    {
         i=0;
    }

    public static void main(String[] args)
    {
        try(BufferedReader bufferedReader = new BufferedReader(new FileReader("/Users/manish/readMe.txt"));
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("/Users/manish/copyReadMe.txt")))
        {

               while (bufferedReader.ready())
               {
                   String str =  bufferedReader.readLine();
                   System.out.println(str);
                   bufferedWriter.write( i++ +" "+str);
                   bufferedWriter.newLine();
               }



        }catch (Exception e)
        {
            e.printStackTrace();
        }

        System.out.println(i);
    }
}
