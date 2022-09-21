package stacksAndQueues.queue;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.PriorityQueue;

class Queue {

    int[] queue;
    int front = -1;
    int rear = -1;

    int size;

    public Queue(int n) {

        size = n;

        queue = new int[n];

    }

    public void enqueue(int element) {

        if (isFull()) {

            System.out.println("Queue is full");

        } else {

            if (front == -1) {

                front++;

            }

            rear++;

            queue[rear] = element;

            System.out.println("Element is inserted " + queue[rear] + " rear : " + rear + " front : " + front);

        }
    }

    public void dequeue() {

        if (isEmpty()) {

            System.out.println("Queue is empty");

        } else {

            if (front == -1) {

                front++;

            }

            int x = queue[front];

            front++;

            System.out.println("Element is removed " + x + " rear : " + rear + " front : " + front);


        }


    }

    public boolean isEmpty() {

        return rear == -1;

    }

    public boolean isFull() {

        return rear == size - 1;

    }

    public void peek() {

        if (!isEmpty()) {

            System.out.println("Peek element : " + queue[front]);

        } else {

            System.out.println("Peak element :" + -1);
        }
    }

    public void print(){


        for (int f = front; f <=rear; f++) {

            System.out.print(queue[f] + " ");

        }

        System.out.println(" size = " + (rear-front+1));

    }

}


public class queueOperation {
    public static void main(String[] args) {

        Queue queue = new Queue(10);

        queue.peek();
        queue.dequeue();
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.enqueue(40);
        queue.enqueue(50);

        queue.print();
        queue.peek();

        queue.dequeue();
        queue.dequeue();
        queue.dequeue();

        queue.enqueue(100);
        queue.enqueue(200);
        queue.enqueue(300);
        queue.enqueue(400);
        queue.enqueue(500);
        queue.enqueue(600);
        queue.enqueue(700);


        queue.print();


        java.util.Queue<Integer> javaQueue = new PriorityQueue<>();
        


    }
}
