package com.mani.practice.ds;

public class QueueTest
{
    public static void main(String[] args)
    {

        Queue queue= new Queue(3);
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);

        queue.view();

        System.out.println();
        System.out.println(queue.peek());

        System.out.println(queue.isEmpty());
        System.out.println(queue.isFull());
        System.out.println();

        System.out.println( queue.dequeue());
        System.out.println( queue.dequeue());
        System.out.println( queue.dequeue());
        System.out.println( queue.dequeue());


        System.out.println(queue.isEmpty());
        System.out.println(queue.isFull());
    }
}
