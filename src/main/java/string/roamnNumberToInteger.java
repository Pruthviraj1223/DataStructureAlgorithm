package string;

import java.util.HashMap;

public class roamnNumberToInteger {

    int romanTOIntHashmap(String s) {

        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        int sum = 0;

        int index;

        for (index = 0; index < s.length() - 1; index++) {

            if (map.get(s.charAt(index)) < map.get(s.charAt(index + 1))) {

                sum = sum - map.get(s.charAt(index));


            } else {

                sum += map.get(s.charAt(index));

            }

        }

        return sum + map.get(s.charAt(index));

    }

    public int romanToIntNumArray(String s) {

        int[] nums = new int[s.length()];

        for (int i = 0; i < s.length(); i++) {

            switch (s.charAt(i)) {
                case 'M' -> nums[i] = 1000;
                case 'D' -> nums[i] = 500;
                case 'C' -> nums[i] = 100;
                case 'L' -> nums[i] = 50;
                case 'X' -> nums[i] = 10;
                case 'V' -> nums[i] = 5;
                case 'I' -> nums[i] = 1;
            }
        }
        int sum = 0;

        for (int i = 0; i < nums.length - 1; i++) {

            if (nums[i] < nums[i + 1])

                sum -= nums[i];

            else

                sum += nums[i];
        }

        return sum + nums[nums.length - 1];

    }

    public static void main(String[] args) {

        // https://leetcode.com/problems/roman-to-integer/
        // LVIII
        // MCMXCIV

    }
}
