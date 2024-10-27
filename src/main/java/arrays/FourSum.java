package arrays;//package Arrays;
//
//import java.util.ArrayList;
//import java.util.List;
//
//public class FourSum {
//    public static void main(String[] args) {
//
//        int []nums = new int[]{1,23,4,1,4,3};
//        int target =1;
//
//
//        // time complexity == O(n^k-1)
//
//        // 3 sum = O(n^2)
//        // 4 sum = O(n^3)
//
//
//        List<List<Integer>> res = new ArrayList<>();
//        if(nums == null || nums.length < 4){  //corner case
//            return res;
//        }
//        Arrays.sort(nums);
//        for(int i = 0; i < nums.length - 3; i++){
//            if(i > 0 && nums[i - 1] == nums[i]){   //avoid duplicated
//                continue;
//            }
//            for(int j = i + 1; j < nums.length - 2; j++){
//                if(j > i + 1 && nums[j] == nums[j - 1]){   //avoid duplicated
//                    continue;
//                }
//                int left = j + 1, right = nums.length - 1;
//                while(left < right){
//                    int curr = nums[i] + nums[j] + nums[left] + nums[right];
//                    if(curr == target){
//                        List<Integer> t = helper(nums, i, j, left, right);
//                        res.add(new ArrayList<Integer>(t));
//                        left++; right--;
//                        while(left < right && nums[left] == nums[left - 1]){   // left and left - 1 // take care there
//                            left++;                                            // you can do left and left check as well
//                        }                                                      // but after that yoi have increase the left right ++
//                        while(left < right && nums[right] == nums[right + 1]){
//                            right--;
//                        }
//                    }else if(curr > target){
//                        right--;
//                    }else{
//                        left++;
//                    }
//                }
//            }
//        }
//        return res;
//    }
//    private static List<Integer> helper(int[] nums, int i, int j, int k, int l){
//        List<Integer> t = new ArrayList<>();
//        t.add(nums[i]); t.add(nums[j]); t.add(nums[k]); t.add(nums[l]);
//        return t;
//    }
//    }
//}
