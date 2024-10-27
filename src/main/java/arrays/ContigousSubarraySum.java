package arrays;


import java.util.HashMap;

class Check {
    public boolean checkSubarraySum(int[] nums, int k) {

        if (nums.length < 2) {
            
            return false;

        }

        int count = 0;

        HashMap<Integer, Integer> map = new HashMap();


        map.put(0, -1);

        int sum = 0;

        for (int index = 0; index < nums.length; index++) {

            sum = sum + nums[index];

            if (k != 0) {

                sum = sum % k;

            }

            Integer prev = map.get(sum);

            if (prev != null) {

                if (index - prev > 1) {

                    count++;


                }

            } else {

                map.put(sum, index);

            }

        }

        System.out.println(count);

        return false;
    }

}

public class ContigousSubarraySum {


    public static void main(String[] args) {

        int[] a = new int[]{1,2,3};

        new Check().checkSubarraySum(a, 3);


    }


}
