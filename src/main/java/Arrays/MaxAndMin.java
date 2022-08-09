package Arrays;

public class MaxAndMin {

    public static void main(String[] args) {

        int []arr= new int[]{3,54,2,78,11};

//        Arrays.sort(arr);         // you can sort the array like this
//
//        for(int a:arr){
//            System.out.println(a);
//        }

        int min = arr[0];
        int max = arr[0];

        for (int a: arr) {

            if(a>max){
                max = a;
            }
            if(a<min){
                min  = a;
            }

        }

        System.out.println("max - " + max + " min " + min);




    }
}
