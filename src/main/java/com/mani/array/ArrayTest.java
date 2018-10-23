package com.mani.array;
//check for making the generic array


import java.lang.reflect.Array;
import java.util.Arrays;

public class ArrayTest
{
  /*  public  <T> T[] getArray(int size )
    {
        T [] t = new T[size];//compile time error
        return t;
    }
*/

  /*this will through class cast exception @ runtime
  * //Integer[] integers = getArrar(5);
  * */
   public static  <T> T[] getArrar(int size)
   {
       T[] array= (T[])new Object[size];
       return array;
   }


   public static <T>T[] getArray(Class<?> tClass , int size)
   {
       T[] array = (T[])Array.newInstance(tClass,size);
       return array;
   }

    public static void main(String[] args)
    {

        //create the generic array of size n

        Integer [] integers = getArray(Integer.class,5);
        Arrays.stream(integers).forEach(System.out::println);

       // List<Object> objectList = new ArrayList<String>();
       // List<String> stringList = new ArrayList<Object>();
        //Will not compile



    }
}
