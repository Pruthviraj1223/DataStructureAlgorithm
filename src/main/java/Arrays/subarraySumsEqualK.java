package Arrays;

import java.util.HashMap;

class sum{

    int subarraySum(int nums[],int k){

        if (nums.length<1){

            return 0;

        }

        int sum=0,count=0;

        HashMap<Integer,Integer> map = new HashMap();


        map.put(0,1);


        for(int num:nums){


            sum += num;

            int find = sum - k;


            if(map.containsKey(find)){


                count += map.get(find);


            }


            map.put(sum,map.getOrDefault(sum,0)+1);



        }

        return count;

    }

}


public class subarraySumsEqualK {

    public static void main(String[] args) {

    }

}
