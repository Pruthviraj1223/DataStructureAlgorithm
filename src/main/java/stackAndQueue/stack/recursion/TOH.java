package stackAndQueue.stack.recursion;

class Tower{

    public void towerOFHANOI(int n,char from,char to,char aux){

        if(n==0){
            return;
        }

        towerOFHANOI(n-1,from,aux,to);

        System.out.println("move "+ n + " from " + from + " : " +  " to "+ to);

        towerOFHANOI(n-1,aux,to,from);



    }

}

public class TOH {
    public static void main(String[] args) {

        int n = 3;

        // AS OF NOW JUST UNDERSTAND THE CONCEPT IN BRIEF

        new Tower().towerOFHANOI(n,'A','B','C');

    }
}
