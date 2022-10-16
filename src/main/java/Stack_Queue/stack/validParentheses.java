package Stack_Queue.stack;

import java.util.Stack;

class Valid {
    public boolean isValid(String string) {

        java.util.Stack<Character> s = new Stack<>();

        for(char c: string.toCharArray()){

            if(c=='{'){

                s.push('}');

            }else if(c=='['){

                s.push(']');

            } else if(c=='('){

                s.push(')');

            } else if(s.isEmpty() || s.pop() != c){
                

                return false;

            }

        }


        return s.isEmpty();



    }

    public boolean isValid2(String ss) {

        Stack<Character> st = new Stack<>();

        for(char i:ss.toCharArray())  //iterate over each and every elements
        {
            if(i=='(' || i=='{' || i=='[') {
                st.push(i);
            }
            else
            {
                if(st.isEmpty()){

                    return false;   // special case when there is single character . else it will show exception

                }

                if((st.peek()=='(' && i==')') || (st.peek()=='{' && i=='}') || (st.peek()=='[' && i==']'))
                {
                    st.pop();
                }else {

                    st.push(i);

                }
            }
        }


        return st.isEmpty();



    }


    // below is c++ solution
    // approach is very good
    // optimized approach for isValid2 method



//    bool isValid(string s) {
//        stack<char> st;  //taking stack for keep tracking the order of the brackets..
//        for(auto i:s)  //iterate over each and every elements
//        {
//            if(i=='(' or i=='{' or i=='[') st.push(i);  //if current element of the string will be opening bracket then we will just simply push it into the stack
//            else  //if control comes to else part, it means that current element is a closing bracket, so check two conditions  current element matches with top of the stack and the stack must not be empty...
//            {
//                if(st.empty() or (st.top()=='(' and i!=')') or (st.top()=='{' and i!='}') or (st.top()=='[' and i!=']')) return false;
//                st.pop();  //if control reaches to that line, it means we have got the right pair of brackets, so just pop it.
//            }
//        }
//        return st.empty();  //at last, it may possible that we left something into the stack unpair so return checking stack is empty or not..
//    }

}

public class validParentheses {
    public static void main(String[] args) {

        // this solution is most optimized

        // watch GFG solution , which is more detailed
    }
}
