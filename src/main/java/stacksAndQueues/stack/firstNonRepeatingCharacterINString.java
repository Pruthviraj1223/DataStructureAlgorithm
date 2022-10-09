package stacksAndQueues.stack;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

class nonRpeating {
    public int firstUniqChar(String s) {

        int []cnt = new int[256];

        for(int index=0;index<s.length();index++){

            cnt[s.charAt(index)- 'a']++;

        }

        for(int index=0;index<s.length();index++){

            if(cnt[s.charAt(index) -'a'] == 1){

                return index;
            }
        }
        return -1;


    }
    public void uniqueCharacter(String s){

        HashMap<Character,Integer> count= new HashMap<>();

        for (int index = 0; index < s.length(); index++) {

            char ch = s.charAt(index);

            if(count.containsKey(ch)){

                count.put(ch,Integer.MAX_VALUE);

            }else {

                count.put(ch,index);

            }
        }


        var it = count.entrySet().iterator();


        int ans = Integer.MAX_VALUE;

        while (it.hasNext()){

            var item = it.next();

            ans = Math.min(ans,item.getValue());


        }



    }

    public void uniqueCharacterUsingQueue(String s){

        int n = s.length();

        int []cnt = new int[26];

        Queue<Character> queue = new LinkedList<>();

        for (int index = 0; index < n; index++) {

            char ch = s.charAt(index);

            queue.add(ch);

            cnt[ch -'a']++;

            while (!queue.isEmpty()){

                if(cnt[queue.peek()-'a']>1){

                    queue.remove();

                }else {

                    System.out.println(" " + queue.peek());
                    break;
                }
            }
        }

        if(queue.isEmpty()){
            System.out.println("-1");
        }

    }
}
public class firstNonRepeatingCharacterINString {
    public static void main(String[] args) {

        new nonRpeating().uniqueCharacterUsingQueue("geeksforggeks");

    }
}
