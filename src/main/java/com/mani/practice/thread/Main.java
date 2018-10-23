package com.mani.practice.thread;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

public class Main {

    public static void main(String[] args) throws Exception

    {
       /* String name = args[0];
        System.out.println("Hello World! " + name );
*/

        ExecutorService service = Executors.newCachedThreadPool();
        Runnable runnable = new Runnable()
        {
            @Override
            public void run()
            {
                System.out.println("me too");
            }
        };


        Runnable r1 =()->
        {
            System.out.println("mee tooooo");
            try
            {
                Thread.sleep(10000);
                System.out.println("waking up after sleep");

            } catch (InterruptedException e)
            {
                e.printStackTrace();
            }
        };

       Future future= service.submit(r1);
        System.out.println(future.get());
        service.execute(r1);

        service.shutdown();
        service.awaitTermination(1, TimeUnit.DAYS);


        Thread t = new Thread(runnable);
        Thread t1 = new Thread(r1);

        /*Hashtable<String,String> hashtable = new Hashtable<>();
        hashtable.put("",null);t
*/

        HashMap<String,String> hashMap = new HashMap<>();

        hashMap.put(null,null);


        t.start();
        t1.start();
        t.join();
        t1.join();



    }



}
