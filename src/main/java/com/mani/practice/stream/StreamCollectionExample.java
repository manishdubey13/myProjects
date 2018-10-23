package com.mani.practice.stream;

import com.sun.tools.doclets.formats.html.SourceToHTMLConverter;

import java.util.*;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class StreamCollectionExample
{
    public static void main(String[] args)
    {
        List<Person> people = new ArrayList<>(); //maintains insertion order
        people.add(new Person(6,"Aarushi","Dubey"));
        people.add(new Person(6,"Amisha","Dubey"));
        people.add(new Person(11,"Akash","Dubey"));
        people.add(new Person(41,"Manish","Dubey"));


        List<Person> nameWithA = people.stream().filter(person -> person.name.startsWith("A")).collect(Collectors.toList());

        nameWithA.stream().forEach(System.out::println);

        Map<Integer,List<Person>> mapByAge = people.stream().collect(Collectors.groupingBy(p->p.age));

       mapByAge.forEach((k,v)->{
           //System.out.println("Age " + k + " Value "+ v.toString() );
           System.out.format(" Age  %s \n %s  \n",k,v  );
       });

       Double average = people.stream().collect(Collectors.averagingDouble(p->p.age));

        System.out.format(" Average age is %s",average);
        System.out.println();

        DoubleSummaryStatistics summaryStatistics = people.stream().collect(Collectors.summarizingDouble(p->p.age));

        System.out.println(summaryStatistics);

       Map<Integer,String> map =  people.stream().collect(Collectors.toMap(
                p->p.age,p->p.name,(p1,p2)->p1+ " "+p2
        ));

       Map<String,Integer> mapLastName = people.stream().sorted().collect(Collectors.toMap(
          p->p.lastname,p->p.age,(p1,p2)->p1 +p2
       ));
        System.out.println(map);
        System.out.println(mapLastName);


        Collector<Person,StringJoiner,String> personStringJoinerStringCollector =
                Collector.of(
                        ()-> new StringJoiner(" | "),
                        (j, p)->j.add(p.name.toUpperCase()),
                        (j1,j2)->j1.merge(j2),
                        StringJoiner::toString);

        String names = people.stream().sorted() .collect(personStringJoinerStringCollector);
        System.out.println(names);


       Set<String> keys = mapLastName.keySet();

       Set<Map.Entry<String,Integer>> entrySet= mapLastName.entrySet();

       for ( Map.Entry<String,Integer> entry : entrySet)
       {
           System.out.println("Key "+ entry.getKey() +" value " + entry.getValue());
       }

        //CompletableFuture;
       //Map.Entry<String,Integer> entry = mapLastName.entrySet();



    }
}
