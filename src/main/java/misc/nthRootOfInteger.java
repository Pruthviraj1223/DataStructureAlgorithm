package misc;

public class nthRootOfInteger {


    static double multiply(int n, double mid){

        double ans = 1;

        for (int index = 0; index < n; index++) {

            ans = ans * mid;

        }

        return ans;

    }



    public static void main(String[] args) {

        int number = 216;
        int n = 3;


        double difference = 1e-7;

        double low = 1;

        double high = number;

        while ((high-low) > difference){

            double mid = (low+high) / 2;

            if(multiply(n,mid) > number){

                high = mid;

            }else {

                low = mid;

            }

        }

        System.out.printf("ans " + high);

    }
}
