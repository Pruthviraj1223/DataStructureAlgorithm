package arrays;

class MaxIndex{


    public static int maxIndexDiff(int[] arr, int n) {

        // GFG
        // Nice question

        if(n==1){

            return 0;

        }

        int[] RMax = new int[n];

        int[] LMin = new int[n];

        LMin[0] = arr[0];

        for (int i = 1; i < n; ++i)
            LMin[i] = Integer.min(arr[i], LMin[i - 1]);


        RMax[n - 1] = arr[n - 1];

        for (int j = n - 2; j >= 0; --j)
            RMax[j] = Integer.max(arr[j], RMax[j + 1]);


        int i = 0, j = 0, maxDiff = -1;

        // IMP part

        while (j < n && i < n) {

            if (LMin[i] <= RMax[j]) {

                maxDiff = Integer.max(maxDiff, j - i);

                j++;

            } else

                i++;
        }

        return maxDiff;

    }
}

public class MaximumIndex {

    public static void main(String[] args) {

        MaxIndex.maxIndexDiff(new int[]{34, 8, 10, 3, 2, 80, 30, 33, 1}, 9);

    }
}
