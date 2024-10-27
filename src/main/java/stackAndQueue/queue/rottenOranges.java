package stackAndQueue.queue;

import java.util.LinkedList;
import java.util.Queue;

class rotten {
    public int orangesRotting(int[][] grid) {

        Queue<int[]> rotten = new LinkedList<>();

        int total=0;
        int count=0;
        int days=0;


        int rowLen = grid.length;
        int colLen = grid[0].length;

        for(int row=0;row<rowLen;row++){

            for(int col=0;col<colLen;col++){


                if(grid[row][col]!=0){

                    total++;

                }

                if(grid[row][col]==2){


                    rotten.add(new int[]{row,col});

                }
            }
        }

        int []dirX = {0,1,0,-1};
        int []dirY = {1,0,-1,0};


        while(!rotten.isEmpty()){

            int k = rotten.size();

            count += k;

            if(count==total){

                return days;

            }

            for(int i=0;i<k;i++){

                int []temp = rotten.remove();

                int x = temp[0];
                int y = temp[1];


                for(int index=0;index<4;index++){

                    int newX = x + dirX[index];
                    int newY = y + dirY[index];

                    if(newX<0 || newY<0 || newX>=rowLen || newY>=colLen || grid[newX][newY]!=1){

                        continue;

                    }

                    grid[newX][newY] = 2;

                    rotten.add(new int[]{newX,newY});

                }
            }

            if(!rotten.isEmpty()){

                days++;

            }
        }

        return total==count ? days : -1;

    }
}

public class rottenOranges {
    public static void main(String[] args) {

    }
}
