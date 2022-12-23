package String;

public class closestString {

    public int[] shortestToChar(String s, char ch) {

        int n = s.length();

        int[] result = new int[n];

        int prev = Integer.MIN_VALUE / 2;           // for overflow condition

        // from left to right

        for (int index = 0; index < n; ++index) {

            if (s.charAt(index) == ch) {

                prev = index;

            }

            result[index] = index - prev;

        }

        prev = Integer.MAX_VALUE / 2;

        // from right to left

        for (int index = n - 1; index >= 0; --index) {

            if (s.charAt(index) == ch) {

                prev = index;

            }

            result[index] = Math.min(result[index], prev - index);

        }

        return result;
    }

    public static void main(String[] args) {

        // how much given character is closed to every character in string

        // https://www.geeksforgeeks.org/shortest-distance-to-every-other-character-from-given-character/

    }
}
