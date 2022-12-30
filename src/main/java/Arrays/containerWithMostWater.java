package Arrays;


class container {

    public int maxArea(int[] height) {

        if (height.length == 0) {

            return 0;

        }

        int left = 0;

        int right = height.length - 1;

        int maxArea = 0;

        while (left < right) {

            maxArea = Math.max(maxArea, (right - left) * Math.min(height[left], height[right]));      // width * height

            if (height[left] < height[right]) {

                left = left + 1;

            } else {

                right = right - 1;

            }

        }

        return maxArea;

    }

}

public class containerWithMostWater {

    public static void main(String[] args) {

        // https://leetcode.com/problems/container-with-most-water/

    }
}
