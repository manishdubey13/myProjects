package com.mani.practice.stream;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

public class CompletableFutureExample
{
        public static void main(String[] args) throws ExecutionException, InterruptedException
        {

        CompletableFuture<Integer> integerCompletableFuture = CompletableFuture.supplyAsync(()->{

            System.out.println("In Supplier");

        /*    try
            {
                TimeUnit.MILLISECONDS.sleep(1);
            } catch (InterruptedException e)
            {
                e.printStackTrace();
            }
*/
            return 2;
        });

        System.out.println("In main " + integerCompletableFuture.thenAccept((e)->{
            System.out.println("---->"+e.intValue());
        }));
    }
}
