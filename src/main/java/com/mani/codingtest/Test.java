package com.mani.codingtest;

import java.util.Arrays;
import java.util.List;
import java.util.Stack;
import java.util.stream.Collectors;

//((()))

public class Test
{

    public static void main(String[] args)
    {
        System.out.println(bracket_match("((()))"));
    }

    public static int bracket_match(String bracket_string)
    {
        Stack<Character> stack = new Stack();
        for (char c  : bracket_string.toCharArray())
        {
            stack.push(c);
        }


        int i =0;
        int j =0;
        for (Character character : stack)
        {
            if (character.compareTo('(')==0 )
            {
                i++;
            }
            if(character.compareTo(')')==0)
            {
                j++;
            }
        }

        System.out.println(bracketMatch(bracket_string));
        return Math.abs(i -j) ;

    }


    public static int bracketMatch(String toCheck)
    {
        int i =0;
        int j =0;

        for (Character character : toCheck.toCharArray())
        {
            if (character.compareTo('(')==0)
            {
                i++;
            }else if(character.compareTo(')')==0)
            {
                j++;
            }

        }


        return Math.abs(i-j);
    }

    public List<String> lower(List<String> strings) {
       return strings.stream().map(a->a.replace("x","")).collect(Collectors.toList());
    }

    public List<String> copies(List<String> strings) {
        return strings.stream().map(a->a+a+a).collect(Collectors.toList());
    }

    public List<Integer> noNeg(List<Integer> nums)
    {
            return nums.stream().filter(a -> a>=0).collect(Collectors.toList());
    }

    public List<Integer> no9(List<Integer> nums)
    {
        return nums.stream().filter(n->n%10!=9).collect(Collectors.toList());
    }

    public List<String> noYY(List<String> strings)
    {
        return strings.stream().map(a->a+"y").filter(s->!s.contains("yy")).collect(Collectors.toList());
    }
    public List<Integer> two2(List<Integer> nums)
    {
        return nums.stream().map(n ->n*2).filter(n->n%10!=2).collect(Collectors.toList());
    }

    public List<String> noZ(List<String> strings)
    {
       return strings.stream().filter(s->!s.contains("z")).collect(Collectors.toList());
    }
    public List<String> no34(List<String> strings)
    {
       return strings.stream().filter(a -> !(a.length()==3 || a.length()==4 )).collect(Collectors.toList());
    }
    public List<Integer> noTeen(List<Integer> nums)
    {
        return nums.stream().filter(n -> (n<13 || n>19)).collect(Collectors.toList());
    }
    public List<Integer> square56(List<Integer> nums)
    {
       return nums.stream().map(n->n*n+10).filter(n->!(n%10==5 || n%10==6)).collect(Collectors.toList());
    }

    public List<String> noLong(List<String> strings)
    {
        return strings.stream().filter(s ->s.length()<4).collect(Collectors.toList());
    }

    public String fizzString(String str)
    {
        if (str.charAt(0)=='f'&& str.charAt(str.length()-1) =='b')
        {
            return "FizzBuzz";
        }
        if (str.charAt(0)=='f') return "Fizz";
        if (str.charAt(str.length()-1)=='b') return "Buzz";
        return str;
    }

    public String fizzString2(int n)
    {
        if (n%10 ==3 && n%10==5)
        {
            return "FizzBuzz";
        }
        if (n%10==3)
        {
            return "Fizz";
        }
        if (n%10==5)
        {
            return "Buzz";
        }
        return n+"!";
    }
    public boolean twoAsOne(int a, int b, int c)
    {
        if (a+b ==c) return true;
        if (b+c ==a) return true;
        if (c+a==b) return true;

        return false;
    }

    public boolean inOrder(int a, int b, int c, boolean bOk)
    {
        if (b>a && c>b) return true;

        if (bOk && c>b) return true;
        return false;
    }
    public boolean inOrderEqual(int a, int b, int c, boolean equalOk)
    {
        if (equalOk && a<=b && b<=c) return true;
        if (a<b && b<c) return true;
        return false;
    }

    public boolean lastDigit(int a, int b, int c) {

       int p = a%10;
       int q = b%10;
       int r = c%10;

       if (p==q || q==r || r==p) return true;
       return false;


    }

   /* public int count8(int n)
    {
        int count =0;
        if(n%10 ==8)
        {
            count++;
            return count;
        }else
            {
                count8(n/10);
            }
            return (n%10==8);

    }*/

}
