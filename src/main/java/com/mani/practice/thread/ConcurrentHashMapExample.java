package com.mani.practice.thread;

import java.util.LinkedList;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.LongAdder;
import java.util.logging.ConsoleHandler;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ConcurrentHashMapExample
{


    public static void main(String[] args) throws InterruptedException
    {
        Logger logger=Logger.getLogger(ConcurrentHashMapExample.class.getName());


        ConsoleHandler handler = new ConsoleHandler();
        handler.setLevel(Level.ALL);
        logger.addHandler(handler);
        logger.setLevel(Level.ALL);

        ConcurrentHashMap<String,String>  concurrentHashMap= new ConcurrentHashMap(10)
                ;

        concurrentHashMap.put("mani","dubeyXXXXX");
        concurrentHashMap.put("akash","dubeyMMMMM");


        Runnable runnable =()->
        {
            concurrentHashMap.put("mani","dubeyXXXXX");
            concurrentHashMap.put("mani12","Dubeyji");
            concurrentHashMap.put("mani1","Dubeyji");
            concurrentHashMap.put("mani2","Dubeyji");
            concurrentHashMap.put("mani","dubeyXXXXX");
            concurrentHashMap.put("akash","dubeyWWWW");
        };
        Runnable runnable1 =()->{
            concurrentHashMap.put("akash1","dubey");
            concurrentHashMap.put("akash2","dubey");
            concurrentHashMap.put("akash3","dubey");
            concurrentHashMap.put("akash","dubeyPPPPPP");

            concurrentHashMap.put("mani","sddfXXXXX");
        };

        Runnable reterival =()->{

            logger.log(Level.ALL,"*******************Reterival1Start**************************");
            concurrentHashMap.forEach((k,v)->logger.log(Level.ALL,k +" -> " + v));
            logger.log(Level.ALL,"Reterival1 Count "+concurrentHashMap.size() );
            logger.log(Level.ALL,"******************Reterival11End***************************");

        };
        Runnable reterival1 =()->{

            logger.log(Level.ALL,"~~~~~~~~~~~~~~~~~Reterival2Start~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            logger.log(Level.ALL,"Reterival2 Count "+concurrentHashMap.size() );
            concurrentHashMap.forEach((k,v)->logger.log(Level.ALL,k +" -> " + v));
            logger.log(Level.ALL,"~~~~~~~~~~~~~~~~~~~~~Reterival2End~~~~~~~~~~~~~~~~~~~~~~~~~");

        };

        for (int i=0;i<2;i++)
        {
            new Thread(reterival).start();
            new Thread(reterival1).start();
            new Thread(runnable1).start();
            new Thread(runnable).start();
            new Thread(reterival).start();
            new Thread(reterival1).start();
        }


        logger.log(Level.ALL,"*********************************************");
        concurrentHashMap.forEach((k,v)->logger.log(Level.ALL,k +" -> " + v));
        //concurrentHashMap

        //concurrentHashMap.put("X",longAdder.increment());

    }
}
