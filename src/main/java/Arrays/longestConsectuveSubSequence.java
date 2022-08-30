package Arrays;

import java.util.HashSet;
import java.util.Set;

class LongestSequence {

    public int longestConsecutive(int[] nums) {

        if(nums == null || nums.length==0){

            return 0;

        }

        if (nums.length==1){


            return 1;

        }

        Set<Integer> set = new HashSet<>();

        for(Integer num:nums){

            set.add(num);

        }


        int longestSeq =0;


        for(int num:nums){


            if(!set.contains(num-1)){


                int curnum = num;
                int curSeq =1;


                while(set.contains(curnum+1)){


                    curnum +=1;

                    curSeq +=1;

                }

                longestSeq = Math.max(longestSeq,curSeq);

            }

        }

        return longestSeq;


    }
}


public class longestConsectuveSubSequence {
}
