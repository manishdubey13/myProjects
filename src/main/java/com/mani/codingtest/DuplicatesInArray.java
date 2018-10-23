package com.mani.codingtest;

import java.util.Arrays;

public class DuplicatesInArray
{
    static int intCount=0;
    public static void main(String[] args)
    {
        //find first occurrence of 5
       int[]  array = {0, 1, 2, 2, 4, 5, 5, 5,8};
        //int[] array = {, 1, 2, 2, 4, 5, 5, 5, 8};

        //System.out.println(getFirstIndex(array,5));
        System.out.println(getArrayIndex(array,1));


    }



    private static int getFirstIndex(int[] array, int num)
    {
        if (array == null) return 0;
        int len= array.length;
        int mid = (len)/2;

        if (mid==1 )
        {

            return intCount +mid;
        }
        if(array[mid]==num)
        {
            return intCount+mid;
        }

        intCount = intCount+mid;
        if (num<array[mid])
        {
            int tmp[] = new int[mid];
            System.arraycopy(array,0,tmp,0,mid);
            return getFirstIndex(tmp,num);

        }else
        {

            int tmp[] = new int[len-mid];
            System.arraycopy(array,mid+1,tmp,0,len-mid-1);
            return getFirstIndex(tmp,num);
        }

    }

    private static int getArrayIndex(int[] a, int numIndex)
    {

        if (a ==null || a.length<1) return -1;

        int start=0;
        int end = a.length-1;

        while (start <= end)
        {
            int mid = (start+end) / 2;
            if (a[mid]==numIndex && (mid==0 || a[mid-1]<numIndex))
            {
                return mid;
            }else if (numIndex<=a[mid])
            {
                end=mid-1;
            }
            else
            {
                start=mid+1;
            }
        }

        return -1;
    }




}
