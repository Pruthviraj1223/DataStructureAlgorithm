package binarySearch;

class SearchInfinite{

    public int binarySearch(int []nums,int low,int high, int key){

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

    public void search(int []nums,int key){


        int low=0;
        int high=1;

        while (key > nums[high]){

            low = high;

            high = high * 2;

        }

        binarySearch(nums, low, high, key);


    }

}



public class searchAnElementInInfiniteSortedArray {
    public static void main(String[] args) {

    }
}
