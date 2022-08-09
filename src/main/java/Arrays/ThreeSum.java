package Arrays;//package Arrays;
//
//import java.util.ArrayList;
//import java.util.List;
//
//public class ThreeSum {
//    public static void main(String[] args) {
//
//        List<List<Integer>> mainList = new ArrayList();
//
//        int[] nums = new int[]{1,2,3,4,5}; // this array will be given in question
//
//        if(nums.length < 3){
//
//            return mainList;
//
//        }
//
//
//        Arrays.sort(nums);
//
//
//        for(int i=0;i<nums.length-2;i++){
//
//            int num1ToFind = 0 - nums[i];
//
//            if (i == 0 || (i > 0 && nums[i] != nums[i-1]))
//            {
//
//
//
//                int start = i+1;
//                int end = nums.length - 1;
//
//
//                while(start<end){
//
//                    int sum = nums[start] + nums[end];
//
//                    if(sum==num1ToFind){
//
//                        List<Integer> temp = new ArrayList();
//                        temp.add(nums[start]);
//                        temp.add(nums[end]);
//                        temp.add(nums[i]);
//
//                        mainList.add(temp);
//
//                        while (start < end && nums[start] == nums[start+1]) start++;
//                        while (end < end && nums[end] == nums[end-1]) end--;
//                        start++; end--;
//
//
//
//                    }else if(sum>num1ToFind){
//
//
//                        end--;
//
//
//                    }else{
//
//
//                        start++;
//
//                    }
//
//                }
//            }
//
//
//
//
//
//        }
//
//
//
//
//    }
//}
