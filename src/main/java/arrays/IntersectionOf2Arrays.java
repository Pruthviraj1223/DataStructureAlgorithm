package arrays;

import java.util.HashSet;
import java.util.Set;

public class IntersectionOf2Arrays {
    class Solution {
        public int[] intersection(int[] nums1, int[] nums2) {

            // watch simple solution first then watch this to handle multiple cases
            // this asked in facebook interview question

//            function intersections(l1, l2) {
//                l1.sort((a, b) => a - b) // assume sorted
//                l2.sort((a, b) => a - b) // assume sorted
//    const intersections = []
//                let l = 0, r = 0;
//                while ((l2[l] && l1[r]) !== undefined) {
//       const left = l1[r], right = l2[l];
//                    if (right === left) {
//                        intersections.push(right)
//                        while (left === l1[r]) r++;
//                        while (right === l2[l]) l++;
//                        continue;
//                    }
//                    if (right > left) while (left === l1[r]) r++;
//                    else while (right === l2[l]) l++;
//
//                }
//                return intersections;
//            }


            // leetcode question

            // union and intersection on sorted array is easy.

            // union is not tough // go to geeks for geeks if you want

            // below is for unsorted

            Set<Integer> set1 = new HashSet<>();
            Set<Integer> set2 = new HashSet<>();

            for (int num : nums1) {
                set1.add(num);
            }

            for (int num : nums2) {
                if (set1.contains(num)) {
                    set2.add(num);
                }
            }

            int[] nums3 = new int[set2.size()];

            int index = 0;

            for (Integer num : set2) {
                nums3[index++] = num;
            }

            return nums3;

        }
    }
}
