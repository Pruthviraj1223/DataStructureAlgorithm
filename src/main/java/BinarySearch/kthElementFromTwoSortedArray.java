package BinarySearch;

class median {

    public int findMedian(int[] nums1, int[] nums2, int k) {

        if (nums2.length < nums1.length) {

            findMedian(nums2, nums1,k);

        }

        if (nums1.length == 0 && nums2.length == 0) {

            return k;
        }

        int n1 = nums1.length;

        int n2 = nums2.length;

        int low = 0;

        int high = n1;

        while (low <= high) {

            int cut1 = low + ((high - low) / 2);

            int cut2 = k - cut1; // IMP

            // left1,left2,right1,right2 in also imp

            int left1 = cut1 == 0 ? Integer.MIN_VALUE : nums1[cut1 - 1];   // why cut1 = 0 // because you won't be able to dd nums1[cut1-1] if cut1=0 // so let's take MIN_VALUE // because we just need value

            int left2 = cut2 == 0 ? Integer.MIN_VALUE : nums2[cut2 - 1];

            int right1 = cut1 == n1 ? Integer.MAX_VALUE : nums1[cut1];    // why cut1 = n1 // same as above // for MAX_VALUE

            int right2 = cut2 == n2 ? Integer.MAX_VALUE : nums2[cut2];

            if (left1 <= right2 && left2 <= right1) {

                return Math.max(left1,left2);

            } else if (left1 > right2) {

                high = cut1 - 1;

            } else {

                low = cut1 + 1;

            }
        }

        return -1;
    }
}

public class kthElementFromTwoSortedArray {
    public static void main(String[] args) {

        new median().findMedian(new int[]{100,112,256,349,770}, new int[]{72,86,113,119,265,445,892}, 7);

    }
}
