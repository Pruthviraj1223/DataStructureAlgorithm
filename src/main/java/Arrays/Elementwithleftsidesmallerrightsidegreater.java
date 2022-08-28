package Arrays;

class Compute {
    public int findElement(int arr[], int n){

        int[] rightMin = new int[n];

        int[] leftMax = new int[n];

        for(int i = 0; i < n; i++){

            rightMin[i] = 10000000;

            leftMax[i] = 0;
        }

        leftMax[0] = arr[0];

        for(int i = 1; i < n; i++){

            leftMax[i] = Math.max(leftMax[i-1], arr[i]);

        }

        rightMin[n-1] = arr[n-1];

        for(int i = n-2; i >= 0; i--){

            rightMin[i] = Math.min(rightMin[i+1], arr[i]);

        }

        // imp part of question

        for(int i = 1; i < n-1; i++){

            if(leftMax[i-1] <= arr[i] && arr[i] <= rightMin[i+1]){

                return arr[i];
            }
        }

        return -1;
    }
}
public class Elementwithleftsidesmallerrightsidegreater {
    public static void main(String[] args) {

    }
}
