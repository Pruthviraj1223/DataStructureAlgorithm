package stacksAndQueues.stack;

public class interleaveTheFirstHalfElement {
    public static void main(String[] args) {

        // using stack

        // 1 2 3 4 5 6 7 8 9 10

        // STACK :  1 2 3 4 5(T)

        // 6 7 8 9 10 5 4 3 2 1

        // 5 4 3 2 1 6 7 8 9 10

        // STACK : 5 4 3 2 1

        // 6 7 8 9 10           STACK : 5 4 3 2 1(T)
        // 7 8 9 10 1 6         STACK : 5 4 3 2(T)
        // 8 9 10 1 6 2 7       STACK : 5 4 3(T)
        // 9 10 1 6 2 7 3 8     STACK : 5 4 (T)
        // 10 1 6 2 7 3 8 4 9   STACK : 5 (T)
        // 1 6 2 7 3 8 4 9 5 10


        // using queue would be as easy

    }
}
