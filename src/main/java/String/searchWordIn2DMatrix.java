package String;

public class searchWordIn2DMatrix {


    static boolean exists(char[][] grid, int row, int col, String word) {

        int[] dirX = {0, 1, 0, -1, 1, 1, -1, -1};
        int[] dirY = {1, 0, -1, 0, 1, -1, -1, 1};


        for (int direction = 0; direction < 8; direction++) {

            int index;

            int rd = row + dirX[direction];

            int cd = col + dirY[direction];

            for (index = 1; index < word.length(); index++) {

                if (rd >= grid.length || rd < 0 || cd >= grid[0].length || cd < 0) {
                    break;
                }

                if (grid[rd][cd] != word.charAt(index)) {
                    break;
                }

                rd += dirX[direction];
                cd += dirY[direction];

            }

            if (index == word.length()) {
                return true;
            }

        }

        return false;


    }

    static void searchWord(char[][] grid, String word) {

        int rowLength = grid.length;
        int colLength = grid[0].length;

        int count=0;

        for (int row = 0; row < rowLength; row++) {

            for (int col = 0; col < colLength; col++) {

                if (grid[row][col] == word.charAt(0) && exists(grid, row, col, word)) {

                    count++;

                    System.out.println("Found  Row : " + row + " Col : " + col);

                }
            }
        }

        System.out.println("count : " + count);

    }


    public static void main(String[] args) {


        char[][] grid = {{'G', 'E', 'E', 'K', 'S', 'F', 'O', 'R', 'G', 'E', 'E', 'K', 'S'},
                {'G', 'E', 'E', 'K', 'S', 'Q', 'U', 'I', 'Z', 'G', 'E', 'E', 'K'},
                {'I', 'D', 'E', 'Q', 'A', 'P', 'R', 'A', 'C', 'T', 'I', 'C', 'E'}};

        searchWord(grid, "GEEKS");

        // TIME COMPLEXITY : 0(no of rows * no of col)

    }
}
