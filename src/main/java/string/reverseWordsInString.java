package string;

import java.util.Arrays;
import java.util.Collections;

public class reverseWordsInString {
    public static void main(String[] args) {

        // split , reverse , join

        String s = "a good   example";

        String[] arr = s.trim().split(" +");

        int i = 0, j = arr.length - 1;

        while (i < j) {

            String temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;

            i++;
            j--;

        }
        s = "";

        System.out.println(String.join(" ", arr));      // answer


        // watch out 2 pointer solution in leetcode without using trim,concate function


        // 3rd solution which use built in function very much

        String[] words = s.trim().split(" +");

        Collections.reverse(Arrays.asList(words));

        System.out.println(String.join(" ", words));        // answer


    }
}
