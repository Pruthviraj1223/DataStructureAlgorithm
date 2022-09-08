package Misc;

class Solution {
    public int mySqrt(int x) {

        if(x==0 || x==1){

            return x;

        }

        long start =1;

        long end = x;

        long ans=0;

        while(start<=end){

            long mid = (start + end)/2;

            long square = mid*mid;

            if(square==x){

                return (int)mid;

            }else if (square < x){

                start = mid + 1;

                ans = mid;

            }else {

                end = mid - 1;

            }

        }

        return (int)ans;

    }
}

public class squareRoot {
    public static void main(String[] args) {

    }
}
