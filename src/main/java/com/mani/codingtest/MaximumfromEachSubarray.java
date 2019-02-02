package com.mani.codingtest;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MaximumfromEachSubarray
{
    public static void main(String[] args)
    {
        int[] array = {9,6,11,8,10,5,14,13,93,14};
        int k = 4;

        for (int i=0 ;i<array.length-4;i++)
        {
            int[] tmp = new int[k];

            System.arraycopy(array,i,tmp,0,4);

            //System.arraycopy(array,i,tmp,0,4);

   /*         Map<Integer,Integer> map = new HashMap<>();

            Set<Map.Entry<Integer,Integer>> entries =  map.entrySet();
*/

            Arrays.sort(tmp);
            System.out.println(tmp[k-1]);
        }

    }
}
