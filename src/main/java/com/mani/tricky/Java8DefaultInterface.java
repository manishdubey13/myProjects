package com.mani.tricky;

public interface Java8DefaultInterface
{
   String sayHello(String name);

   public static String sayHi(String name)
   {
       return name + " Hi";
   }

   public default String greeting(String name)
   {
       return name + " Good Morning ";
   }
}
