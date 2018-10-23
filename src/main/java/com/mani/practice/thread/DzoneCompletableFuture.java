package com.mani.practice.thread;

import com.sun.tools.doclets.formats.html.SourceToHTMLConverter;

import java.util.concurrent.*;

import static junit.framework.TestCase.assertTrue;

public class DzoneCompletableFuture
{
    public static void main(String[] args) throws Throwable
    {
  /*      CompletableFuture<String> completableFuture = CompletableFuture.completedFuture("I'm done");
        System.out.println(completableFuture.isDone());
        System.out.println(completableFuture.getNow(null));

   */     /*completableFuture.obtrudeException(new RuntimeException("Lets Blast off !!!"));
        completableFuture.join();*/

    /*    CompletableFuture<Void> cf = CompletableFuture.runAsync(()->
        {

            try
            {
                System.out.println(Thread.currentThread().getName());
                Thread.sleep(1000);
            } catch (InterruptedException e)
            {
                e.printStackTrace();
            }

        });

        System.out.println(cf.isDone());
        Thread.sleep(1000);
        System.out.println(Thread.currentThread().getName());
        System.out.println(cf.isDone());
        */
/*

        CompletableFuture<String> cf1 = CompletableFuture.completedFuture("MANISH");

        cf1.thenApply((s)->s.toUpperCase());
        System.out.println(cf1.isDone());
        System.out.println(Thread.currentThread().getName());
        System.out.println(cf1.getNow(null));
*/



  /*      CompletableFuture<String> cf2 = CompletableFuture.completedFuture("Akash").
       thenApplyAsync((s)-> {
            System.out.println(Thread.currentThread().getName());
            return    s.toUpperCase();
        });
        System.out.println(cf2.isDone());
        System.out.println(cf2.getNow(null));
*/

/*
        ExecutorService service = Executors.newFixedThreadPool(3, new ThreadFactory()
        {
            int count=1;
            @Override
            public Thread newThread(Runnable r)
            {
                return new Thread(r,"Custom-thread-Pool"+count++);
            }
        });


        CompletableFuture cf = CompletableFuture.completedFuture("Manish").thenApplyAsync(s->
        {
            System.out.println(Thread.currentThread().getName());
            return s.toUpperCase();
        },service);

        Thread.sleep(100);
        System.out.println(cf.isDone());
        System.out.println(cf.getNow(null));
        service.shutdownNow();
        service.awaitTermination(1,TimeUnit.DAYS);

        */

      /*  StringBuilder builder = new StringBuilder();
        CompletableFuture cf = CompletableFuture.completedFuture("Manish").thenAccept(s ->
        {
          builder.append(s.toUpperCase());
        });

        System.out.println(cf.isDone());
        System.out.println(cf.getNow(null));

        TransferQueue transferQueue;*/
/*

     StringBuilder builder = new StringBuilder();
       CompletableFuture cf = CompletableFuture.completedFuture("Manish")
               .thenAccept(s-> System.out.println(s));
        System.out.println(cf.getNow(null));
        //assertTrue("Result was empty", builder.length() > 0);

*/
   /* StringBuilder result = new StringBuilder();
    CompletableFuture<Void> cf = CompletableFuture.completedFuture("Manish")
            //.thenAcceptAsync(s-> result.append(s));
            .thenAcceptAsync(s-> System.out.println(s));
    cf.join();
    //assertTrue("Result was empty", result.length() > 0);
*/
        CompletionStage completionStage;




    }


}
