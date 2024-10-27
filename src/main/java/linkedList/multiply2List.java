package linkedList;

class mul {
    static long multiplyTwoLists(ListNode first, ListNode second) {
        long N = 1000000007;

        long num1 = 0, num2 = 0;

        while (first != null || second != null) {

            if (first != null) {

                num1 = ((num1) * 10) % N + first.val;

                first = first.next;

            }

            if (second != null) {

                num2 = ((num2) * 10) % N + second.val;

                second = second.next;
            }

        }

        return ((num1 % N) * (num2 % N)) % N;

    }
}

public class multiply2List {
    public static void main(String[] args) {

    }
}
