package com.mani.practice.thread;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Stack;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class LockExample
{

    public static void main(String[] args)
    {

        Stack stack;

        //Arrays.binarySearch();
        Lock lock = new ReentrantLock();
        Semaphore semaphore = new Semaphore(3,true);

        lock.lock();

        HashMap map;

        BlockingQueue blockingQueue = new ArrayBlockingQueue(100);
        //lock.newCondition(TimeUnit.SECONDS.sleep(1);)

    }
}
