package Arrays;

import java.util.Arrays;

class MinimumPlatform{

    public int Platform(int []arrival, int[] departure){

        Arrays.sort(arrival);
        Arrays.sort(departure);

        int i=0,j=0;

        int n1 = arrival.length;

        int n2 = departure.length;

        int count=0;

        int ans=0;

        while (i < n1 && j < n2){

            if(arrival[i] <= departure[j]){

                i++;

                count++;

            }else {

                j++;

                count--;

            }

            ans = Math.max(count,ans);

        }

        System.out.println("ans " + ans);

        return ans;


    }

}

public class minimumPlatform {
    public static void main(String[] args) {

        new MinimumPlatform().Platform(new int[]{900, 940, 950, 1100, 1500, 1800}, new int[]{910, 1200, 1120, 1130, 1900, 2000 });

    }
}
