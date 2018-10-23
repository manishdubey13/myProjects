package com.mani.practice.thread;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveAction;
import java.util.logging.Logger;

public class RecursiveActionExample extends RecursiveAction
{
    private static final Logger logger = Logger.getLogger(RecursiveActionExample.class.getName());
    int taskCounts;

    public RecursiveActionExample(int taskCounts)
    {
        this.taskCounts = taskCounts;
    }

    @Override
    protected void compute()
    {
        if (taskCounts<100)
        {
            logger.info("Don't Run in parallel ..... -> " + taskCounts + "--->" );
        }else
            {

                logger.info("Running in parallel ... -> " + taskCounts);
                RecursiveActionExample r1 = new RecursiveActionExample(taskCounts/2);
                RecursiveActionExample r2 = new RecursiveActionExample(taskCounts/2);

                r1.fork();
                r2.fork();
                r1.join();
                r2.join();
            }
    }


    public static void main(String[] args)
    {
        RecursiveActionExample example = new RecursiveActionExample(200);
        ForkJoinPool pool = new ForkJoinPool(Runtime.getRuntime().availableProcessors());
        pool.invoke(example);
        //example.compute();
    }
}
