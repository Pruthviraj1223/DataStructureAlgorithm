package Matricxs;

class kth { // 0 ms, faster than 100%
    int totalRows, totalColmuns;
    public int kthSmallest(int[][] matrix, int k) {


        // shashawat tiwari vidoes
        // this question is similiar to median of sorted matrix


        totalRows = matrix.length; totalColmuns = matrix[0].length;

        int left = matrix[0][0], right = matrix[totalRows -1][totalColmuns -1], ans = -1;

        while (left <= right) {

            int mid = (left + right) >> 1;

            if (countLessOrEqual(matrix, mid) >= k) {

                ans = mid;

                right = mid - 1;

            } else {

                left = mid + 1;

            }
        }

        return ans;
    }

    int countLessOrEqual(int[][] matrix, int mid) {

        int count = 0, column = totalColmuns - 1;

        for (int rows = 0; rows < totalRows; ++rows) {

            while (column >= 0 && matrix[rows][column] > mid) --column;

            count += (column + 1);

        }

        return count;
    }
}

public class kthSmallestElementSortedMatricxs {
    public static void main(String[] args) {
        int[][] mat = new int[][]{{1, 3, 7}, {5, 10, 12}, {6, 10, 15}};

        new kth().kthSmallest(mat, 5);
    }
}
