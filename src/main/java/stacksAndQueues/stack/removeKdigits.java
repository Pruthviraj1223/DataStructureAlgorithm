package stacksAndQueues.stack;

import java.util.Stack;

class remove{

    public String removeDigits(String num,int k){

        if(k==num.length()){
            return "0";
        }

        if(k==0){
            return num;

        }


        Stack<Character> stack = new Stack<>();

        for (int index = 0; index < num.length(); index++) {

            char current = num.charAt(index);

            while (!stack.isEmpty() && k>0 && stack.peek() > current){
                stack.pop();
                k--;
            }

            if(!stack.isEmpty() || current!='0'){
                stack.push(current);
            }
        }

        while (!stack.isEmpty() && k>0){
            stack.pop();
            k--;
        }


        if(stack.isEmpty()){
            return "0";
        }

        StringBuilder result = new StringBuilder();

        while (!stack.isEmpty()){

            result.append(stack.pop());
        }

        return result.reverse().toString();

    }


}


public class removeKdigits {
    public static void main(String[] args) {

    }
}
