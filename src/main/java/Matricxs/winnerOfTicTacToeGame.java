package Matricxs;

class ticTacToe {

    boolean didPlayerWin(char [][]board,int row,int col,char player){


        boolean didWin = true;

        for(int index=0;index<3;index++){

            if (board[row][index] != player) {

                didWin = false;

                break;
            }

        }

        if(didWin){
            return true;
        }

        didWin = true;

        for(int index=0;index<3;index++){

            if (board[index][col] != player) {

                didWin = false;

                break;
            }

        }

        if(didWin){
            return true;
        }


        if(row==col){

            didWin = true;


            for(int index=0;index<3;index++){

                if (board[index][index] != player) {

                    didWin = false;

                    break;
                }

            }

            if(didWin){
                return true;
            }
        }

        if(col == 3 - row - 1){
            didWin = true;
            for(int i = 0; i < 3; i++){
                if (board[i][3 - i - 1] != player) {
                    didWin = false;
                    break;
                }
            }
            return didWin;   //player has won the game
        }

        return false;


    }


    public String tictactoe(int[][] moves) {

        char [][]board = new char[3][3];

        for(int index=0;index<moves.length;index++){

            int row = moves[index][0];
            int col = moves[index][1];

            if((index & 1) == 0){

                board[row][col] = 'X';

                if(didPlayerWin(board,row,col,'X')){
                    return "A";
                }

            }else{

                board[row][col] = 'O';

                if(didPlayerWin(board,row,col,'O')){
                    return "B";
                }

            }
        }

        int n=3;

        return moves.length == n * n ? "Draw" : "Pending";

    }
}

public class winnerOfTicTacToeGame {
    public static void main(String[] args) {

    }
}
