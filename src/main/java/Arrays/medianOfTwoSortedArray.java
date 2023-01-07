package Arrays;


class median {

    public void findMedian(int[] nums1, int[] nums2) {

        if (nums2.length < nums1.length) {

            findMedian(nums2, nums1);

        }

        if (nums1.length == 0 && nums2.length == 0) {

            return;
        }

        int n1 = nums1.length;
        int n2 = nums2.length;

        int low = 0;
        int high = n1;

        while (low <= high) {

            int cut1 = low + ((high - low) / 2);

            int cut2 = ((n1 + n2 + 1) / 2) - cut1; // IMP

            // left1,left2,right1,right2 in also imp

            int left1 = cut1 == 0 ? Integer.MIN_VALUE : nums1[cut1 - 1];   // why cut1 = 0 // because you won't be able to dd nums1[cut1-1] if cut1=0 // so let's take MIN_VALUE // because we just need value

            int left2 = cut2 == 0 ? Integer.MIN_VALUE : nums2[cut2 - 1];

            int right1 = cut1 == n1 ? Integer.MAX_VALUE : nums1[cut1];    // why cut1 = n1 // same as above // for MAX_VALUE

            int right2 = cut2 == n2 ? Integer.MAX_VALUE : nums2[cut2];

            if (left1 <= right2 && left2 <= right1) {

                double ans;

                if ((n1 + n2) % 2 == 0) {

                    ans = (Math.max(left1, left2) + Math.min(right1, right2)) / 2.0;

                    System.out.println("ans = " + ans);

                } else {

                    ans = Math.max(left1, left2);

                    System.out.println("ans " + ans);

                }

                return;

            } else if (left1 > right2) {

                high = cut1 - 1;

            } else {

                low = cut1 + 1;

            }
        }
    }
}

public class medianOfTwoSortedArray {

    public static void main(String[] args) {

        new median().findMedian(new int[]{1, 2}, new int[]{3, 4});

        // for better understand watch take u forward video
        // understand the concept of cut1,cut2 and left,left2,right1,right2 and all conditions

    }
}
