package arrays;

import java.util.Arrays;

class MinimumPlatform {

    public int Platform(int[] arrival, int[] departure) {

        Arrays.sort(arrival);
        Arrays.sort(departure);

        int i = 0, j = 0;

        int n1 = arrival.length;

        int n2 = departure.length;

        int platform = 0;

        int ans = 0;

        // simulation is happening with platform variable

        while (i < n1 && j < n2) {

            if (arrival[i] <= departure[j]) {           // when arrival is less then it means we need platform

                i++;

                platform++;

            } else {

                j++;

                platform--;

            }

            ans = Math.max(platform, ans);

        }

        System.out.println("ans " + ans);

        return ans;


    }

}

public class minimumPlatform {
    public static void main(String[] args) {

        new MinimumPlatform().Platform(new int[]{900, 940, 950, 1100, 1500, 1800}, new int[]{910, 1200, 1120, 1130, 1900, 2000});

        //https://www.geeksforgeeks.org/minimum-number-platforms-required-railwaybus-station/

    }
}
