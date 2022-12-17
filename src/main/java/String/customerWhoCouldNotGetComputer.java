package String;

public class customerWhoCouldNotGetComputer {

    static int runCustomerSimulation(int n, char[] seq) {

        char[] seen = new char[26];

        int res = 0;

        int occupied = 0; // To keep track of occupied computers

        for (int i = 0; i < seq.length; i++) {

            int ind = seq[i] - 'A';

            if (seen[ind] == 0) {       // 0 means not in the cafe

                seen[ind] = 1;          // 1 means in the cafe , but not using computer

                if (occupied < n) {

                    occupied++;

                    seen[ind] = 2;      // 2 means using the computer

                } else {

                    res++;

                }

            } else {

                if (seen[ind] == 2) {
                    occupied--;
                }

                seen[ind] = 0;

            }
        }

        return res;

    }

    public static void main(String[] args) {

    }
}
