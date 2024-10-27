package linkedList;

import java.util.HashMap;

class LFUCache {

    int capacity;
    int minFreq;
    int currSize;

    HashMap<Integer, Node> cache = new HashMap<>();

    HashMap<Integer, DLL> freqMap = new HashMap<>();


    static class Node {
        int key;
        int val;
        int freq;
        Node prev;
        Node next;

        Node(int key, int val) {
            this.key = key;
            this.val = val;
            this.freq = 1;
        }

    }

    static class DLL {

        // DLL is list , will be used in freqMap
        // every freq (key) will have new List , that's why we have to create DLL class and Constructor
        // addNode and removeNode method will modify the list

        Node head, tail;
        int size;

        DLL() {

            this.head = new Node(-1, -1);
            this.head.prev = null;

            this.tail = new Node(-11, -11);
            this.tail.next = null;

            this.head.next = tail;
            this.tail.prev = head;
            this.size = 0;

        }

        void addNode(Node node) {


            node.next = this.head.next;
            this.head.next = node;
            node.prev = this.head;
            node.next.prev = node;
            this.size++;

        }


        void removeNode(Node node) {

            node.prev.next = node.next;
            node.next.prev = node.prev;
            this.size--;
        }


    }


    // most IMP function

    // it will remove node from particular list
    // then it will check that all nodes from that list is evicted then update minFreq
    // get the list
    // then add node to that newList and put again into freqMap

    void updateList(Node curr) {

        cache.remove(curr.key);

        freqMap.get(curr.freq).removeNode(curr);

        if (curr.freq == this.minFreq && freqMap.get(curr.freq).size == 0) {

            this.minFreq++;

        }

        curr.freq++;

        DLL updatedList = freqMap.getOrDefault(curr.freq, new DLL());

        updatedList.addNode(curr);

        freqMap.put(curr.freq, updatedList);

        cache.put(curr.key, curr);

    }

    public LFUCache(int capacity) {

        this.currSize = 0;
        this.capacity = capacity;
        this.minFreq = 1;

    }

    public int get(int key) {

        Node curr = cache.get(key);

        if (curr != null) {

            int val = curr.val;

            this.updateList(curr);

            return val;

        }

        return -1;

    }

    public void put(int key, int value) {

        if (this.capacity == 0) {
            return;
        }

        Node curr = cache.get(key);

        if (curr == null) {

            Node temp = new Node(key, value);

            this.currSize++;

            if (this.currSize > this.capacity) {

                DLL currList = freqMap.get(this.minFreq);

                cache.remove(currList.tail.prev.key);

                currList.removeNode(currList.tail.prev);        // here will remove node as LRU policy

                this.currSize--;

            }

            this.minFreq = 1;

            DLL currList = freqMap.getOrDefault(temp.freq, new DLL());

            currList.addNode(temp);

            freqMap.put(1, currList);       // new  node have 1 freq always

            cache.put(temp.key, temp);

        } else {

            curr.val = value;

            this.updateList(curr);

        }

    }
}

public class LFU_Cache {
    public static void main(String[] args) {

    }
}
