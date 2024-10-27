package binarySearch;

class SearchRecursive {

    public int binarySearch(int[] nums, int low, int high, int key) {


        if (low == high) {

            if(nums[low]==key){

                return nums[low];

            }else{

                return -1;

            }

        }
        else {

            int mid = low+high/2;

            if(nums[mid]==key){

                return mid;

            }else if (key < nums[mid]){

                return binarySearch(nums, low, mid-1, key);

            }else {

                return binarySearch(nums, mid+1, high, key);
            }


        }

    }

}

public class binarySearchRecursive {

    public static void main(String[] args) {

//        new Search().binarySearch();

    }
}
