package string;

public class integerToRoman {

    public static String intToRoman(int num) {

        if (num < 0 || num > 3999) {
            return "";
        }

        String[] roman = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

        int[] values = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};

        int index = 0;

        StringBuilder result = new StringBuilder();

        while (num > 0) {

            while (num >= values[index]) {          // why , while. Not if ?? assume case 2500

                num = num - values[index];

                result.append(roman[index]);

            }

            index++;

        }

        return result.toString();

    }

    public static void main(String[] args) {

        System.out.println(intToRoman(3052));

    }
}
