package binarySearch;

class SearchNearlySortedIterative{

    public int binarySearch(int []nums, int key){

        /*
        * Element at ith position could be at i-1,i,i+1
        * So will check at mid at i , i-1 , i +1
        * */

        /*
        * Aditya verma and GFG
        * */

        int low=0;

        int high = nums.length-1;

        while (low<=high){

            int mid = low + (high-low)/2;

            if(nums[mid]==key){

                return mid;

            }else if (mid > low && nums[mid-1]==key){

                return  mid-1;

            }else if (mid  < high && nums[mid+1]==key){

                return  mid + 1;

            } else if (key < nums[mid]){

                high = mid -2;


            }else {

                low = mid + 2;

            }

        }

        return -1;
    }

}

public class searchAnElementInNearlySortedArray {
    public static void main(String[] args) {

    }
}
