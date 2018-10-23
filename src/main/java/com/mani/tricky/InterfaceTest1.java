package com.mani.tricky;

public interface InterfaceTest1
{
    public String sayHi(String name);
    public default void log(String msg)
    {
        System.out.println(msg);
    }

    /* can't override base class methods with default method*/
  /*  public default String toString()
    {
        return null;
    }*/

    /* can't override base class methods with static method*/
/*  public static String toString()
  {
      return null;
  }*/

  public static void checkStaticOverride()
  {
      System.out.println("In checkStaticOverride ");
  }
}
