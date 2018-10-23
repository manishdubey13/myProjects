package com.mani.practice.random;


import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

public class Test
{
    public static void main(String[] args)
    {
        Map<Integer,String> stringMap = new HashMap<>();

        stringMap.put(1,"Manish");
        stringMap.put(2,"Akash");
        stringMap.put(3,"Amisha");
        stringMap.put(4,"Aarushi");
        stringMap.put(5,"Rohit");
        stringMap.put(6,"Archana");

        stringMap.values().stream().sorted().forEach(System.out::println);

        System.out.println("***************");

        Set<Map.Entry<Integer,String>> entrySet =stringMap.entrySet();

       Set<Map.Entry<Integer,String>>mapEntry =stringMap.entrySet();

        Set<Integer> integers = stringMap.keySet();

        for (Integer integer: integers)
        {
            System.out.println("Key " + integer + "Value *-> " + stringMap.get(integer));
        }

      for (Map.Entry entry : entrySet)
      {
          System.out.println(entry.getKey() + " " +  entry.getValue());
      }

      stringMap.forEach((k,v)->
        {System.out.println("Key is " + k + " Value -> " +v);
        });


       List<String> list = new ArrayList<String>();

       list.add("MANISH");
       list.add("AKASH");
       list.add("AMISHA");
       list.add("AARUSHI");


       Iterator<String> iterator = list.iterator();

       while (iterator.hasNext())
        {
            String s = iterator.next();
            if(s.equals("MANISH"))
                iterator.remove();
        }

        list.forEach(s-> System.out.println(s));

       Stack<String> stack = new Stack();

       stack.push("Manbkish");
       stack.push("Dubey");

       while (stack.size()>0)
       {
           System.out.println("--> " + stack.pop());
       }

       for (String s : stack)
       {
           System.out.println(" " +s);
       }
       stack.forEach((s)->{
           System.out.println(s);
       });


       Map<Character,Integer> characterIntegerMap = new HashMap<>();

       characterIntegerMap.put('C',1);
       characterIntegerMap.put('M',1);
       characterIntegerMap.put('A',1);
       characterIntegerMap.put('S',1);
       characterIntegerMap.put('B',1);
       characterIntegerMap.put('N',1);

       Optional<Integer>  integer= characterIntegerMap.values().stream().reduce((v1,v2)->v1+v2);

       integer.ifPresent(System.out::println);

       char[] chars = new char[] {'a','b','c','d'};

        Map<Character,Integer> chaMap = new HashMap<>();

       for (char c : chars)
       {

           if (chaMap.containsKey(c))
           {
               chaMap.put(c, chaMap.get(c) + 1);
           } else
           {
               chaMap.put(c, 1);
           }

       }

       Optional<Integer> integer1 = chaMap.values().stream().filter(count -> count > 1).findFirst();

        System.out.println(integer1.isPresent());


        Optional<String> stringOptional = Optional.of("XXXX");

        System.out.println(stringOptional.orElseGet(String::new));


    }
}
