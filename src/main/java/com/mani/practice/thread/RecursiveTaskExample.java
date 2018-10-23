package com.mani.practice.thread;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class RecursiveTaskExample
{
    private static final Logger logger = Logger.getLogger("RecursiveTaskExample.class");

    protected static Logger getLogger()
    {
        return logger;
    }

    public static void main(String[] args) throws Exception
    {

        //ForkJoinPool pool = Executors.newWorkStealingPool();
        //ForkJoinPool pool = new ForkJoinPool(Runtime.getRuntime().availableProcessors());
        ForkJoinPool pool = new ForkJoinPool(2);

       Future<String> stringFuture =  pool.submit(new RecursiveTaskImpl<>("SUCESS",50));

       while (!stringFuture.isDone())
       {
           Thread.sleep(100);
       }

        logger.info("**********Final Result ********");
        logger.info(stringFuture.get());

        pool.shutdown();

       if( !pool.isTerminated())
       {
           pool.awaitTermination(1l,TimeUnit.SECONDS);
       }
/*
        RecursiveTaskImpl recursiveTask1 = new RecursiveTaskImpl("imp1");
        RecursiveTaskImpl recursiveTask2 = new RecursiveTaskImpl("imp2");

        List<RecursiveTaskImpl<String>> recursiveTaskList = new ArrayList<>();
        recursiveTaskList.add(recursiveTask1);
        recursiveTaskList.add(recursiveTask2);

       // List<Future<String>> futures = pool.invokeAll(recursiveTaskList);

        //pool.  .submit(recursiveTask1);
        pool.submit(recursiveTask2);
        pool.submit(recursiveTask2);
*/


       // String str =   pool.invoke(new RecursiveTaskImpl("imp1"));


    }

}

class RecursiveTaskImpl <T> extends RecursiveTask<String>
{
    String str ;
    int count;

    public static volatile int sum=0;

    public RecursiveTaskImpl(String str, int count)
    {
        this.str = str+count;
        this.count=count;

    }

    @Override
    protected String compute()
    {
        //logger.log(Level.ALL,"Returning Sucess");

        String result="";

        if (count>10)
        {

          //  logger.log(Level.ALL,"Doing || execution" + "[ " +count +" ]");
            RecursiveTaskImpl recursiveTask1 = new RecursiveTaskImpl("TaskA", count / 2);
            RecursiveTaskImpl recursiveTask2 = new RecursiveTaskImpl("TaskB", count / 2);

            recursiveTask1.fork();
            recursiveTask2.fork();


            //result = result+ recursiveTask1.join();
            //result = result+ recursiveTask2.join();

            invokeAll(recursiveTask1,recursiveTask2);
           return result + recursiveTask1.join()+recursiveTask2.join();

           // return str+result +"[ " +count +" ]";

        }else
            {
                sum++;
               // logger.log(Level.ALL,"No Forking");
                return result +"[ " +count +" ]";
                //return result +"[ " +sum +" ]";
            }


    }
}