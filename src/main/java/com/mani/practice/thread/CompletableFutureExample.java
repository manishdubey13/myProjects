package com.mani.practice.thread;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.logging.Logger;

public class CompletableFutureExample

{

    private static final Logger logger = Logger.getLogger(CompletableFutureExample.class.getName());
    public static void main(String[] args)
    {
        ExecutorService executor0 = Executors.newWorkStealingPool();
        ExecutorService executor1 = Executors.newWorkStealingPool();
//Completed when both of the futures are completed
        CompletableFuture<String> waitingForAll = CompletableFuture
                .allOf(
                        CompletableFuture.supplyAsync(() -> {
                            logger.info("Completing first Async Job :");
                           return  "first";
                        } ),
                        CompletableFuture.supplyAsync(() -> {
                            logger.info("Completing 2nd Async Job :");
                            return "second";}, executor1)
                )
                .thenApply(ignored -> " is completed.");

        CompletableFuture<Void> future = CompletableFuture.supplyAsync(() -> "Concurrency Record ", executor0)
                //Using same executor
                .thenApply(result -> "Java " + result)
                //Using different executor
                .thenApplyAsync(result -> "Dzone " + result, executor1)
                //Completed when this and other future are completed
                .thenCombine(waitingForAll, (first, second) -> first + second)
                //Implicitly using ForkJoinPool#commonPool as the executor
                .thenAcceptAsync(result ->
                {
                    logger.info("Result is '" + result + "'.");
                })
                //Generic handler
                .whenComplete((ignored, exception) ->
                {
                    if (exception != null)
                        exception.printStackTrace();
                });
//First blocking call - blocks until it is not finished.
        future.join();
        future
                //Executes in the current thread (which is main).
                .thenRun(() -> logger.info("Current thread is '" + Thread.currentThread().getName() + "'."))
                //Implicitly using ForkJoinPool#commonPool as the executor
                .thenRunAsync(() -> logger.info("Current thread is '" + Thread.currentThread().getName() + "'."));

    }
}
