package Arrays;


import java.util.HashMap;

class duplicate{

    public boolean check(int []nums,int k){

        // leetcode
        // contains duplicate 1 and 2
        // easy

        int n = nums.length;


        if (n==0 ){

            return false;

        }


        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();



        for(int index=0;index<n;index++){


            if(map.containsKey(nums[index]) && Math.abs(index - map.get(nums[index])) <= k){

                return true;

            }

            map.put(nums[index],index);


        }


        return false;

    }

}

public class containsDuplicate1and2 {
    public static void main(String[] args) {


        new duplicate().check(new int[]{8,7,15,1,6,1,9,15},1);

    }
}
