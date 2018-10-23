package com.mani.practice.ds;

public class Stack
{
    private int size;
    private int[] intArray;
    private int top;


    public Stack(int size)
    {
        this.size = size;
        this.intArray = new int[size];
        this.top =-1;
    }

    public void push(int data)
    {
       if(isFull())
       {
           throw new RuntimeException("Stack overflow");

       }else
           {
               top++;
               intArray[top]=data;
           }
    }


    public int pop()
    {
       if(isEmpty())
       {
           throw new RuntimeException("Stack is empty");
       }else
           {
               int tmp= top;
               top--;
               return intArray[tmp];
           }
    }

    public boolean isFull( )
    {
        return (top +1==size)?true:false;
    }
    public boolean isEmpty()
    {
        return (top <0)?true:false;
    }

}
