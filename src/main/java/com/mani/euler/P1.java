package com.mani.euler;

import java.util.stream.IntStream;

public class P1
{
    public static void main(String[] args)
    {
        methodP1();
        //methodP2();
    }

    private static void methodP1()
    {
        int sum = IntStream.rangeClosed(1,999).filter(n -> (n%3 ==0 || n%5==0 )).reduce(0,(a, b)->a+b);
        System.out.println(sum);
    }
    private static void methodP2()
    {
   /*    int sumOfFibonacci= IntStream.rangeClosed(1,11).mapToObj(a->fibonacci(a)).reduce(0,(a,b)->(a+b));
        System.out.println(sumOfFibonacci);
*/
        int n =0;
        int x=1;
        int sumEven=0;

        while (n<4000000)
        {
            n= fibonacci(x);
            if (n%2==0)
            {
                sumEven = n+sumEven;
            }
            x= x+1;
        }

        System.out.println( " Sum of even Fibonacci " + sumEven);
    }

    private static int fibonacci(int n)
    {
        if ( n==1|| n== 2) return 1;
        return fibonacci(n-1)+fibonacci(n-2);
    }
}
