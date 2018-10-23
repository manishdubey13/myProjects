package com.mani.practice.thread;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class LockProducerConsume
{

    public static void main(String[] args) throws InterruptedException
    {
        Worker worker = new Worker();

        Runnable producer = ()->{

            try
            {
                worker.producer();
            } catch (InterruptedException e)
            {
                e.printStackTrace();
            }
        };

        Runnable consumer = ()->{

            try
            {
                worker.consumer();
            } catch (InterruptedException e)
            {
                e.printStackTrace();
            }
        };

        Thread t1 = new Thread(producer);
        Thread t2 = new Thread(consumer);

        t1.start();
        t2.start();

        t1.join();
        t2.join();


    }
}


class Worker
{
    Lock lock = new ReentrantLock(true);

    Condition condition = lock.newCondition();

    public void producer() throws InterruptedException
    {
        try
        {
            lock.lock();
            System.out.println("got the lock");
            System.out.println("sleeping with it");

            Thread.sleep(TimeUnit.MILLISECONDS.toMillis(1));

            condition.await();
            System.out.println("Go it again");

        }finally
        {
            lock.unlock();
        }

    }

    public void consumer() throws InterruptedException
    {
        try
        {
            Thread.sleep(2000);
            lock.lock();
            System.out.println("Now Consumer has the lock");
            condition.signalAll();
        } finally
        {
            lock.unlock();
        }
    }
}
