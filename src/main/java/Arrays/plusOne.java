package Arrays;

class plus {
    public int[] plusOne(int[] digits) {


        int n = digits.length;



        if(n == 0){

            return digits;

        }

        for(int index=n-1; index>=0; index--) {

            if(digits[index] < 9) {

                digits[index]++;

                return digits;

            }

            digits[index] = 0;
        }

        int[] newNumber = new int [n+1];

        newNumber[0] = 1;

        return newNumber;

    }
}

public class plusOne {
    public static void main(String[] args) {

    }
}
