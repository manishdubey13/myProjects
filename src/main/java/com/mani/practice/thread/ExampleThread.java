package com.mani.practice.thread;

import java.util.concurrent.TimeUnit;

public class ExampleThread
{
    public static void main(String[] args) throws InterruptedException
    {

        System.out.println("Nmae of current Thread " + Thread.currentThread().getName());
        Runnable runnable = ()->
        {

            System.out.println(" Runnable Thread is Running ");
            System.out.println("Nmae of current Thread " + Thread.currentThread().getName());
        };

        TimeUnit.SECONDS.sleep(1);
        Thread t = new Thread(runnable);
        t.setName("Thread1");
        t.start();



    }
}
