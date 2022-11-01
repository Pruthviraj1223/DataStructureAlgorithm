package string;

import java.util.Arrays;

public class kAnagrams {

    public static boolean checkKAnagrams(String str1, String str2, int k) {

        char[] arr1 = str1.toCharArray();

        char[] arr2 = str2.toCharArray();

        Arrays.sort(arr1);

        Arrays.sort(arr2);

        int count = 0;

        for (int i = 0; i < str1.length(); i++) {

            if (arr1[i] != arr2[i]) {

                count++;

            }
        }

        return count < 2;

    }

    static final int MAX_CHAR = 26;

    static boolean arekAnagrams(String str1, String str2, int k) {

        int n = str1.length();

        if (str2.length() != n)
            return false;

        int[] count1 = new int[MAX_CHAR];

        int[] count2 = new int[MAX_CHAR];

        int count = 0;

        for (int i = 0; i < n; i++) {

            count1[str1.charAt(i) - 'a']++;

        }

        for (int i = 0; i < n; i++) {

            count2[str2.charAt(i) - 'a']++;

        }

        for (int i = 0; i < MAX_CHAR; i++) {

            if (count1[i] > count2[i]) {

                count = count + Math.abs(count1[i] - count2[i]);

            }
        }

        return (count <= k);
    }

    static boolean areKAnagrams(String str1, String str2, int k)
    {
        int n = str1.length();

        if (str2.length() != n)
            return false;

        int[] counts = new int[MAX_CHAR];

        for (int i = 0; i < n ; i++) {
            counts[str1.charAt(i) - 'a']++;
        }

        int count = 0;

        for (int i = 0; i < n ; i++)
        {

            if (counts[str2.charAt(i) - 'a'] > 0) {

                counts[str2.charAt(i) - 'a']--;

            }
            else
                count++;

            if (count > k)
                return false;
        }

        return true;
    }

    public static void main(String[] args) {


    }
}

