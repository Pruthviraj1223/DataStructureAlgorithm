package string;

import java.util.Stack;

public class removeDuplicateLetters {

    String remove(String s){
        if(s.isEmpty()){

            return "";

        }


        int []lastIndex = new int[26];


        for(int index=0;index<s.length();index++){

            lastIndex[s.charAt(index)-'a'] = index;

        }


        Stack<Integer> st = new Stack<>();

        boolean []seen = new boolean[26];

        for(int index=0;index<s.length();index++){


            int curr = s.charAt(index) - 'a';

            if(seen[curr]) {
                continue;
            }

            while(!st.isEmpty() && curr < st.peek() && index < lastIndex[st.peek()]){

                seen[st.pop()] = false;


            }


            st.push(curr);

            seen[curr] = true;

        }

        StringBuilder res = new StringBuilder();

        while(!st.isEmpty()){


            char ch = (char) (st.pop() + 'a');


            res.append(ch);


        }

        return res.reverse().toString();

    }

    public static void main(String[] args) {


    }
}
