package stackAndQueue.queue;

class Queue {

    int[] queue;
    int front = -1;
    int rear = -1;

    int size;

    int capacity;

    public Queue(int n) {

        capacity = n;

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

            size ++;

            System.out.println("Element is inserted " + queue[rear] + " rear : " + rear + " front : " + front);

        }
    }

    public void dequeue() {

        if (isEmpty()) {

            System.out.println("Queue is empty");

        } else {

            int x;

            if (rear == capacity - 1 && front == capacity - 1) {

                x = queue[front];

                front = -1;

                rear = -1;

            } else {

                x = queue[front];

                front++;
            }

            size = size -1;

            System.out.println("Element is removed " + x + " rear : " + rear + " front : " + front);
        }


    }

    public boolean isEmpty() {

        return rear == -1 || size==0;

    }

    public boolean isFull() {

        return rear == capacity - 1 || size==capacity;

    }

    public void peek() {

        if (!isEmpty()) {

            System.out.println("Peek element : " + queue[front]);

        } else {

            System.out.println("Peak element :" + -1);
        }
    }

    public void print() {


        for (int f = front; f <= rear; f++) {

            System.out.print(queue[f] + " ");

        }

        System.out.println(" size = " + (rear - front + 1));

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


    }
}
