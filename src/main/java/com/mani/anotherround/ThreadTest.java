package com.mani.anotherround;

public class ThreadTest
{
    public static  int count =0;
    public static  int count1 =0;
   static Runnable r = ()->
    {
        try
        {
            //Thread.sleep(100);
            count++;
            //System.out.println("Running ****");
            //System.out.println(Thread.currentThread().getName());
        }catch (Throwable t)
        {

        }

    };

    static class customThread extends Thread
    {
        //int count=0;

    /*    public customThread(int count)
        {
            ThreadTest.count1 = count;
            //this.setName("thread"+count);
        }*/

        @Override
        public void  run()
        {
            //System.out.println(count++);
            count1++;
         /*   synchronized(this)
            {
                count++;
            }*/




        }

        public  int getCount()
        {
            return count1;
        }
    }



    public static void main(String[] args) throws InterruptedException
    {
        String name = "thread";
        for (int i=0;i<10000;i++)
        {
            Thread t  = new Thread(r);
            //t.setName(name+i);
            t.start();
            //t.join();
        }

        for (int i=0;i<10000;i++)
        {
            Thread t  = new customThread();
            t.start();

        }
        System.out.println(Thread.currentThread().getName());

        System.out.println(count);
        System.out.println(count1);

    }
}
