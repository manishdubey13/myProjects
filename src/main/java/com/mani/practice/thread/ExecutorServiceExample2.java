package com.mani.practice.thread;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ExecutorServiceExample2
{
    public static void main(String[] args) throws Exception
    {

        Set<Callable<String>> callableSet = new HashSet<>();

        callableSet.add(()->
        {
            return "task1";
        });

        callableSet.add(()->
        {
            return "task2";
        });
        callableSet.add(()->
        {
            return "task3";
        });

        callableSet.add(()->
        {

            Thread.sleep(1000);

            //throw new RuntimeException();
            return "Task 4";
        });

       // List<Future<String>> list = executorService.invokeAny(callableSet);
//        ExecutorService executorService = Executors.newSingleThreadExecutor();
          ExecutorService executorService = Executors.newScheduledThreadPool(1
                  ) ;

        //List<Future<String>> list = executorService.invokeAll(callableSet);

            List<Future<String>> list = executorService.invokeAll(callableSet);

        for (Future<String> future : list )
        {
            System.out.println( "Future Response back ->" + future.get());
        }

        executorService.shutdown();

    }
}
