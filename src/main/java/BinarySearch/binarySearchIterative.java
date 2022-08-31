package BinarySearch;

class SearchIterative{

    public int binarySearch(int []nums, int key){

        int low=0;

        int high = nums.length-1;

        while (low<=high){

            int mid = low + (high-low)/2;

            if(nums[mid]==key){

                return mid;

            }else if (key < nums[mid]){

                high = mid -1;


            }else {

                low = mid + 1;

            }

        }

        return -1;
    }

}

public class binarySearchIterative {

    public static void main(String[] args) {

    }
}
