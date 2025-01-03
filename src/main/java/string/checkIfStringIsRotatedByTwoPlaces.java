package string;

public class checkIfStringIsRotatedByTwoPlaces {

    static boolean check(String s1,String s2,int k){

        int len = s1.length();

        String anti = "" + s1.substring(len-k,len) + s1.substring(0,len-k);

        String clock = "" + s1.substring(k) + s1.substring(0,k);

        return anti.equalsIgnoreCase(s2) || clock.equalsIgnoreCase(s2);

    }

    static boolean isRotated(String str1, String str2,int k)
    {
        int len1 = str1.length();

        int len2 = str2.length();

        if (len1 != len2)
            return false;

        boolean clockwise = true;

        boolean anticlockwise = true;

        for (int index = 0; index < len1; index++) {

            if (str1.charAt(index)!= str2.charAt((index + k) % len1)) {

                clockwise = false;

                break;
            }
        }

        for (int index = 0; index < len2; index++) {

            if (str1.charAt((index + k) % len1)!= str2.charAt(index)) {

                anticlockwise = false;

                break;

            }
        }
        return (clockwise || anticlockwise);
    }


    public static void main(String[] args) {

        // GFG : https://www.geeksforgeeks.org/check-string-can-obtained-rotating-another-string-2-places/

        // amazon
        // azonam

    }
}
