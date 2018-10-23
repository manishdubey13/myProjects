package com.mani.practice.random;

import java.lang.reflect.Array;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Test1
{
    enum names {Manish,Akash}
    public static void main(String[] args)
    {

   /*     IntStream.range(1,10).forEach(i ->
        {
            System.out.println("Mani" +i);
        });
*/
        String[] strings = {"Manish","Dubey","Akash","Aarushi","Amisha"};

        List<String> stringList = new ArrayList(Arrays.asList(strings));

   /*     System.out.println(stringList.stream().filter(s->s.contains("a")).collect(Collectors.toList()));

        System.out.println(stringList.stream().filter(s->s.length()>0).collect(Collectors.toSet()));

        System.out.println(stringList.stream().filter(s->s.length()>0).collect(Collectors.joining("|")));
        System.out.println(stringList.stream().filter((s->s.length()>4)).collect(Collectors.groupingBy(e -> e.length())));


*/

    Set set = new HashSet();
    List list = new ArrayList();
    List list1 = new LinkedList();
    list1.add(null);
    list.add(null);
    set.add(null);

 /*  SortedSet<String> set1 = new TreeSet<>();
   set1.add(null);
*/
 Set nameSet = EnumSet.of(names.Manish);
 nameSet.stream().forEach(names -> System.out.println(names));

   Map map   = new HashMap();
   map.put(null,null);

   Map map1 = new Hashtable(); //neither key/value be null
  // map1.put("sad",null);

    Deque deque = new ArrayDeque();

    }
}
