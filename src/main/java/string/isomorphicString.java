package string;

import java.util.HashMap;

public class isomorphicString {

    public boolean isIsomorphic(String s1, String s2) {

        if(s1.length()!=s2.length()){
            return false;
        }

        HashMap<Character,Character> mapper = new HashMap<>();

        for(int index=0;index<s1.length();index++){

            if(mapper.containsKey(s1.charAt(index))){

                if(s2.charAt(index)!= mapper.get(s1.charAt(index))){

                    return false;

                }

            } else if (!mapper.containsValue(s2.charAt(index))){

                mapper.put(s1.charAt(index),s2.charAt(index));


            } else {

                return false;

            }

        }

        return true;

    }

    public static void main(String[] args) {

    }
}
