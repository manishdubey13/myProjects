package com.mani.practice.ms;

public class WaitTest
{

    public void testWait() throws InterruptedException
    {
        try
        {
            wait();
        } catch (InterruptedException e)
        {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws InterruptedException
    {
        //IllegalStateException
     /*   synchronized (new Object())
        {
            new WaitTest().wait();
        }*/

        Runtime.getRuntime().addShutdownHook(new Thread(()->
        {
            System.out.println("killed me !!!!");
        }));

        WaitTest waitTest = new WaitTest();

        synchronized (waitTest)
        {
            waitTest.wait();
            waitTest.testWait();
        }


    }
}
