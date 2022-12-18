package String;

public class customerWhoCouldNotGetComputer {

    static int runCustomerSimulation(int n, char[] seq) {

        // ex : ABBAJJKZKZ              answer : 0
        // ex : GACCBDDBAGEE            answer : not 0

        char[] seen = new char[26];

        int unsatisfied = 0;

        int occupied = 0; // To keep track of occupied computers

        // Note : Here we have used 0 1 2 code based on our need.

        for (int index = 0; index < seq.length; index++) {

            int ind = seq[index] - 'A';

            if (seen[ind] == 0) {       // 0 means not in the cafe

                seen[ind] = 1;          // 1 means in the cafe , but not using computer

                if (occupied < n) {     // two possibility : if there are enough computer then customer satisfied else unsatisfied

                    occupied++;

                    seen[ind] = 2;      // 2 means using the computer

                } else {

                    unsatisfied++;           // it means customer arrived to the shop , but didn't get the computer

                }

            } else {

                if (seen[ind] == 2) {

                    occupied--;

                }

                seen[ind] = 0;
            }
        }

        return unsatisfied;

    }

    public static void main(String[] args) {

        //https://www.geeksforgeeks.org/function-to-find-number-of-customers-who-could-not-get-a-computer/

        // nice thinking , not specific to string but a god one

        // good example of simulation

    }
}
