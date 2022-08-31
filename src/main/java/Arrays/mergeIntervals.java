package Arrays;


import java.util.Arrays;
import java.util.LinkedList;

public class mergeIntervals {
    public static int[][] main(String[] args) {


        int [][]intervals = new int[][]{{1,2},{3,5}};


        Arrays.sort(intervals,(a, b) -> Integer.compare(a[0],b[0]));


        LinkedList<int[]> list = new LinkedList<>();


        for(int index=0;index<intervals.length;index++){


            if(list.isEmpty() || list.getLast()[1] < intervals[index][0]){


                list.add(intervals[index]);


            }else{


                list.getLast()[1] = Math.max(intervals[index][1],list.getLast()[1]);

            }


        }


        return list.toArray(new int[list.size()][]);

    }
}
