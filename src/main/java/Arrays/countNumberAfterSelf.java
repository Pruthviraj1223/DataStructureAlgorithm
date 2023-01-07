package Arrays;

import java.util.ArrayList;
import java.util.List;

class countAfter {
    int[] count;

    public List<Integer> countSmaller(int[] nums) {

        // idea is to merge based on the indexes we store in indexes array

        List<Integer> result = new ArrayList<>();

        count = new int[nums.length];

        int[] indexes = new int[nums.length];

        for (int index = 0; index < nums.length; index++) {

            indexes[index] = index;

        }

        mergesort(nums, indexes, 0, nums.length - 1);

        for (int i : count) {

            result.add(i);

        }

        return result;

    }

    private void mergesort(int[] nums, int[] indexes, int start, int end) {

        if (end <= start) {
            return;
        }

        int mid = (start + end) / 2;

        mergesort(nums, indexes, start, mid);

        mergesort(nums, indexes, mid + 1, end);

        merge(nums, indexes, start, end);
    }

    private void merge(int[] nums, int[] indexes, int start, int end) {

        int mid = (start + end) / 2;

        int leftIndex = start;

        int rightIndex = mid + 1;

        int rightCount = 0;     // right count is the actual answer that we store into count array

        int[] newIndexes = new int[end - start + 1];

        int sortIndex = 0;


        // left = [3,20]   right = [1,2,5,25]

        while (leftIndex <= mid && rightIndex <= end) {

            if (nums[indexes[rightIndex]] < nums[indexes[leftIndex]]) {

                newIndexes[sortIndex] = indexes[rightIndex];

                rightCount++;

                rightIndex++;

            } else {

                newIndexes[sortIndex] = indexes[leftIndex];

                count[indexes[leftIndex]] += rightCount;

                leftIndex++;
            }

            sortIndex++;

        }

        while (leftIndex <= mid) {

            newIndexes[sortIndex] = indexes[leftIndex];

            count[indexes[leftIndex]] += rightCount;

            leftIndex++;

            sortIndex++;
        }

        while (rightIndex <= end) {

            newIndexes[sortIndex] = indexes[rightIndex];

            sortIndex++;

            rightIndex++;

        }

        for (int i = start; i <= end; i++) {

            indexes[i] = newIndexes[i - start];

        }

        // above for loop can also be written like this
        // if (end + 1 - start >= 0) System.arraycopy(newIndexes, 0, indexes, start, end + 1 - start);
    }
}

public class countNumberAfterSelf {

    public static void main(String[] args) {

        // https://leetcode.com/problems/count-of-smaller-numbers-after-self/description/

    }
}