package string;

import java.util.Arrays;
import java.util.Objects;

public class longestCommonPrefix {

    static String longestPrefixSorting(String[] arr) {

        Arrays.sort(arr);

//        int minLen = Math.min(arr[0].length(), arr[arr.length - 1].length());

        int minLen = arr[0].length();

        int i = 0;

        // here we sort the array by alphabetically
        // so that's why we are checking to the last element
        // because if it's match the last element upto i length
        // then we found our substring or longest prefix
        // ex : gee, gee, gee, gee, gez Result : ge

        while (i < minLen && arr[0].charAt(i) == arr[arr.length - 1].charAt(i)) {
            i++;
        }

        return arr[0].substring(0, i);
    }

    static String commonUtil(String s1, String s2) {

        if(s1 == null || s2 == null){
            return "";
        }

        int n1 = s1.length();
        int n2 = s2.length();

        StringBuilder result = new StringBuilder();

        int i, j;

        for (i = 0, j = 0; i < n1 && j < n2; i++, j++) {

            if (s1.charAt(i) != s2.charAt(j)) {
                return result.toString();
            }

            result.append(s1.charAt(i));

        }

        return result.toString();

    }

    static String longestPrefixWordByWord(String[] arr) {

        // w1, w2, w3 , w4, w5
        // w1 + w2 = prefix1
        // prefix1  + w3 = prefix2
        // prefix2 + w4 = prefix3
        // prefix3 + w5 = longest prefix (answer)

        String longestPrefix = arr[0];

        for (int index = 1; index < arr.length; index++) {

            longestPrefix = commonUtil(longestPrefix, arr[index]);

        }

        return longestPrefix;

    }

    static String longestPrefixMergeSort(String[] arr, int low, int high) {

        // exact like merge sort
        // instead of merging arr1 and arr2 into main array
        // we are using common util

        if (Objects.equals(arr[low], arr[high])) {
            return arr[low];
        }

        if(low < high){

            int mid = low + (high-low)/2;

            String s1 = longestPrefixMergeSort(arr,low,mid);

            String s2 = longestPrefixMergeSort(arr,mid+1,high);

            return commonUtil(s1,s2);

        }

        return null;
    }

    static int findMinLength(String[] arr, int n)
    {
        int min = arr[0].length();

        for (int i = 1; i < n; i++)
        {
            if (arr[i].length() < min)
            {
                min = arr[i].length();
            }
        }

        return (min);
    }


    static String longestPrefixCharByChar(String[] arr, int n)
    {
        int minLen = findMinLength(arr, n);

        StringBuilder result = new StringBuilder();

        char current;

        for (int index = 0; index < minLen; index++)
        {
            current = arr[0].charAt(index);

            for (int j = 1; j < n; j++)
            {
                if (arr[j].charAt(index) != current)
                {
                    return result.toString();
                }
            }

            result.append(current);
        }

        return (result.toString());
    }


    public static void main(String[] args) {

        String[] arr = {"geeksfor", "gee", "gecks", "geeksforgeeks"};

        String prefix = longestPrefixSorting(arr);

        System.out.println(prefix);

        prefix = longestPrefixWordByWord(arr);

        System.out.println(prefix);

        prefix = longestPrefixMergeSort(arr,0,arr.length-1);

        System.out.println(prefix);

        prefix = longestPrefixCharByChar(arr,arr.length);

        System.out.println(prefix);

    }
}
