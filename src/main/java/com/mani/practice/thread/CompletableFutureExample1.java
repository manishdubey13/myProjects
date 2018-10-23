package com.mani.practice.thread;

import java.util.concurrent.CompletableFuture;

public class CompletableFutureExample1
{
    public static void main(String[] args) throws Exception
    {

        CompletableFuture<String> future = CompletableFuture.allOf(

                CompletableFuture.supplyAsync(()->
                {
                    System.out.println("Manish");
                    return "Manish";
                }
                ),
                CompletableFuture.supplyAsync(()->
                {
                    System.out.println("Dubey");
                   return "Dubey";
                })

        ).thenApplyAsync(a->
        {
            //System.out.println("completed");
           return a +"completed";
        });

        System.out.println(future.get());
        future.join();

    }
}
