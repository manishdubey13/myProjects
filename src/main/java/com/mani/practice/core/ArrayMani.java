package com.mani.practice.core;

public class ArrayMani
{
    public static void main(String[] args)
    {
        int arr[] = new int[] {5, 9, 7, 6};

        int sum=0;

        for (int i=0;i<arr.length;i++)
        {
            int tmp=0;
            if(i==arr.length-1)
            {
                tmp = arr[i]^arr[0];
                System.out.println(tmp);
                sum= sum+tmp;
            }else
            {
                tmp = arr[i] ^ arr[i + 1];
                System.out.println(tmp);
                sum= sum+tmp;
            }
        }

        int sum1=0;
        for (int i=0;i<arr.length;i++ )
        {
            for (int j=i+1;j<arr.length;j++)
            {
                //sum1+= arr[i]^arr[j];
                sum1 += arr[i]^arr[j];
            }
        }

        for (int i:arr)
        {
            //System.out.println(i);
        }

        System.out.println(sum);
        System.out.println(sum1);

        int count=0;

        System.out.println(++count);
    }
}
