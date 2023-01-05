package Arrays;

import java.util.Arrays;

public class nonOverlappingIntervals {

    int find(int[][] intervals){

        // first watch merge intervals

        if (intervals == null || intervals.length == 0) return 0;

        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));

        int prevEnd = intervals[0][1];

        int count = 0;

        // we will store prev end and then check overlapped conditions

        for (int index = 1; index < intervals.length; index++) {

            if (prevEnd > intervals[index][0]) {        // [1,5] [3,7]  = prevEnd = 5 , intervals[index][0] = 3 // it means overlapping

                count++;

                prevEnd = Math.min(intervals[index][1], prevEnd);

            } else {

                prevEnd = intervals[index][1];

            }
        }

        return count;
    }

    public static void main(String[] args) {

        //https://leetcode.com/problems/non-overlapping-intervals/submissions/871631875/

    }
}
