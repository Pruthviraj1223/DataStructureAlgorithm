package string;

import java.util.HashMap;

public class checkStringIsPalindromeOrNot {
    public static boolean main(String[] args) {

        // solution 1

        String s =  "A man, a plan, a canal: Panama";

        String actual = s.replaceAll("[^A-Za-z0-9]","").toLowerCase();

        String rev = new StringBuilder(actual).reverse().toString();

        var ans = rev.equals(actual);

        // solution 2

        int i=0,j=s.length()-1;
        char a,b;

        while(i<=j){

            a = s.charAt(i);
            b = s.charAt(j);

            if(!Character.isLetterOrDigit(a)){
                i++;
            }else if(!Character.isLetterOrDigit(b)){
                j--;
            }else{


                if(Character.toLowerCase(a)!=Character.toLowerCase(b)){
                    return false;
                }

                i++;j--;

            }
        }

        return true;




    }
}
