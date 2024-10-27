package arrays;

import java.util.HashMap;
import java.util.Map;

public class twoSum {
    public static void main(String[] args) {

        int []nums = new int[]{2,7,11,15};
        int target = 9;
        
        Map<Integer,Integer> map = new HashMap();
        int[] result = new int[2];


        for(int i=0;i<nums.length;i++){


            if(map.containsKey(target - nums[i])){

                result[0] = i;                      // result[1] / you can have like this as well
                result[1] = map.get(target - nums[i]); // result[0]

//                return result;

            }

            map.put(nums[i],i);

        }

//        return result;

//        -----------------------------------------------------------------------------------------------

        // this solution is helpful in other question


//        Arrays.sort(nums);
//
//        int start = 0;
//        int end = nums.length - 1;
//        int[] result = new int[2];
//
//        while(start<end){
//
//            int sum = nums[start] + nums[end];
//
//            if(sum==target){
//
//
//                result[0] = start;
//                result[1] = end;
//
//                return result;
//            }else if(sum>target){
//
//
//                end--;
//
//
//            }else{
//
//
//                start++;
//
//            }
//
//        }


    }
}
