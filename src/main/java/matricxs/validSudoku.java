package matricxs;

import java.util.HashSet;

class sudoku {

    public boolean isValidSudoku(char[][] board) {

        HashSet<String> seen = new HashSet<>();

        for (int row = 0; row < 9; row++) {

            for (int col = 0; col < 9; col++) {

                if (board[row][col] != '.') {

                    char number = board[row][col];

                    if (!seen.add(number + "in row" + row) || !seen.add(number + "in col" + col) || !seen.add(number + "in block" + (row / 3) + '-' + (col / 3))) {

                        return false;

                    }

                }

            }

        }

        return true;

    }


}


public class validSudoku {
    public static void main(String[] args) {

        char[][] matrix =
                 {{'5' , '3' , '.' , '.' , '7' , '.' , '.' , '.' , '.'}
                , {'6' , '.' , '.' , '1' , '9' , '5' , '.' , '.' , '.'}
                , {'.' , '9' , '8' , '.' , '.' , '.' , '.' , '6' , '.'}
                , {'8' , '.' , '.' , '.' , '6' , '.' , '.' , '.' , '3'}
                , {'4' , '.' , '.' , '8' , '.' , '3' , '.' , '.' , '1'}
                , {'7' , '.' , '.' , '.' , '2' , '.' , '.' , '.' , '6'}
                , {'.' , '6' , '.' , '.' , '.' , '.' , '2' , '8' , '.'}
                , {'.' , '.' , '.' , '4' , '1' , '9' , '.' , '.' , '5'}
                , {'.' , '.' , '.' , '.' , '8' , '.' , '.' , '7' , '9'}};

        boolean ans = new sudoku().isValidSudoku(matrix);

        System.out.println(ans);

    }
}
