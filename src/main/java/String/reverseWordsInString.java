package String;

import java.util.Arrays;
import java.util.Collections;

public class reverseWordsInString {
    public static void main(String[] args) {

        // split , reverse , join

        String string = "a good   example";

        String[] arr = string.trim().split(" +");

        int start = 0, end = arr.length - 1;

        while (start < end) {

            String temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;

        }

        string = "";

        System.out.println(String.join(" ", arr));      // answer

        // watch out 2 pointer solution in leetcode without using trim,concat function

        // Nice Solution. MUST watch.

        // https://leetcode.com/problems/reverse-words-in-a-string/solutions/47720/clean-java-two-pointers-solution-no-trim-no-split-no-stringbuilder/

        // 3rd solution which use built-in function very much

        String[] words = string.trim().split(" +");

        Collections.reverse(Arrays.asList(words));

        System.out.println(String.join(" ", words));        // answer

        // https://leetcode.com/problems/reverse-words-in-a-string/


    }
}
