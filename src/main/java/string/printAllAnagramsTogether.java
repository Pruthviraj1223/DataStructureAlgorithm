package string;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class printAllAnagramsTogether {

    static void print(String []words){

        HashMap<String, List<String>> anagrams = new HashMap<>();

        for (int index = 0; index < words.length; index++) {

            char[] ch = words[index].toCharArray();

            Arrays.sort(ch);

            String letter = new String(ch);

            if(anagrams.get(letter)==null){

                List<String> list = new ArrayList<>();

                anagrams.put(letter,list);

            }

            anagrams.get(letter).add(words[index]);

        }

        for (var key:anagrams.keySet()){

            var values = anagrams.get(key);

            if(values.size()>1){

                System.out.println(values);

            }

        }

    }

    public static void main(String[] args) {

        print(new String[]{"act","god","cat","dog","tac"});

        // another approach is about sorting , you 'should' watch on GFG.

    }
}
