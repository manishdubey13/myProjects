package com.mani.practice.stream;

import java.io.InputStream;
import java.util.*;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.*;

public class SPT1
{
    public static void main(String[] args)
    {

        // prints a1,a2,d1,d2,c1,c2
        //Stream.of("a1","a2","d1","d2","c1","c2").filter(s->s.startsWith("a")).forEach(System.out::println);

        List<String> list = new ArrayList<>();
        list.add("a1");
        list.add("a2");
        list.add("d1");
        list.add("d2");
        list.add("c1");
        list.add("c2");

       // list.stream().filter(s->s.startsWith("a")).forEach(System.out::println);

        Supplier<Stream<String>> streamSupplier = ()-> Stream.of("a","b");

        streamSupplier.get().forEach(System.out::println);
        streamSupplier.get().anyMatch(s->s.startsWith("a"));

        List<Person> personList = new ArrayList<>();
        personList.add(new Person(6,"Aarushi","Dubey"));
        personList.add(new Person(6,"Amish","Dubey"));
        personList.add(new Person(11,"Akash","Dubey"));
        personList.add(new Person(41,"Manish","Dubey"));
        personList.add(new Person(45,"Rohit","Dubey"));
        personList.add(new Person(43,"Archana","Dubey"));
        personList.add(new Person(75,"Arun","Dubey"));
        personList.add(new Person(66,"Arun","Dubey"));
        personList.add(new Person(43,"Mohit","Dubey"));
        personList.add(new Person(4,"Mithi","Dubey"));
        personList.add(new Person(9,"Aashi","Dubey"));


        //DoubleSummaryStatistics

        IntSummaryStatistics intSummaryStatistics = personList.stream().collect(Collectors.summarizingInt(p->p.age));
        DoubleSummaryStatistics doubleSummaryStatistics = personList.stream().collect(Collectors.summarizingDouble(p->p.age));

        System.out.println(intSummaryStatistics.getCount());
        System.out.println(intSummaryStatistics.getAverage());
        System.out.println(intSummaryStatistics.getMax());
        System.out.println(intSummaryStatistics.getMin());

        System.out.println("*********************");
        System.out.println(doubleSummaryStatistics.getCount());
        System.out.println(doubleSummaryStatistics.getAverage());
        System.out.println(doubleSummaryStatistics.getMax());
        System.out.println(doubleSummaryStatistics.getMin());
       // doubleSummaryStatistics.

        //Get All the names in | delimited format

        Collector<Person,StringJoiner,String> stringCollector = Collector.of(
                ()-> new StringJoiner("|"),
                (j,p) -> j.add(p.name.toUpperCase()),
                (j1,j2) -> j1.merge(j2),
                StringJoiner::toString
        );

        String names = personList.stream().collect(stringCollector);
        System.out.println("*********************");
        System.out.println(names);

        System.out.println("*********************");
        System.out.println("*********************");

        List<Foo> fooList = new ArrayList<>();
        IntStream.range(1,4).forEach(i->fooList.add(new Foo("Foo"+i)));
        fooList.forEach(f -> IntStream.range(1,4).forEach(i->f.barList.add(new Bar("Bar " +i+ " For " + f))));

        fooList.stream().flatMap(foo -> foo.barList.stream()).forEach(e ->System.out.println(e.name));

        IntStream.range(1,4).mapToObj(i->new Foo("Foo" +i))
                .peek(f-> IntStream.range(1,4).mapToObj(i-> new Bar("Bar" +i +"<-" +f.name))
                .forEach(f.barList::add))
                .flatMap(f->f.barList.stream()).forEach(s->System.out.println(s.name));

        //oldest person
        personList.stream().reduce((p1,p2) -> p1.getAge() < p2.getAge() ?p2:p1).ifPresent(System.out::println);
        //YOUNGEST
        personList.stream().reduce((p1,p2) -> p1.getAge() > p2.getAge() ?p2:p1).ifPresent(System.out::println);

        outer:
        for(;;)
        {
            innerlabel:
            inner: for(;;)
            {
               // break innerlabel;
                System.out.println("breaking it");
                break outer;
            }
        }

        Integer ageSum = personList.stream().reduce(0,(sum,p)->sum+p.getAge(),(sum1,sum2) ->sum1+sum2);
        System.out.println(ageSum);

        Convert<String,Integer> toInteger=(from) ->Integer.valueOf(from);
        System.out.println(toInteger.convert("12") instanceof Integer);

        Greetings<String> greetings = (name)->( "Hello " + name + " !!!");

        System.out.println();

        System.out.println(greetings.greet("Akash"));

        Predicate<Integer> integerPredicate = (integer)->integer.intValue()>0;

        System.out.println(integerPredicate.test(5));

        Function<String,String> applyFunction = (s)->s.toUpperCase();
        Function<String,String> anotherFunction = (s)->s.toLowerCase();
        Function<String,Integer> toInt = (s)->s.length();

        //Convert<String,Integer> stringIntegerConvert = (s) ->s.length();

        System.out.println(applyFunction.apply("Manish"));
        System.out.println(anotherFunction.apply("Manish"));

        Integer stringFunction = applyFunction.andThen(toInt).apply("Manish");

        System.out.println(stringFunction);

        System.out.println("***************");

        Consumer<Person> personConsumer = p->System.out.println(p.getName());

        personConsumer.accept(new Person(9,"Aashi","Dubey"));



    }



}

@FunctionalInterface
interface Convert<F,T>
{
    T convert(F from);
}

@FunctionalInterface
interface Greetings<T>
{
    T greet(T t);
}