package com.mani.crack;

import java.util.Arrays;

public class Problem8
{
    public static void main(String[] args)
    {
        System.out.println(isRotationof("waterbottle","erbottlewat")) ;
        System.out.println(isRotationof("manish","hsinam")) ;
    }

    private static boolean isRotationof(String str1, String str2)
    {
            char[] chars1 = str1.toCharArray();
            Arrays.sort(chars1);

            char[] chars2 = str2.toCharArray();
            Arrays.sort(chars2);

           for (int i =0 ;i<chars1.length;i++)
           {
               if (chars1[i]!=chars2[i])
                   return false;
           }

        return true;
    }
}
