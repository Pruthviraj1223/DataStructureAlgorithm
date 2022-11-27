package heap;

import java.text.CollationElementIterator;
import java.util.*;

class sorting implements Comparator<Integer> {

    @Override
    public int compare(Integer o1, Integer o2) {

        return o2 - o1;

    }
}

public class comparatorPractice {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        list.add(2);
        list.add(1);
        list.add(4);
        list.add(3);

        //list.sort(new sorting());

        list.sort((a,b) -> b-a);

        List<int[]> list2 = new ArrayList<>();

        list2.add(new int[]{3,40});
        list2.add(new int[]{2,81});
        list2.add(new int[]{7,47});

        list2.sort((a,b) -> a[0]-b[0]);             // based on first param ,  a - b means ascending
        list2.sort((a,b) -> b[0]-a[0]);             // based on first param ,  b - a means descending
        list2.sort((a,b) -> a[1]-b[1]);             // based on second param


        System.out.println(Arrays.toString(list2.get(0)));
        System.out.println(Arrays.toString(list2.get(1)));
        System.out.println(Arrays.toString(list2.get(2)));
        System.out.println();

        Map<Integer, Integer> frequency = new HashMap<>();

        frequency.put(2,10);
        frequency.put(1,13);
        frequency.put(4,12);
        frequency.put(3,90);

        List<Map.Entry<Integer,Integer>> maps = new ArrayList<>(frequency.entrySet());

        maps.sort((a,b) -> a.getKey() - b.getKey());
        maps.sort((a,b) -> a.getValue() - b.getValue());

        System.out.println(maps);


    }
}
