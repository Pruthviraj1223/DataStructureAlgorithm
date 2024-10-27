package arrays;

public class EquilibriumIndexORPivotIndex {
    
    public static int main(String[] args) {

        // https://leetcode.com/problems/find-pivot-index/
    
        int[] nums = new int[]{1, 3, 5, 6};
    
        int n = nums.length;
        
        int totalSum = 0;

        for (int num : nums) {

            totalSum += num;

        }

        // subtract from total sum and add to left sum
        // when you return index , that index don't count in result . Watch leetcode question for better understanding

        int leftSum = 0;

        for (int index = 0; index < n; index++) {

            totalSum -= nums[index];

            if (totalSum == leftSum) {                          // as I have commented , in the question given that don't include the answer 'index'. Watch leetcode question to understand this condition is why here and not at the end.

                return index;

            }

            leftSum += nums[index];

        }
        
        return -1;
    }
}
