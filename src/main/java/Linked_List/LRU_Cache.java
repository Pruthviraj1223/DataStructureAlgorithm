package Linked_List;

import java.util.HashMap;

class LRUCache {

    static class Node {
        int key;
        int val;
        Node prev;
        Node next;


        Node(int key, int val) {
            this.key = key;
            this.val = val;

        }

    }

    Node head, tail;

    void addNode(Node node) {

        node.prev = head;
        node.next = head.next;

        head.next.prev = node;
        head.next = node;

    }

    void removeNode(Node node) {

        Node prev = node.prev;
        Node next = node.next;

        prev.next = next;
        next.prev = prev;


    }

    Node removeTail() {

        Node node = tail.prev;

        removeNode(node);

        return node;


    }

    HashMap<Integer, Node> cache = new HashMap<>();

    int capacity;

    public LRUCache(int cap) {

        head = new Node(-1, -1);
        head.prev = null;

        tail = new Node(-2, -2);
        tail.next = null;

        head.next = tail;
        tail.prev = head;

        capacity = cap;


    }

    public int get(int key) {

        Node node = cache.get(key);

        if (node != null) {

            removeNode(node);

            addNode(node);

            return node.val;

        }

        return -1;

    }

    public void put(int key, int value) {

        Node node = cache.get(key);

        if (node == null) {

            Node temp = new Node(key, value);

            cache.put(key, temp);

            addNode(temp);

            if (cache.size() > capacity) {

                Node n1 = removeTail();

                cache.remove(n1.key);

            }

        } else {

            node.val = value;

            cache.put(key, node);

            removeNode(node);

            addNode(node);

        }

    }
}

public class LRU_Cache {
    public static void main(String[] args) {

        LRUCache lruCache = new LRUCache(5);


    }
}
