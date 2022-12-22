package String;

public class searchWordIn2DMatrix {

    static boolean exists(char[][] grid, int row, int col, String word) {

        int[] dirX = {0, 1, 0, -1, 1, 1, -1, -1};
        int[] dirY = {1, 0, -1, 0, 1, -1, -1, 1};

        for (int direction = 0; direction < 8; direction++) {

            int index;

            int rowDir = row + dirX[direction];         // updated row

            int colDir = col + dirY[direction];         // updated col

            // why we are starting index from 1 because we have already check the first character that's why we are here in this function

            for (index = 1; index < word.length(); index++) {

                if (rowDir >= grid.length || rowDir < 0 || colDir >= grid[0].length || colDir < 0) {

                    break;

                }

                if (grid[rowDir][colDir] != word.charAt(index)) {

                    break;

                }

                rowDir += dirX[direction];

                colDir += dirY[direction];

            }

            if (index == word.length()) {

                return true;

            }
        }

        return false;
    }

    static void searchWord(char[][] grid, String word) {

        int rowLen = grid.length;
        int colLen = grid[0].length;

        int count = 0;

        for (int row = 0; row < rowLen; row++) {

            for (int col = 0; col < colLen; col++) {

                if (grid[row][col] == word.charAt(0) && exists(grid, row, col, word)) {

                    count++;

                    System.out.println("Found at Row : " + row + " Col : " + col);

                }
            }
        }

        System.out.println("Total Count : " + count);

    }


    public static void main(String[] args) {

        // https://www.geeksforgeeks.org/search-a-word-in-a-2d-grid-of-characters/

        char[][] grid = {{'G', 'E', 'E', 'K', 'S', 'F', 'O', 'R', 'G', 'E', 'E', 'K', 'S'},
                {'G', 'E', 'E', 'K', 'S', 'Q', 'U', 'I', 'Z', 'G', 'E', 'E', 'K'},
                {'I', 'D', 'E', 'Q', 'A', 'P', 'R', 'A', 'C', 'T', 'I', 'C', 'E'}};

        searchWord(grid, "GEEKS");

        // TIME COMPLEXITY : 0(no of rows * no of col)

    }
}
