package arrays;

import java.util.Arrays;
import java.util.HashMap;

class GfG
{
    public static int minSwaps(int[] nums)
    {
        int len = nums.length;

        HashMap<Integer,Integer> hashMap = new HashMap<>();

        for (int index = 0; index < len; index++) {

            hashMap.put(nums[index],index);

        }

        int ans=0;

        boolean []isVisited = new boolean[len];

        Arrays.fill(isVisited,false);

        Arrays.sort(nums);

        for (int index = 0; index < len; index++) {

            if (isVisited[index] || hashMap.get(nums[index])==index){

                continue;

            }

            int j = index;

            int cycleSize = 0;

            while (!isVisited[j]){

                isVisited[j] = true;

                j = hashMap.get(nums[j]);

                cycleSize++;

            }

            if (cycleSize>0){

                ans += cycleSize - 1;

            }

        }

        return ans;

    }
}

// This code is contributed by Saurabh Johari


public class minimumSwapRequiredToSortArray {

    // Driver program to test the above function
    public static void main(String[] args)
    {
        int []a = {1, 5, 4, 3, 2};

        System.out.println(GfG.minSwaps(a));

    }
}
