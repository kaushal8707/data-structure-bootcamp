package com.practise.dsa.algo.queue.using_array;

public class Queue_Implementation {
    public static void main(String[] args) {

        Queue queue=new Queue();
        queue.enqueue(11);
        queue.enqueue(22);
        queue.enqueue(33);
        queue.enqueue(43);

        System.out.println("\nAvailable in Queue");
        queue.printQueue();

        int deQueueElement =queue.dequeue();
        System.out.print("\nDequeue Element - "+deQueueElement);

        int deQueueEle =queue.dequeue();
        System.out.print("\nDequeue Element - "+deQueueEle);

        System.out.println("\nAvailable in Queue");
        queue.printQueue();

        int peekedElement =queue.peek();
        System.out.print("\n Peek Element - "+peekedElement);

        System.out.println("\nAvailable in Queue");
        queue.printQueue();
    }
}
