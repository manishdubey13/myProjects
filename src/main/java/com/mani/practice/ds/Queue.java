package com.mani.practice.ds;

public class Queue
{
    private  int size;
    private int front;
    private int rear;
    private  int items;

    int[] intArray;

    public Queue(int size)
    {
        this.size = size;
        intArray = new int[size];
        front=0;
        rear=-1;
        items =0;
    }

    public void enqueue(int data)
    {
        if (rear==size-1)
        {
            rear=-1;
        };
        rear++;
        intArray[rear]=data;
        items++;
    }

    public int dequeue()
    {

        if (isEmpty()) throw new RuntimeException("Queue IS EMPTY ");
        int tmp = intArray[front];
        front++;
        if (front==size)
        {
            front=0;
        }
        items--;
        return tmp;
    }

    public int peek()
    {
        return intArray[front];
    }

    public boolean isFull()
    {
        return items ==size;
    }

    public boolean isEmpty()
    {
        return items ==0;
    }
    public void view()
    {
        System.out.print("[");
        for (int i=0;i<intArray.length;i++)
        {
            System.out.print( " "+intArray[i]+" ");

        }
        System.out.print("]");
    }

}
