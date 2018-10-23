package com.mani.practice.collection.sort;

public class QuickSort
{

    public static void main(String[] args)
    {
        int [] array = {3,345,5,6,7,3,2,22,344,66};

        QuickSort quickSort = new QuickSort(array );

        /*
        * Two parts ! recursive call and partition
        *
        * recursive(low,high)
        * {
        * if low>=high return ;
        * find the pivot pivot = partition(low,high)
        * recursive(low,pivot-1)
        * recursive(pivot+1,high)
        * }
        *
        * partition(low,high) //remember 3 times swap
        * {
        *   find pivot = (low+high)/2
        *   swap(pivot,high)
        *   track ith position on left i that lowest in each iteration
        *
         *  int i = low
        *
        *   for(int j; j<high ;j++
        *   {
        *           if(arr[j] < arr[high])
        *           swap[i,j]
        *           i++;
        *   }
        *   swap(i,high)
        *   return i;
        * }
        *
        *
        *
        * */

        quickSort.showArray();
        quickSort.sort();
        System.out.println();
        System.out.println("**************");
        quickSort.showArray();

    }


    private int[] nums;

    public QuickSort(int[] nums)
    {
        this.nums = nums;
    }

    public void sort()
    {
        quickSort(0,nums.length-1);
    }

    private void quickSort(int low, int high)
    {
        if (low >= high) return;

        int pivot = partition(low,high);

        quickSort(low,pivot-1);
        quickSort(pivot+1,high);

    }

    private int partition(int low, int high)
    {
        int pivot = (low+high)/2;

        swap(pivot,high);
        int i = low;

        for (int j=low ; j<high;j++)
        {
            if (nums[j]<=nums[high])
            {
                    swap(i,j);
                    i++;
            }
        }

        swap(i,high);
        return i;

    }

    private void swap(int i, int j)
    {

        int tmp = nums[i];
        nums[i]=nums[j];
        nums[j]=tmp;
    }

    private void showArray()
    {
        for (int i : nums)
        {
            System.out.print(i + " ");
        }
    }

}
