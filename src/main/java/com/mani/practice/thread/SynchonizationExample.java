package com.mani.practice.thread;

import org.omg.CORBA.CODESET_INCOMPATIBLE;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.ReentrantLock;
import java.util.stream.IntStream;

public class SynchonizationExample
{/*
    static int count;
    private static void increment()
    {
        ReentrantLock reentrantLock = new ReentrantLock();
        reentrantLock.lock();
        count = count+1;
        reentrantLock.unlock();
    }*/

   static  AtomicInteger count = new AtomicInteger(0);
    private static void increment()
    {
        count.incrementAndGet();
    }

/*

    private synchronized static void increment()
    {
        count = count+1;
    }
*/


    public static void main(String[] args)
    {
/*
        ExecutorService executorService = Executors.newFixedThreadPool(2);
                IntStream.range(0,1000).forEach(i->executorService.submit(SynchonizationExample::increment));
*/
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        IntStream.range(0,1000).forEach(i->executorService.submit(count::incrementAndGet));


        ConcurrentUtils.stop(executorService);
        System.out.println("Count is " +count.toString());

    }


}
