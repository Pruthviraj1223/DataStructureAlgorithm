package stacksAndQueues.stack;

import java.util.Stack;

class longestParentheses{
    public int longestValidParenthesesStack(String s) {

        if(s.isEmpty()){

            return 0;

        }


        java.util.Stack<Integer> stack = new Stack<>();


        stack.push(-1);

        int maxLength=0;


        for(int index=0;index<s.length();index++){



            if(s.charAt(index)=='('){

                stack.push(index);
            }

            else{

                // understand conditions

                if(!stack.isEmpty()){

                    stack.pop();

                }

                if(!stack.isEmpty()){

                    maxLength = Math.max(maxLength,index-stack.peek());

                }else{

                    stack.push(index);

                }

            }

        }

        return maxLength;


    }

    public int longestValidParenthesesTwoPointer(String s) {

        if(s.isEmpty()){

            return 0;

        }


        int left =0;
        int right=0;
        int maxLength=0;


        for(int index=0;index<s.length();index++){

            if(s.charAt(index)=='('){

                left++;

            }else{

                right++;

            }

            // ()())((((()))))

            if(left==right){

                maxLength = Math.max(maxLength,2 * left);


            }else if(right>left){       // understand this conditions

                left = right =0;

            }

        }

        left = right =0;

        // why we need to traverse both side

        // ex :  ((()()()
        // in this case above loop will not get real answer


        for(int index=s.length()-1;index>=0;index--){

            if(s.charAt(index)=='('){

                left++;

            }else{

                right++;

            }

            if(left==right){

                maxLength = Math.max(maxLength,2 * left);

            }else if(right<left){

                left = right =0;

            }
        }

        return maxLength;

    }
}

public class longestValidParentheses {
    public static void main(String[] args) {

        new longestParentheses().longestValidParenthesesTwoPointer("()()((((()))))");

    }
}
