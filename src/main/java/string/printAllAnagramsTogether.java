package string;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class printAllAnagramsTogether {

    static List<List<String>> print(String[] words) {

        HashMap<String, List<String>> anagrams = new HashMap<>();

        for (int index = 0; index < words.length; index++) {

            char[] ch = words[index].toCharArray();

            Arrays.sort(ch);

            String letter = new String(ch);

            if (anagrams.get(letter) == null) {

                List<String> list = new ArrayList<>();

                anagrams.put(letter, list);

            }

            anagrams.get(letter).add(words[index]);

        }

        List<List<String>> result = new ArrayList<>(anagrams.values());

        return result;

    }

    public static void main(String[] args) {

        print(new String[]{"act", "god", "cat", "dog", "tac"});

        // another approach is about sorting , you 'should' watch on GFG.

        // group anagrams on leetcode is same

    }
}
