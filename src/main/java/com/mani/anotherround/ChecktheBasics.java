package com.mani.anotherround;

import java.util.*;
import java.util.function.Function;
import java.util.function.IntPredicate;
import java.util.function.Predicate;

public class ChecktheBasics
{
    public static void main(String[] args)
    {


        Map<Integer,List<String>>  map = new HashMap<>();

        List<String> list = new ArrayList<>();
        list.add("Akash");


        List<String> list1 = new ArrayList<>();
        list1.add("Aarushi");
        list1.add("Amisha");

        List<String> list2 = new ArrayList<>();
        list2.add("Manish");

        map.put(11, list);
        map.put(6,list1);

        map.put(41,list2);


        Map<Integer,List<String>>  mapfiletered = getAll(map,(p)->p.equals(Integer.valueOf(11)));

        Set<Map.Entry<Integer, List<String>>> entries =   mapfiletered.entrySet();

        for (Map.Entry entry : entries)
        {
            System.out.print("Key " + entry.getKey() );
            System.out.println("     Value " + entry.getValue() );
        }

        Set<Map.Entry<Integer, List<String>>> entries1 =   map.entrySet();

        for (Map.Entry entry : entries1)
        {
           // System.out.print("Key " + entry.getKey() );
            //System.out.print("     Value " + entry.getValue() );
        }

        Iterator<String> listIterator = list1.iterator();

       while (listIterator.hasNext())
       {
           if (listIterator.next().equals("Amisha"))
           {
               System.out.println(" Nmae -> Removing Amisha");
                       listIterator.remove();
           }

       }

        System.out.println(list1);

    }


    public static Map<Integer,List<String>> getAll(Map<Integer,List<String>> map , Predicate predicate)
    {
        Set<Map.Entry<Integer,List<String>>> entrySet =  map.entrySet();

        Map<Integer,List<String>>  maptoReturn = new HashMap<>();

        for (Map.Entry entry : entrySet)
        {
           if(!predicate.test(((Integer)entry.getKey()).intValue()))
           {
               maptoReturn.put( (Integer) entry.getKey(),(List<String>) entry.getValue());
           }
        }
        return maptoReturn;
    }

}
