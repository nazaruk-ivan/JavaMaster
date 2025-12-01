package Examples.Data_Collections.Deque;


import java.util.*;

public class DequeMain {
    public static void main(String[] args) {
        //deque is basically a structure from which you can delete items from front and from back.
        Deque<String> deque = new ArrayDeque<>();

        deque.offerLast("Element #1");
        deque.offerFirst("Element #2");

        String element1 = deque.pollFirst();
        String element2 = deque.pollFirst();


        //Stack mode
        deque.offerFirst("Element1");
        deque.offerFirst("Element 2");

        element2 = deque.pollFirst();
        element1 = deque.pollFirst();


        System.out.println(element1+ " "  + element2);
    }
}

