package stackAndQueue.stack;

public class nStackInOneArray {
    static class KStack {
        int[] arr; // here where actual element get store

        int[] top; // keep track of latest top element for every stack based on index

        int[] next; // it store next available entry in array

        int n, k;

        int free; // To store beginning index of free list

        KStack(int k1, int n1) {

            k = k1;

            n = n1;

            arr = new int[n];

            top = new int[k];

            next = new int[n];

            for (int index = 0; index < k; index++) {

                top[index] = -1;

            }

            free = 0;

            for (int index = 0; index < n - 1; index++) {

                next[index] = index + 1;

            }

            next[n - 1] = -1;

        }

        boolean isFull() {
            return (free == -1);
        }

        void push(int item, int sn) {

            if (isFull()) {
                System.out.println("Stack Overflow");
                return;
            }

            int i = free; // store the current free index in i;

            free = next[i];         // next available index

            next[i] = top[sn];      // store the previous top index

            top[sn] = i;            // store the latest top idnex

            arr[i] = item;      // store the value
        }

        int pop(int sn) {

            if (isEmpty(sn)) {
                System.out.println("Stack Underflow");
                return Integer.MAX_VALUE;
            }

            int i = top[sn];                // get the latest top index

            top[sn] = next[i];              // store the previous top from next to top

            next[i] = free;                 // store the next available position

            free = i;                       // free will become i , as ith item is popped out now.

            return arr[i];                  // return the item
        }

        boolean isEmpty(int sn) {
            return (top[sn] == -1);
        }

    }

    public static void main(String[] args) {

        int k = 3, n = 10;

        KStack ks = new KStack(k, n);

        // stack number 2
        ks.push(15, 2);
        ks.push(45, 2);

        //  stack number 1
        ks.push(17, 1);
        ks.push(49, 1);
        ks.push(39, 1);

        // stack number 0
        ks.push(11, 0);
        ks.push(9, 0);
        ks.push(7, 0);

        System.out.println("Popped element from stack 2 is " + ks.pop(2));
        System.out.println("Popped element from stack 1 is " + ks.pop(1));
        System.out.println("Popped element from stack 0 is " + ks.pop(0));
    }
}
