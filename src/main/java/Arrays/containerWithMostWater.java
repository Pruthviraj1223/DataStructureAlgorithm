package Arrays;


class container{

    public int maxArea(int[] height) {

        if (height.length==0){

            return 0;

        }

        int left =0;
        int right = height.length-1;

        int area = 0;

        while(left<right){


            area = Math.max(area,(right-left) * Math.min(height[left],height[right]));



            if (height[left]<height[right]){


                left = left + 1;

            }else{

                right = right - 1;

            }

        }

        return area;

    }

}

public class containerWithMostWater {

    public static void main(String[] args) {

    }
}
