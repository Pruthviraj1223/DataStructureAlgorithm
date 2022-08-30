package Arrays;

import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;

class Solution1908 {
    public int[] maxSlidingWindow(int[] nums, int k) {

        LinkedList<Integer> ans = new LinkedList<>();


        if (nums.length == 0) {


        }

        if (k > nums.length) {
        }


        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();


        int n = nums.length;


        Deque<Integer> list = new LinkedList<Integer>();



        int index;

        for(index=0;index<k;++index){


            while((!list.isEmpty()) && nums[index]>= nums[list.peekLast()]){

                list.removeLast();

            }


            list.addLast(index);

        }

        for(;index<n;++index){



            ans.add(nums[list.peek()]);



            while((!list.isEmpty()) && list.peek() <= index-k){

                list.removeFirst();


            }

            while ((!list.isEmpty()) && nums[index] >= nums[list.peekLast()]){

                list.removeLast();


            }



            list.addLast(index);


        }


        ans.add(nums[list.peek()]);



        Object[] objectAarray = ans.toArray();
        int length = objectAarray.length;;
        int [] intArr = new int[length];

        for(int i =0; i < length; i++) {

            intArr[i] = (Integer) objectAarray[i];
        }


        return intArr;



    }
}

public class slidingWindowsMaximum {

    public static void main(String[] args) {


        new Solution1908().maxSlidingWindow(new int[]{7,2,4},2);

    }
}
