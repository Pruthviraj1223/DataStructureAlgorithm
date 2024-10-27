package stackAndQueue.stack.recursion;

class recur {

    public void print(int n) {

        if (n == 1) {
            System.out.println("1");
            return;
        }

        print(n - 1);

        System.out.println(n);

    }

    public void printNto1(int n) {

        if (n == 1) {
            System.out.println("1");
            return;
        }

        System.out.println(n);

        printNto1(n - 1);

    }


}

public class print1toN {
    public static void main(String[] args) {

        System.out.println("1 to N");
        new recur().print(5);

        System.out.println("N to 1");
        new recur().printNto1(5);
    }
}
