package com.mani.practice.collection.sort;

public class MergeSort
{
    int nums[];
    int tmp[];

    protected MergeSort(int[] nums)
    {
        this.nums = nums;
        tmp = new int[nums.length];
    }

    public static void main(String[] args)
    {
        int nums[] = {2, 4, 3, 5, 3, -1, 6, 4, 6, 9, 4};
        MergeSort sort = new MergeSort(nums);

        sort.mergeSort(0, nums.length - 1);
        sort.showArray();

    }

    public void mergeSort(int low, int high)
    {
        if (low >= high) return;

        int middle = (low + high) / 2;

        mergeSort(low, middle);
        mergeSort(middle + 1, high);

        merge(low, middle, high);

    }

    private void merge(int low, int middle, int high)
    {
        for (int i = low; i <= high; i++)
        {
            tmp[i] = nums[i];
        }

        int i = low;
        int j = middle + 1;
        int k = low;

        while (i <= middle && j <= high)
        {
            if (tmp[i] < tmp[j])
            {
                nums[k] = tmp[i];
                i++;
            }
            else
            {
                nums[k] = tmp[j];
                j++;
            }
            k++;
        }

        while (i <= middle)
        {
            nums[k] = tmp[i];
            i++;
            k++;
        }

        while (j <= high)
        {
            nums[k] = tmp[j];
            j++;
            k++;
        }
    }

    private void showArray()
    {
        for (int i : nums)
        {
            System.out.println(" " + i + " ");
        }
    }
}
