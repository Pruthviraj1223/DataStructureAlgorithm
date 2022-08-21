package Arrays;

class TrappingRainWater {

    public int trap(int[] height) {

        // 2 approach
        // leet code solution

        // 1 st approach - left and right max

        if (height==null || height.length==0 || height.length == 1){

            return 0;

        }

        int size = height.length;

        int []left_max = new int[size];

        int []right_max = new int[size];

        left_max[0] = height[0];

        right_max[size-1] = height[size-1];

        for(int index=1;index<size;index++){

            left_max[index] = Math.max(left_max[index-1],height[index]);

        }

        for(int index=size-2;index>=0;index--){

            right_max[index] = Math.max(right_max[index+1],height[index]);

        }

        int ans =0;

        for(int index=1;index<size-1;index++){

            ans += Math.min(left_max[index],right_max[index]) - height[index];

        }

        return ans;


        // 2nd approaches - two pointers

        int ans =0;

        int size = height.length;

        int left_max=0;

        int right_max=0;

        int left=0;
        int right=size-1;

        while(left<right){

            if (height[left]<height[right]){

                if(height[left]>=left_max){

                    left_max = height[left];

                }else{

                    ans += (left_max-height[left]);

                }

                left++;

            }else{

                if(height[right]>=right_max){

                    right_max = height[right];

                }else{

                    ans += (right_max-height[right]);
                }

                right--;

            }

        }


    }
}

public class trappingRainWaterProblem {

    public static void main(String[] args) {

    }
}
