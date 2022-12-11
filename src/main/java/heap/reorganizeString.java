package heap;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class reorganizeString {
    public String reorganizeString(String s) {

        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> b[1] - a[1]);

        Map<Character, Integer> freq = new HashMap<>();

        for (char c : s.toCharArray()) {

            int count = freq.getOrDefault(c, 0) + 1;

            if (count > (s.length() + 1) / 2) return "";

            freq.put(c, count);
        }

        for (char ch : freq.keySet()) {

            pq.add(new int[]{ch, freq.get(ch)});

        }

        StringBuilder sb = new StringBuilder();

        while (!pq.isEmpty()) {

            var first = pq.poll();

            if (sb.length() == 0 || first[0] != sb.charAt(sb.length() - 1)) {

                sb.append((char) first[0]);
                first[1]--;

                if (first[1] > 0) {

                    pq.add(first);

                }

            } else {

                var second = pq.poll();

                sb.append((char) second[0]);

                second[1]--;

                if (second[1] > 0) {

                    pq.add(second);

                }

                pq.add(first);

            }

        }

        return sb.toString();

    }

    public static void main(String[] args) {

    }

}
