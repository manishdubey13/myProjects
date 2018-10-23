package com.mani.practice.stream;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class SequentialParallel
{
    public static void main(String[] args)
    {
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10);

        //list.stream()
        // .mapToInt(SequentialParallel::transform)
        // .forEach(System.out::println);

   /*     list.parallelStream()
                .mapToInt(SequentialParallel::transform)
                .sequential()//last call wins
                .forEach(System.out::println);

        System.out.println("******************************");


        list.parallelStream()
                .mapToInt(SequentialParallel::transform)
                .forEach(System.out::println);

*/
        System.out.println("******************************");


      /*  list.parallelStream() //Result is wrong
                //.filter(SequentialParallel::check)
                //.mapToInt(SequentialParallel::transform)
                //.forEachOrdered(SequentialParallel::printIt);
                .reduce(0,(result,e)->SequentialParallel.doSum(result,e));
*/
        list.stream()
                //.filter(SequentialParallel::check)
                //.mapToInt(SequentialParallel::transform)
                //.forEachOrdered(SequentialParallel::printIt);
                .reduce(0,(result,e)->SequentialParallel.doSum(result,e)).intValue();

        //System.out.println(list.stream().reduce(0,(r,e)->SequentialParallel.doSum(r,e)));
        System.out.println(list.parallelStream().reduce(0,(r,e)->SequentialParallel.doSum(r,e)));
    }

    public static int transform(int input)
    {
        System.out.println("Thread transforming ***->  +[" +input+ "]"+ Thread.currentThread());
        try
        {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e)
        {
            e.printStackTrace();
        }
        return input;
    }

    public static void printIt(int input)
    {
        System.out.println("Thread Printing ***->  +[" +input+ "]"+ Thread.currentThread());
    }
    public static boolean check(int input)
    {
        try
        {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e)
        {
            e.printStackTrace();
        }
        System.out.println("Thread Checking ***->  +[" +input+ "]"+ Thread.currentThread());
        return true;
    }

    public static int doSum(int result, int element)
    {
        System.out.println("Thread Sum ***->  INPUT [" +result+ "][ ELEMENT " +element+ "]" +Thread.currentThread());


        try
        {
            result=result+element;
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e)
        {
            e.printStackTrace();
        }
        return result;
    }
}
