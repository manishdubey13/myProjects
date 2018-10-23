package com.mani.practice.thread;

import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.stream.IntStream;

public class BlockingQueueExample
{

    private List queue = new LinkedList();
    private int size=10;
    public static volatile boolean kill = false;

    //enqueue - add element at last


    public BlockingQueueExample(int size)
    {
        this.size = size;
    }

    public synchronized  <T> void  enqueue(T t) throws InterruptedException
    {
        while (queue.size()==size)
        {
            wait();
        }
        if (this.queue.size()==0)
        {
            notifyAll();
        }
        this.queue.add(t);
    }

    public synchronized <T>  T dequeue() throws InterruptedException
    {
        while (this.queue.size()==0)
        {
            wait();
        }
        if (this.queue.size()==size)
        {
            notifyAll();
        }

        return (T)this.queue.remove(0);
    }

    public static void main(String[] args) throws Exception
    {

       final  BlockingQueueExample  blockingQueueExample =
               new BlockingQueueExample(10);

       Thread p = new Thread(new Runnable()
        {
            @Override
            public void run()
            {
                IntStream.rangeClosed(0,10).forEach(i ->
                {
                    try
                    {
                        blockingQueueExample.enqueue("Mani " +i);
                        System.out.println("Mani *********" +i);
                    } catch (InterruptedException e)
                    {
                        e.printStackTrace();
                    }
                });

                try
                {
                    blockingQueueExample.enqueue("EXIT");
                    System.out.println("Going down safely");
                    Thread.interrupted();
                } catch (InterruptedException e)
                {
                    e.printStackTrace();
                }
            }
        });


       Thread c = new Thread(new Runnable()
       {
           @Override
           public void run()
           {
               try
               {
                   while (!(blockingQueueExample.size==0))
                   {
                         Object object = blockingQueueExample.dequeue();

                       if(object.toString().equals("EXIT"))
                       {

                           blockingQueueExample.size=0;

                       }

                       System.out.println(object);
                   }


               }catch (InterruptedException e)
               {
                   e.printStackTrace();
               }


           }

       });

       p.setName("Pro");
       p.start();
        TimeUnit.SECONDS.sleep(2);

        c.setName("Con");
        c.start();

        TimeUnit.SECONDS.sleep(1);
        p.join();
       c.join();


    }


}
