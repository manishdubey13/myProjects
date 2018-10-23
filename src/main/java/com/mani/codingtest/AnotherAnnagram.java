package com.mani.codingtest;

import java.util.*;

public class AnotherAnnagram
{
    public static void main(String[] args)
    {
        String[] inquestion =
                {"palest", "palets", "pastel", "petals","carets","cartes"," caster",
                        "caters"," crates","rapes","reaps","shanim"," spare"," spear","manish","akash","shaak","amisha"};

        //sort the String in questions
        //create the map (key is sorted string and if next string in question is as same
        // as same key add it to map other wise move on)

        Map<String,List<String>> stringListMap = new HashMap<>();


        for (String str : inquestion)
        {

            String sortedString = sortedString(str);
            if(stringListMap.get(sortedString)==null)
            {
                List<String> list = new ArrayList<>();
                list.add(str);
              stringListMap.put(sortedString,list);
            }else
                {
                    stringListMap.get(sortedString).add(str);
                }
        }

        for (List<String> stringList: stringListMap.values())
        {
            System.out.println(stringList);
        }
    }

    public static String sortedString(String string)
    {
        char[] chars = string.trim().toCharArray();

        Arrays.sort(chars);

        return new String(chars);
    }
}
