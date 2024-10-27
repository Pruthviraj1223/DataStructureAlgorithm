package arrays;//package Arrays;
//
//public class threesumClosest {
//
//    public static void main(String[] args) {
//
//        // nums and target will be given
//
//        if(nums.length < 3){
//
//            return 0;
//
//        }
//
//        Arrays.sort(nums);
//
//
//        int res = nums[0] + nums[1] + nums[nums.length - 1];
//
//
//        for(int i=0;i<nums.length-2;i++){
//
//
//
//            if (i == 0 || (i > 0 && nums[i] != nums[i-1])){
//
//                int start = i+1;
//                int end = nums.length - 1;
//
//
//
//                while(start<end){
//
//                    int sum = nums[start] + nums[end] + nums[i];
//
//                    if(sum>target){
//
//
//                        end--;
//
//
//                    }else if(sum<target){
//
//
//                        start++;
//
//                    }else{
//
//
//                        return sum;
//
//
//                    }
//
//                    if(Math.abs(target - sum ) < Math.abs(target - res)){
//
//                        res = sum;
//
//                    }
//
//
//                }
//            }
//
//
//        }
//
//        return res;
//
//
//
//    }
//}
