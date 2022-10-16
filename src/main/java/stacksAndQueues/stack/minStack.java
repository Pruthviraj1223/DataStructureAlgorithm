package stacksAndQueues.stack;

import java.util.Stack;

class MinStack {

    java.util.Stack<Integer> s = new java.util.Stack<>();
    java.util.Stack<Integer> ss = new java.util.Stack<>();

    public void push(int val) {

        s.push(val);

        if(ss.size()==0 || ss.peek()>=val){         // >= important

            ss.push(val);

        }

    }

    public void pop() {

        int x = s.pop();

        if(x==ss.peek()){

            ss.pop();

        }

    }

    public int top() {

        return s.peek();
    }

    public int getMin() {

        if(ss.isEmpty()){
            return -1;
        }

        return ss.peek();

    }
}


class MinStack2 {

    java.util.Stack<Integer> s = new Stack<>();

    int minEle;

    public MinStack2() {


    }

    public void push(int val) {

        if(s.isEmpty()){

            s.push(val);

        }else if(val < minEle){


            s.push((2*val) - minEle);

            minEle = val;


        }else{


            s.push(val);

        }


    }

    public void pop() {

        if(!s.isEmpty()){

            if(s.peek() > minEle){

                s.pop();

            }else{

                minEle = (2*minEle) - s.peek();

                s.pop();

            }
        }
    }

    public int top() {


        if(s.peek() > minEle){

            return s.peek();

        }else{

            return minEle;

        }


    }

    public int getMin() {


        System.out.println(minEle);


        if(s.size()==0){

            return -100;

        }else{

            return minEle;

        }



    }
}

public class minStack {
    public static void main(String[] args) {

        // 1st with two stack -- this simple
        // 2nd with one stack -- here you need to remember the formula (2X-minElement)

        MinStack2 minStack2 = new MinStack2();

        minStack2.push(-2);
        minStack2.push(0);
        minStack2.push(-3);
        System.out.println("Min element " + new MinStack2().getMin());
        minStack2.pop();
        minStack2.top();

        String s= "1";

        s.toCharArray();


    }
}
