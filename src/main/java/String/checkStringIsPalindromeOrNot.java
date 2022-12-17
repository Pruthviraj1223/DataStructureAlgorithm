package String;

public class checkStringIsPalindromeOrNot {
    public static boolean main(String[] args) {


        // solution 1

        String s = "A man, a plan, a canal: Panama";

        String actual = s.replaceAll("[^A-Za-z0-9]", "").toLowerCase();

        String rev = new StringBuilder(actual).reverse().toString();

        var ans = rev.equals(actual);

        // solution 2

        int i = 0, j = s.length() - 1;

        char ch1, ch2;

        while (i <= j) {

            ch1 = s.charAt(i);
            ch2 = s.charAt(j);

            if (!Character.isLetterOrDigit(ch1)) {

                i++;

            } else if (!Character.isLetterOrDigit(ch2)) {

                j--;

            } else {

                if (Character.toLowerCase(ch1) != Character.toLowerCase(ch2)) {
                    return false;
                }

                i++;
                j--;

            }
        }

        return true;

        // you can use stack approach as well


    }
}
