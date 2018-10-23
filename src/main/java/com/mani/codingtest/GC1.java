package com.mani.codingtest;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.stream.StreamSupport;

public class GC1
{
//    Input string aaabbbbcc
//    Output string a3b4c2
    public static void main(String[] args)
    {

        System.out.println(getAlphaNumeric("aaabbbbccm"));
    }

    private static String getAlphaNumeric(String string)
    {
        Map<Character,Integer> map = new HashMap<>();
        char[] chars =  string.toCharArray();
        for (char c : chars)
        {
            Character character = (Character) c;
            if (map.containsKey(character))
            {

                map.put(character,map.get(character)+1);
            }
            else
                {
                    map.put(character,1);
                }
        }

       Set<Map.Entry<Character,Integer>> entrySet = map.entrySet();
      // Set<Map.Entry<Character,Integer>> set =  map.entrySet();
        StringBuilder builder = new StringBuilder();

        for (Map.Entry entry : entrySet)
        {
            builder.append(entry.getKey().toString()+entry.getValue());
        }

        return builder.toString();
    }
}
