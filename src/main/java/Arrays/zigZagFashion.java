package Arrays;

class Test {
    static int arr[] = new int[]{4, 3, 7, 8, 6, 2, 1};

    static void zigZag() {

//        watch GFG picture given in solution

        // if flag = true and arr[i] > arr[i+1] then swap
        // if flag = false and arr[i] < arr[i + 1]  then swap

        boolean flag = true;

        int temp = 0;

        for (int i = 0; i <= arr.length - 2; i++) {
            if (flag) {
                if (arr[i] > arr[i + 1]) {
                    temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
            } else {
                if (arr[i] < arr[i + 1]) {
                    // swap
                    temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
            }
            flag = !flag; /* flip flag */
        }
    }

    public static class zigZagFashion {

        public static void main(String[] args) {

        }
    }
}
