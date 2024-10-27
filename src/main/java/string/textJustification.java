package string;

import java.util.ArrayList;
import java.util.List;

public class textJustification {

    static int findRight(int left, String[] words, int maxWidth) {

        // check length < maxWidth and increase right
        // sum + 1 because for space between two words

        int right = left;

        int sum = words[right].length();

        right++;

        while (right < words.length && (sum + 1 + words[right].length() <= maxWidth)) {

            sum += 1 + words[right].length();

            right++;

        }

        return right - 1;

    }

    static String justify(int left, int right, String[] words, int maxWidth) {

        if (left - right == 0) {        // if left and right same then just pad result and return it.

            return padResult(words[left], maxWidth);
        }

        boolean isLastLine = (right == words.length - 1);

        int totalWord = right - left;               // how many word between left and right. It will be one less.

        int totalSpace = maxWidth - wordsLength(left, right, words);      // how many spaces are left

        String space = isLastLine ? " " : blankString(totalSpace / totalWord);      // evenly space that we need to append after every word

        int remainder = isLastLine ? 0 : (totalSpace % totalWord);            // for left justification

        StringBuilder result = new StringBuilder();

        for (int index = left; index <= right; index++) {

                 result.append(words[index])                           // word
                    .append(space)                                  // evenly space
                    .append(remainder-- > 0 ? " " : "");            // left justification. else move ahead.

        }

        return padResult(result.toString().trim(), maxWidth);

    }

    // it will return length between left and right
    static int wordsLength(int left, int right, String[] words) {

        int len = 0;

        for (int index = left; index <= right; index++) {

            len += words[index].length();

        }

        return len;

    }

    // it will return string after appending empty string
    static String padResult(String s, int maxWidth) {

        int len = s.length();

        return s + (blankString(maxWidth - len));

    }

    // return empty string of given length
    // remember to replace '\0' character
    static String blankString(int width) {

        return new String(new char[width]).replace('\0', ' ');

    }

    public static List<String> fullJustify(String[] words, int maxWidth) {

        int left = 0;

        List<String> result = new ArrayList<>();

        // first , find right
        // second, justify using left and right and make justified line with all spaces.
        // add it into result
        // move ahead left

        while (left < words.length) {

            int right = findRight(left, words, maxWidth);

            result.add(justify(left, right, words, maxWidth));

            left = right + 1;

        }

        return result;

    }

    public static void main(String[] args) {

        var words = new String[]{"This", "is", "an", "example", "of", "text", "justification."};

        fullJustify(words,16);

        // https://leetcode.com/problems/text-justification/description/

    }
}
