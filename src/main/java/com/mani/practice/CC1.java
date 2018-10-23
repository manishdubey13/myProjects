package com.mani.practice;


import java.time.Period;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CC1
{
    public static void main(String[] args)
    {
        List <String> stringList = new ArrayList<>();
        stringList.add("coke");
        stringList.add("pepsi");
        stringList.add("miranda");
        System.out.println(stringList);

        String[] a1 = new String[stringList.size()];
        String[] a2 = stringList.toArray(a1);

        System.out.println(a1==a2);
      // Arrays.stream(a1).forEach(a-> System.out.println(a));
      // Arrays.stream(a2).forEach(a-> System.out.println(a));

        System.out.println("****************");

       a1 = new String[1];
       a1[0]="Test";
//        a1 = new String[5];
//        a1[0]="Test";

       a2 = stringList.toArray(a1);

        System.out.println(a1==a2);
       // Arrays.stream(a1).forEach(a-> System.out.println(a));
        //Arrays.stream(a2).forEach(a-> System.out.println(a));


       // stringList.removeIf();
        //List<int> list = new ArrayList();

        float f =4;
        float f1 =2;

        double d = f+f1;
        float f2 = f+f1;
        //long l = f+f1; //casting required

        Integer integer = Integer.valueOf("100");


        //Period p = Period.

        Double d1 = new Double(20D);
        Number n = d1;

        System.out.println(n);

        int[] myArray = new int[0];

        System.out.println(myArray.length);

        System.out.println(  Character.codePointAt("Mansih",0));

       // Boolean.

        System.out.println( Integer.decode("10"));

        //AutoCloseable;
        for (;;){}

    }
}
