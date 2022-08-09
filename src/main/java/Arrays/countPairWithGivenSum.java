package Arrays;

import java.util.HashMap;

public class countPairWithGivenSum {

    public static void main(String[] args) {

        // similar to two Numbers

        // GFG problem

        int target = 6;

        int []nums = new int[]{1,2,4,5,6};

        int count = 0;

        HashMap<Integer,Integer> hashMap = new HashMap<>();

        // key : element
        // value : no of occurrence


        for (int num : nums) {

            if (hashMap.containsKey(target - num)) {

                count += hashMap.get(target - num);

            }

            if (hashMap.containsKey(num)) {

                hashMap.put(num, hashMap.get(num) + 1);

            } else {

                hashMap.put(num, 1);
            }


        }
        System.out.println(count);




    }
}
