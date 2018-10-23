package com.mani.practice.core;

import java.util.*;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

public class BasUhnHe
{
    public static void main(String[] args)
    {
        String string = "Manish";
        String string1 = "Manish";
        String string2 = new String("Manish");

        if (string==string1 && string.equals(string1))
        {
            System.out.println("same");
        }

    /*    for (int  i=0 ; i <=string.length()-1  ;i++ )
        {

          if( string.charAt(i) ==string1.charAt(i))
          {
             // System.out.println("Both char are same");
          }

            if( (Character)string.charAt(i) ==(Character) string1.charAt(i) &&
                    ((Character)string.charAt(i)).equals((Character) string1.charAt(i))
                    )
            {
                System.out.println("String 1 && String 2 (Literal) -> " + string.charAt(i));
            }

        }*/

        System.out.println(" Should be false  -> " + string==string2);
        System.out.println(" Should be true  -> " + string.equals(string2));


        for (int  i=0 ; i <=string.length()-1  ;i++ )
        {
         if( (Character)string.charAt(i) ==(Character) string2.charAt(i) &&
                    ((Character)string.charAt(i)).equals((Character) string2.charAt(i))
                    )
            {
                System.out.println("String 1 && String 3 -> " + string.charAt(i));
            }


            //ThreadPoolExecutor executor = new ThreadPoolExecutor();

           // Executors.newFixedThreadPool()
        }


        List<String> list = new ArrayList<>();

        list.add("manish");
        list.add("akash");

        Iterator it  = list.iterator();

        while (it.hasNext())
        {
            if (it.next().equals("manish"))
            {
                it.remove();
            }
        }

        list.stream().forEach(System.out::println);


        Map<String,String> map = new HashMap<>();

        map.put("dubey","manish");
        map.put("shukla","deepti");

        Set<Map.Entry<String,String>> entrySet =  map.entrySet();

        for (Map.Entry entry : entrySet)
        {
            System.out.println(entry.getKey() + " ->" + entry.getValue());
        }

        List<String> list1 = new ArrayList<>();

        list1.add("manish");
        list1.add("akash");

        for (Iterator<String> iterator=list1.iterator();iterator.hasNext();)
        {
            if (iterator.next().equals("manish"))
            {
                iterator.remove();
                //iterator.next();
               // iterator.remove();
            }
        }
        list1.stream().findAny().ifPresent(System.out::print);

    }
}
