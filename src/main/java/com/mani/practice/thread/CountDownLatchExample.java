package com.mani.practice.thread;

import java.util.concurrent.CountDownLatch;

public class CountDownLatchExample
{
    public static void main(String[] args) throws InterruptedException
    {
        CountDownLatch countDownLatch = new CountDownLatch(3);
        CountDownLatch countDownForBill = new CountDownLatch(1);


        Runnable cook =
                ()->{

                    try
                    {


                        System.out.println("Order one done");
                        Thread.sleep(1000);
                        countDownLatch.countDown();

                        System.out.println("Order 2 done");
                        Thread.sleep(1000);
                        countDownLatch.countDown();

                        Thread.sleep(1000);

                        System.out.println("Order 3 done");
                        countDownLatch.countDown();

                    } catch (InterruptedException e)
                    {
                        e.printStackTrace();
                    }

                };


        Thread t1 = new Thread(new Waiter(countDownLatch,countDownForBill));
        t1.start();

      /*  Thread anotherWaiter = new Thread(new Waiter(countDownLatch,countDownForBill));
        anotherWaiter.start();
*/
        Thread biller = new Thread(new Biller(countDownForBill));
        biller.start();

        Thread t2 = new Thread(cook);
        t2.start();

        t1.join();
        t2.join();
       // anotherWaiter.join();
        biller.join();



    }
}

class Waiter implements Runnable
{

    CountDownLatch latch;
    CountDownLatch biller;

    public Waiter(CountDownLatch latch,CountDownLatch biller)
    {
        this.latch = latch;
        this.biller=biller;
    }

    @Override
    public void run()
    {
        try
        {
            System.out.println("Waiting for call");
            latch.await();
            Thread.sleep(1000); //do some work
            System.out.println("Waiter finished the job");
            biller.countDown();

        } catch (InterruptedException e)
        {
            e.printStackTrace();
        }

        //System.out.println("Order is ready for table ");
    }
}
class Biller implements Runnable
{

    CountDownLatch latch;

    public Biller(CountDownLatch latch)

    {
        this.latch = latch;

    }

    @Override
    public void run()
    {
        try
        {
            System.out.println("Biller is waiting for call");
            latch.await();
            System.out.println("Serving the bill now ");
        } catch (InterruptedException e)
        {
            e.printStackTrace();
        }

        //System.out.println("Bill is ready for table ");
    }
}


