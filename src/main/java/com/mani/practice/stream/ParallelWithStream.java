package com.mani.practice.stream;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ForkJoinPool;

public class ParallelWithStream
{
    public static void main(String[] args)
    {
        //System.out.println(Runtime.getRuntime().availableProcessors());
        //System.out.println(ForkJoinPool.commonPool());

        CompletableFuture.runAsync(()->{
            System.out.println("In runAsync");
        }).thenRun(()->{
            System.out.println("Next stage");
        });



        System.out.println("In main");
    }
}
