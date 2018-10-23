package com.mani.practice.thread;

import java.util.concurrent.TimeUnit;

public class ShutDownHookExample
{

    private static Runtime runtime;

    public static void main(String[] args) throws Exception
    {

        System.out.println("kill me before 19 second");
        runtime = Runtime.getRuntime();

        runtime.addShutdownHook(new Thread(()->
        {
            System.out.println(" processors "+runtime.availableProcessors());
            System.out.println(" Free Memory "+runtime.freeMemory()/1024);
            System.out.println(" Total Memory "+runtime.totalMemory()/1024);
            System.out.println(" Max Memory "+runtime.maxMemory()/1024);
            System.out.println("Calling the shutdownhook ");
        }));

        System.out.println("calling sleep");
        TimeUnit.SECONDS.sleep(30);
        System.out.println("waking from  sleep");

    }
}
