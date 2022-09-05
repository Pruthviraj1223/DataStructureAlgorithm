package BinarySearch;

class allocate{

    boolean isPossible(int []nums,int midSum,int students){

        int allocateStudents = 1;

        int pages =0;

        for (int index = 0; index < nums.length; index++) {

            if(nums[index] > midSum){

                return false;

            }else if (pages + nums[index] > midSum){

                allocateStudents++;

                pages = nums[index];

                if (allocateStudents > students){

                    return  false;
                }

            }else {

                pages += nums[index];

            }

        }

        return true;



    }

    public int minimumNoOfPages(int []nums,int student){

        int n = nums.length;

        int sum =0;
        for (int num : nums) {

            sum += num;

        }

        int low=0;
        int high = sum;

        int ans=-1;

        while (low<=high){

            int mid = (low + high) /2;

            if(isPossible(nums, mid, student)){

                ans = mid;

                high = mid-1;


            }else {

                low = mid+1;

            }

        }

        return ans;

    }

}


public class allocateMinimumNumberOfMaximumPages {
    public static void main(String[] args) {

        System.out.println(new allocate().minimumNoOfPages(new int[]{12, 34, 67, 90}, 2));

    }
}
