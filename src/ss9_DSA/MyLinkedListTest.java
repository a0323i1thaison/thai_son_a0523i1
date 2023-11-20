package ss9_DSA;

import java.util.LinkedList;

public class MyLinkedListTest {
    public static void main(String[] args) {
        MyLinkedList<Integer> integerMyLinkList = new MyLinkedList<>();

        LinkedList test = new LinkedList();
        integerMyLinkList.addFirst(1);
        integerMyLinkList.add(1, 2);
        integerMyLinkList.add(2, 3);
        integerMyLinkList.add(3, 4);
        integerMyLinkList.addLast(5);

        System.out.println("Display linked list: ");
        for (int i = 0; i < integerMyLinkList.numNodes; i++) {
            System.out.println("Node " + (i + 1) + ": " + integerMyLinkList.get(i));
        }
    }
}
