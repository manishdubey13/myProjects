package com.mani.practice.thread;

import java.util.concurrent.LinkedTransferQueue;
import java.util.concurrent.TransferQueue;

public class TransferQueueExample
{


    class Producer implements Runnable
    {

        TransferQueue<Integer> transferQueue;

        public Producer(TransferQueue<Integer> transferQueue)
        {
            this.transferQueue = transferQueue;
        }

        @Override
        public void run()
        {
            for (int i=0;i<=2;i++)
            {
                try
                {
                    System.out.println("Waiting for transfer " +i);
                    transferQueue.transfer(i);
                    System.out.println("Removing after consumer has consumed it.  " +i);
                } catch (InterruptedException e)
                {
                    e.printStackTrace();
                }
            }
        }
    }


    class Consumer implements Runnable
    {

        TransferQueue<Integer> transferQueue;

        public Consumer(TransferQueue<Integer> transferQueue)
        {
            this.transferQueue = transferQueue;
        }

        @Override
        public void run()
        {
            for (int i=0;i<=2;i++)
            {
                try
                {
                    Thread.sleep(2000);
                    System.out.println("Waiting for consuming");
                    Integer p= transferQueue.take();
                    System.out.println("Consumed. " + p);
                } catch (InterruptedException e)
                {
                    e.printStackTrace();
                }
            }
        }

    }

    public static void main(String[] args)
    {
        TransferQueue<Integer> transferQueue = new LinkedTransferQueue<>();
        TransferQueueExample transferQueueExample = new TransferQueueExample();
        new Thread(transferQueueExample.new Producer(transferQueue)).start();
        new Thread(transferQueueExample.new Consumer(transferQueue)).start();

    }

}
