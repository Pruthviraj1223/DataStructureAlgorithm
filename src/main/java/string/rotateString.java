package string;

public class rotateString {

    boolean rotate(String a,String b){

        return a.length()==b.length() && (a+a).contains(b);

        // O(N^2)

        // GFG has its own approach , queue approach is good

        // kmp will come in picture

    }


    public static void main(String[] args) {

    }
}
