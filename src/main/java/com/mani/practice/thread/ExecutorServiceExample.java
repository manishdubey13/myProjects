package com.mani.practice.thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.logging.Logger;

public class ExecutorServiceExample
{
    public static final Logger logger = Logger.getLogger(ExecutorServiceExample.class.getName()) ;

    public static void main(String[] args) throws Exception
    {

        ExecutorService service = Executors.newWorkStealingPool();

        //service.invokeAll();
        Future<String> future = service.submit(()->
        {
            System.out.println("executing callable");
            return " ***********Returning callable";
        });

        System.out.println("Response from Future " + future.get());

    }

}
