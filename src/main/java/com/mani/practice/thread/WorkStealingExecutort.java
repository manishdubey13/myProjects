package com.mani.practice.thread;

import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.IntStream;

public class WorkStealingExecutort
{
    public static void main(String[] args)
    {
        AtomicInteger atomicInteger = new AtomicInteger(0);


        ConcurrentLinkedQueue concurrentLinkedQueue = new ConcurrentLinkedQueue();
        ExecutorService executorService = Executors.newWorkStealingPool();

        System.out.println(executorService);

        System.out.println("Cores available " + ForkJoinPool.commonPool());


        IntStream.range(0,1000).forEach(i->{

            Runnable task =()->
            {
                atomicInteger.accumulateAndGet(i,(n,m)->n+m);

            };
            executorService.submit(task);

        });

        System.out.printf("Count " + atomicInteger);
    }
}
