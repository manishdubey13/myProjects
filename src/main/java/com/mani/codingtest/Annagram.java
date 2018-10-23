package com.mani.codingtest;

import com.sun.org.apache.xerces.internal.xs.StringList;

import java.util.*;

public class Annagram
{
    public static void main(String[] args)
    {
        String[] inquestion =
                {"palest", "palets", "pastel", "petals","carets","cartes"," caster",
                        "caters"," crates","rapes","reaps"," spare"," spear"};


        Map<String,List<String>> worldList = new HashMap<>();

        for (String str : inquestion)
        {
            //Sort the str and keep the sorted one as key in map
            List<String> stringList;

            String string = sortStringChars(str.trim());
            stringList = worldList.get(string);

            if (stringList==null)
            {
                stringList = new ArrayList<>();
                stringList.add(str);
                worldList.put(string,stringList);
            }
            else
             {
                 stringList.add(str);
             }
            //put that string in map key->list(kay)
        }

        for (List<String> stringList: worldList.values())
        {
            System.out.println(stringList);
        }
    }

    public static String sortStringChars(String string)
    {
        char[] chars = string.toCharArray();

        Arrays.sort(chars);

        return new String(chars);
    }
}
