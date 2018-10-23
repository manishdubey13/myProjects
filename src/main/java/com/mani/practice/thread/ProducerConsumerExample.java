package com.mani.practice.thread;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.logging.Logger;

public class ProducerConsumerExample
{

    private static final Logger logger = Logger.getLogger("ProducerConsumerExample.class");

    public static void main(String[] args) throws Exception
    {
        BlockingQueue<String> msgQueue = new ArrayBlockingQueue<String>(50);



        Producer p = new Producer(msgQueue);
         Thread t1 =  new Thread(p);

         t1.start();

        Consumer c = new Consumer(msgQueue);

        Thread t2 = new Thread(c);
        t2.start();

        t1.join();
        logger.info("T1 done");

        t2.join();

        logger.info("T2 done");


        Thread.sleep(1000);


    }

}

class Producer implements Runnable
{
    private static final Logger logger = Logger.getLogger("Producer.class");

    BlockingQueue<String> msgQ;

    public Producer(BlockingQueue<String> queue)
    {
        msgQ=queue;
    }

    @Override
    public void run()
    {
        int incrementCounter =0;

        for (int i=0 ; i<100;i++)
        {
            try
            {
                incrementCounter++;
                if (incrementCounter==10)
                {
                    Thread.sleep(1000);

                    incrementCounter=0;
                }
                logger.info("PUTTING  " + i);

                msgQ.put("Hello " + i);
            } catch (InterruptedException e)
            {
                e.printStackTrace();
            }
        }
        logger.info("putting last msg" );
        try
        {
            msgQ.put("Exit");
        } catch (InterruptedException e)
        {
            e.printStackTrace();
        }

    }
}

class Consumer implements Runnable
{
    BlockingQueue<String> msgQ;

    private static final Logger logger = Logger.getLogger("Consumer.class");


    public Consumer(BlockingQueue<String> queue)
    {
        msgQ=queue;
    }

    @Override
    public void run()
    {
        /*for (int i=0 ; i<10;i++)
        {
            try
            {
                System.out.println(msgQ.take());
            } catch (InterruptedException e)
            {
                e.printStackTrace();
            }
        }*/

     /*   msgQ.forEach(s ->
        {
            System.out.println(""+s);
        });
*/

     {
            try
            {
                String str;
                while ((str = msgQ.take()) != "Exit")
                {
                    logger.info(" taking "+str);
                }

            }catch (InterruptedException e)
            {
                e.printStackTrace();
            }

        }

    }
}


