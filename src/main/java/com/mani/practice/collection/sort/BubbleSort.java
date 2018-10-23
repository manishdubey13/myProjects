package com.mani.practice.collection.sort;

public class BubbleSort
{

    public static void main(String[] args)
    {

        int [] arr ={254,3,5,2,4,5,6777,7};
        sort(arr);


        for (int n:arr)
        {
            System.out.println(n );
        }

    }

    public static void sort(int [] array)
    {
        int[] result = new int[array.length];

        int size =array.length;
        for (int i=0 ;i<size-1;i++)
        {
            for (int j=0;j<size-1-i;j++)
            {
                if(array[j]>array[j+1])
                {
                    swap(array,j,j+1);
                }
            }
        }

    }

    public static void swap(int[] ar , int from,int to)
    {
        int tmp = ar[from];
        ar[from] =ar[to];
        ar[to]=tmp;
    }

    public static void sort1(int [] arr)
    {
        int length = arr.length;

        for (int i=0 ; i<length-1;i++)
        {
            for (int j=0 ; j<length-1-i;j++)
            {
                if (arr[j]>arr[j+1])
                {
                    swap(arr,j,j+1);
                }
            }
        }
    }
}
