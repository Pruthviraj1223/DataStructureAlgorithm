package string;

public class integerToRoman {

    public static String intToRoman(int num) {

        if (num < 0 || num > 3999) {
            return "";
        }

        String[] roman = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        int[] values = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};

        int index = 0;

        StringBuilder sb = new StringBuilder();

        while (num > 0) {

            while (num >= values[index]) {          // why , while. Not if ?? assume case 2500

                num = num - values[index];
                sb.append(roman[index]);

            }

            index++;

        }

        return sb.toString();

    }

    public static void main(String[] args) {

        intToRoman(-1);


    }
}
