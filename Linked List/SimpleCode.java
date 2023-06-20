import java.util.*;

class SimpleCode {
    public static class Node {
        int data;
        Node next;

        Node(int x) {
            data = x;
            next = null;
        }
    }

    public static void main(String[] args) {
        Node head = new Node(10);
        Node temp1 = new Node(15);
        Node temp2 = new Node(30);
        Node temp3 = new Node(40);
        head.next = temp1;
        temp1.next = temp2;
        temp2.next = temp3;

        Node curr = head;
        while (curr != null) {
            if (curr.data == 30) {
                break;
            }
            curr = curr.next;

        }

        Node newNode = new Node(35);
        newNode.next = curr.next;
        curr.next = newNode;

        while (head != null) {
            System.out.print(head.data + " -> ");
            head = head.next;
        }

        // while (curr != null) {
        // System.out.print(curr.data + " -> ");
        // curr = curr.next;
        // }
        // System.out.println("null");
    }
}
