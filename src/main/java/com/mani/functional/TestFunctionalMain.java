package com.mani.functional;

public class TestFunctionalMain
{
    public static void main(String[] args)
    {
        TestFunctional f = () -> "manish";
        TestFunctional2 f2 = () -> "Akash";
        System.out.println("hello " + f.apply());
        System.out.println("hello " + f2.apply());

        Calculation addition  = (x,y) ->x+y;
        Calculation substraction  = (x,y) ->x-y;
        System.out.println("Sum of 4 , 5 is " + calculate(addition,4,calculate(substraction,4,5)));
    }

    public static Integer calculate(Calculation operation , Integer x, Integer y)
    {
       return operation.apply(x,y);
    }
}
