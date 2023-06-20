class MergTwoLinkedList {

    public static class Node {
        int data;
        Node next;

        Node(int x) {
            data = x;
            next = null;
        }
    }

    public static Node merg(Node head1, Node head2) {
        Node dummy = new Node(0);
        Node newHead = dummy;
        while (head1 != null && head2 != null) {
            if (head1.data <= head2.data) {
                dummy.next = head1;
                head1 = head1.next;
            } else {
                dummy.next = head2;
                head2 = head2.next;
            }
            dummy = dummy.next;

        }
        return newHead.next;

    }

    public static void print(Node head) {
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
    }

    public static void main(String[] args) {

        Node head1 = new Node(10);
        Node temp1 = new Node(40);
        Node temp2 = new Node(60);
        Node temp3 = new Node(80);
        Node temp4 = new Node(100);
        Node temp5 = new Node(120);

        head1.next = temp1;
        temp1.next = temp2;
        temp2.next = temp3;
        temp3.next = temp4;
        temp4.next = temp5;

        Node head2 = new Node(20);
        Node t1 = new Node(30);
        Node t2 = new Node(50);
        Node t3 = new Node(70);
        Node t4 = new Node(90);
        Node t5 = new Node(110);

        head2.next = t1;
        t1.next = t2;
        t2.next = t3;
        t3.next = t4;
        t4.next = t5;

        Node newHead = merg(head1, head2);
        print(newHead);

    }

}
