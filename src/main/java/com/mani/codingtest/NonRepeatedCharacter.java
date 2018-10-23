package com.mani.codingtest;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class NonRepeatedCharacter
{
    public static void main(String[] args)
    {
        String string = "ABCDEFGHIJKKLLADTVDERFSWVGHQWCNOPENSMSJWIERTFB";

        System.out.println(nonRepeatedChar(string));
    }

    private static Character nonRepeatedChar(String string)
    {
        LinkedHashMap <Character,Integer> characterIntegerMap = new LinkedHashMap<>();
        for (char ch   : string.toCharArray())
        {
            if (characterIntegerMap.containsKey(ch))
            {
                characterIntegerMap.put((ch),characterIntegerMap.get(ch)+1);
            }else
                {
                    characterIntegerMap.put(ch,1);
                }

        }
        Character charactertoReturn=null;

        for (Character c : characterIntegerMap.keySet())
        {
            if (characterIntegerMap.get(c)==1)
            {
                charactertoReturn =c;
                break;
            }
        }
        return charactertoReturn;
    }
}
