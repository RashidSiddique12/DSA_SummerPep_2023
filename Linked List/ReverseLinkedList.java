public class ReverseLinkedList {

    public static class Node {
        int data;
        Node next;

        Node(int x) {
            data = x;
            next = null;
        }
    }

    // iterative way
    // public static Node reverse(Node head) {
    // Node prev = null;
    // Node curr = head;
    // Node next = null;

    // while (curr != null) {
    // next = curr.next;
    // curr.next = prev;
    // prev = curr;
    // curr = next;
    // }
    // return prev;
    // }

    // Recursive way

    public static Node reverse(Node head) {
        if (head == null || head.next == null)
            return head;

        Node node = reverse((head.next));
        head.next.next = head;
        head.next = null;
        return node;

    }

    public static void print(Node head) {
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
    }

    public static void main(String[] args) {

        Node head = new Node(10);
        Node temp1 = new Node(20);
        Node temp2 = new Node(30);
        Node temp3 = new Node(40);
        Node temp4 = new Node(50);
        Node temp5 = new Node(60);

        head.next = temp1;
        temp1.next = temp2;
        temp2.next = temp3;
        temp3.next = temp4;
        temp4.next = temp5;

        Node newHead = reverse(head);
        print(newHead);

    }

}
