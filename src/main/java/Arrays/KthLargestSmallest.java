package Arrays;

import java.util.Arrays;
import java.util.HashSet;

public class KthLargestSmallest {
    public static void main(String[] args) {

        int []arr= new int[]{3,54,2,78,11};

        int k=2;

        int n = arr.length;

        Arrays.sort(arr);

        System.out.println(arr[n-k]);  // kth largest

        HashSet set = new HashSet();

        set.add(1);
        set.add(2);



        System.out.println("set.toArray() = " + Arrays.toString(set.toArray()));

    }
}
