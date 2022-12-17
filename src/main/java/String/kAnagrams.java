package String;

import java.util.Arrays;

public class kAnagrams {

    public static boolean checkKAnagrams(String str1, String str2, int k) {

        // sort the character and the check individual character

        char[] arr1 = str1.toCharArray();

        char[] arr2 = str2.toCharArray();

        Arrays.sort(arr1);

        Arrays.sort(arr2);

        int count = 0;

        for (int i = 0; i < str1.length(); i++) {

            if (arr1[i] != arr2[i]) {                   // this valid because we are sorting the array and then we are checking characters

                count++;

            }
        }

        return count < k;

        // O(nlogn)

    }

    static final int MAX_CHAR = 26;

    static boolean arekAnagrams(String str1, String str2, int k) {

        // make count1 and count2 and check counts for it

        int n = str1.length();

        if (str2.length() != n)
            return false;

        int[] count1 = new int[MAX_CHAR];

        int[] count2 = new int[MAX_CHAR];

        int count = 0;

        for (int index = 0; index < n; index++) {

            count1[str1.charAt(index) - 'a']++;

        }

        for (int index = 0; index < n; index++) {

            count2[str2.charAt(index) - 'a']++;

        }

        for (int index = 0; index < MAX_CHAR; index++) {

            if (count1[index] > count2[index]) {               // you can't put directly count1[i]!=count2[i] and then do count++;   Assume this case -->   // s1 : abcddd , s2 : abcpqz

                count = count + (count1[index] - count2[index]);

            }
        }

        return (count <= k);


        // O(n)
    }

    static boolean areKAnagrams(String str1, String str2, int k) {

        // most optimized among the all
        // make count1 and reduce by traversing on s2 on '> 0' condition else increase the count

        int n = str1.length();

        if (str2.length() != n)
            return false;

        int[] count1 = new int[MAX_CHAR];

        for (int index = 0; index < n; index++) {

            count1[str1.charAt(index) - 'a']++;

        }

        int count = 0;

        for (int index = 0; index < n; index++) {

            if (count1[str2.charAt(index) - 'a'] > 0) {

                count1[str2.charAt(index) - 'a']--;

            } else {
                count++;
            }
        }

        return (count <= k);
    }

    public static void main(String[] args) {

        // https://www.geeksforgeeks.org/check-two-strings-k-anagrams-not/


    }
}

