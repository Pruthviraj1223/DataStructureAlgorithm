package stacksAndQueues.queue;

class queue {

    int[] queue;
    int front = -1;
    int rear = -1;

    int size;

    public queue(int n) {

        size = n;

        queue = new int[n];

    }

    public void enqueue(int element) {

        if (isFull()) {

            System.out.println("Queue is full");

        } else {

            if (rear == size - 1) {

                rear = -1;

            }

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

            int x;

            x = queue[front];

            if (front==size-1) {

                front =0;

            } else if (front == rear) {

                rear = -1;
                front = -1;

            } else {

                front++;

            }

            System.out.println("Element is removed " + x + " rear : " + rear + " front : " + front);

        }


    }

    public boolean isEmpty() {

        return front == -1;

    }

    public boolean isFull() {

        return (front == -1 && rear == size - 1) || rear == front - 1;

    }

    public void peek() {

        if (!isEmpty()) {

            System.out.println("Peek element : " + queue[front]);

        } else {

            System.out.println("Peak element :" + -1);
        }
    }

    public void print() {


        if((front != -1 && rear != -1)) {

            if (front <= rear) {


                for (int f = front; f <= rear; f++) {

                    System.out.print(queue[f] + " ");

                }

                System.out.println(" size = " + (rear - front + 1));

            } else {

                System.out.println("rear : " + rear + " front : " + front);

                for (int r = 0; r <= rear; r++) {
                    System.out.print(queue[r] + " ");
                }

                System.out.print(" - ");

                for (int f = front; f < size; f++) {
                    System.out.print(queue[f] + " ");
                }


            }
        }

    }

}


public class circularQueue {
    public static void main(String[] args) {

        queue q = new queue(10);

        q.peek();
        q.dequeue();
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.enqueue(40);
        q.enqueue(50);

        q.print();
        q.peek();

        q.dequeue();
        q.dequeue();
        q.dequeue();

        q.enqueue(100);
        q.enqueue(200);
        q.enqueue(300);
        q.enqueue(400);
        q.enqueue(500);
        q.enqueue(600);
        q.enqueue(700);

        q.enqueue(712);
        q.enqueue(888);
        q.enqueue(999);

        q.print();

        System.out.println();

        q.dequeue();
        q.dequeue();
        q.dequeue();
        q.dequeue();
        q.dequeue();
        q.dequeue();
        q.dequeue();
        q.dequeue();
        q.dequeue();
        q.dequeue();


        q.print();

        q.dequeue();



    }
}
