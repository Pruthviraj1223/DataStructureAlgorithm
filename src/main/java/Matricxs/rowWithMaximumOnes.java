package Matricxs;

class Answer{

    private int findFirst(int[] nums, int target){

        int low=0;

        int high = nums.length-1;

        int res=-1;

        while(low<=high){

            int mid = (low+high)/2;

            if(nums[mid]==target){

                res = mid;

                high = mid-1;

            }else if(target < nums[mid]){

                high = mid - 1;

            }else{

                low = mid + 1;

            }

        }

        return res;

    }

    public void maxOnes(int [][]matrix){


//        Watch multiple solution from GFG , Highly recommended

        int rows = matrix.length;

        int col = matrix[0].length;

        int maxOne = Integer.MIN_VALUE;

        int maxRowIndex=0;

        for (int index = 0; index <rows; index++) {

            int newMax = col - findFirst(matrix[index],1);

            if (newMax > maxOne){

                maxOne = newMax;

                maxRowIndex = index;

            }

        }

        System.out.println("max " + maxOne + " index " + maxRowIndex);


    }

}


public class rowWithMaximumOnes {
    public static void main(String[] args) {

        new Answer().maxOnes(new int[][]{{0,0,1,1},{0,1,1,1},{1,1,1,1},{0,0,0,1},{0,1,1,1}});

    }
}
