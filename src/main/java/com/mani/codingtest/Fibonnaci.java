package com.mani.codingtest;

public class Fibonnaci
{

    public static void main(String[] args)
    {
        //System.out.println(fibonacci(41));
       // System.out.println(factorial(5));
        System.out.println(factorial(0));
       // System.out.println(endX("xxhixx"));
        //System.out.println(endX("hi"));

        //System.out.println(feb(41));
    }

    public static int fibonacci(int n)
    {
        if (n==0) return 0;
        if ( n==1||n==2) return 1;
        return fibonacci(n-1)+fibonacci(n-2);
    }


    public static int factorial(int n )
    {
        if(n<1) return 0;
        if (n==1) return 1;
        return n*factorial(n-1);

      /*  if(n<1) return 0;
        if (n==1) return 1;
        return n*factorial(n-1);*/

    }

    public static String endX(String str)
    {
        int index = str.indexOf('x');
        //return (index < 0) ? str : str.substring(0, index) + endX(str.substring(index + 1)) + "x";
        if (index<0)
        {
            return str;
        }else
            {
               return str.substring(0,index)+endX(str.substring(index+1)) +"x";
            }

    }
    public static boolean isPalindrome(String str)
    {
        int length =  str.length();

        if(length<2) return true;
        return str.charAt(0)!=str.charAt(length-1)?false:
                isPalindrome(str.substring(1,length-1));

    }

    public static boolean isPalindrome1(String str)
    {
        char[] chrs = str.toCharArray();

        int length = chrs.length;
        if(length<2) return true;
        int mid = length/2;

        for(int i =0, j=length-1; i<mid;i++,j--)
        {
            if(chrs[i] != chrs[j]) return  false;
        }
        return true;
    }

    public static int feb(int i)
    {
        int[] feb = new int[i+1];

        feb[0]=0;
        feb[1]=1;

        for (int j =2;j<=i;j++)
        {
            feb[j] = feb(j-1)+feb[j-2];
        }

        return feb[i];

    }
}

