package com.mani.practice.thread;

import java.util.DoubleSummaryStatistics;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;
import java.util.concurrent.atomic.AtomicBoolean;

public class SemaphoreExample
{
    public static void main(String[] args) throws InterruptedException
    {

        AtomicBoolean atomicBoolean = new AtomicBoolean();
        atomicBoolean.weakCompareAndSet(true,false);
        CyclicBarrier barrier = new CyclicBarrier(2);
        ExecutorService service = Executors.newCachedThreadPool();

            for (int i=0;i<20;i++)
            {
                service.submit(() ->
                {
                    try
                    {
                        Downloader.INSTANCE.downLoadData();
                    } catch (InterruptedException e)
                    {
                        e.printStackTrace();
                    }
                });
            }

            service.shutdown();

            if (!service.isTerminated())
            {
                Thread.sleep(1000);
            }
    }
}

enum Downloader

{

    INSTANCE;

    Semaphore semaphore = new Semaphore(5,true);


    public void downLoadData() throws InterruptedException
    {
        semaphore.acquire();
        try
        {
            downloadWeb();

        } finally
        {
            semaphore.release();
        }
    }

    private void downloadWeb()
    {
        System.out.println("sleeping in download web");
        try
        {
            Thread.sleep(1000);
        } catch (InterruptedException e)
        {
            e.printStackTrace();
        }
    }
}
