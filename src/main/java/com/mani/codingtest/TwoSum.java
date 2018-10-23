package com.mani.codingtest;

import com.sun.nio.sctp.IllegalReceiveException;

import java.util.HashMap;
import java.util.Map;

public class TwoSum
{
    public static void main(String[] args)
    {
        //9
        //int [] nums =  {2, 7, 11, 15,22,34,55,76,8,9,1,34,33};
        //int [] nums =  {1,1,1};
        int [] nums =  {1,2,3,0,3,2,6};

        int target =6;
       int[] a = getTwoSumIndex(nums, target);

        int x  = subarraySum(nums,target);
        //int y = getTwoSumIndexCount(nums,target);

        System.out.println(x);
       //System.out.println(a);
        //int[] a  =getArrayIndexForPartiNumbersInSum(nums,target);


        for (int i :a)
        {
            System.out.println(i);}

       // System.out.println(nums,23);
    }

    private static int[] getTwoSumIndex(int[] nums, int target)
    {
        Map<Integer,Integer> integerMap = new HashMap<>();

        for (int i=0 ;i<nums.length;i++)
        {
            int complement= target-nums[i];

            if (integerMap.containsKey(complement))
            {
                return new int[] { i,integerMap.get(complement)};
            }
            integerMap.put(nums[i],i);
        }
        throw new IllegalArgumentException("Exception");
    }

    private static int[] getArrayIndexForPartiNumbersInSum(int[] nums , int sum)
    {
        //store the sum
        //iterate over the array find the diff number if present
        //store thr array index.

        for (int i=0 ; i<nums.length;i++)
        {
            int tmp  = sum-nums[i];
            for (int j =i+1 ; j<nums.length;j++)
            {
                if(nums[j]==tmp)
                {
                    return new int[]{i,j};
                }
            }
        }

        throw new IllegalArgumentException("Exception");
    }

        public static  int subarraySum(int[] nums, int k) {
            int count = 0, sum = 0;
            HashMap < Integer, Integer > map = new HashMap < > ();
            map.put(0, 1);
            for (int i = 0; i < nums.length; i++)
            {
                sum += nums[i];
                if (map.containsKey(sum - k))
                {
                    int tmp = map.get(sum - k);
                    count++;
                }

                map.put(sum, map.getOrDefault(sum, 0) + 1);
            }
            return count;
        }

    private static int getTwoSumIndexCount(int[] nums, int target)
    {
        Map<Integer,Integer> integerMap = new HashMap<>();
        int count=0;
        for (int i=0 ;i<nums.length;i++)
        {
            int complement= target-nums[i];

            if (integerMap.containsKey(complement))
            {
                //return new int[] { i,integerMap.get(complement)};
                count++;
            }
            integerMap.put(nums[i],i);
        }
        return count;
    }
}
