
class Node {
    int data;
    Node left;
    Node right;

    Node(int x) {
        data = x;
        left = right = null;

    }
}

public class basic {
    public static void main(String[] args) {
        Node root = new Node(5);
        root.left = new Node(10);
        root.right = new Node(15);
        root.left.left = new Node(12);
        root.left.right = new Node(13);
        root.left.left.left = new Node(9);
        root.left.left.right = new Node(8);
        root.left.right.left = new Node(7);
        root.left.right.right = new Node(3);
        root.left.right.right.left = new Node(4);
        root.right.left = new Node(30);
        root.right.right = new Node(45);
        root.right.right.right = new Node(50);
        root.right.right.right.right = new Node(90);
        root.right.right.right.right.left = new Node(46);

        System.out.println("PreOrder : ");
        preOder(root);
        System.out.println();
        System.out.println("InOrder : ");
        InOrder(root);
        System.out.println();
        System.out.println("PostOrder : ");
        postOrder(root);
        System.out.println();
        System.out.println("Height of Tree : " + height(root));

        int l = height(root.left);
        int r = height(root.right);
        System.out.println("Diameter of tree " + (l + r + 1));

    }

    public static int height(Node root) {
        if (root == null)
            return 0;
        return 1 + Math.max(height(root.left), height(root.right));
    }

    public static void preOder(Node root) {
        // System.out.println("PreOrder : ");
        if (root != null) {
            System.out.print(root.data + " ");
            preOder(root.left);
            preOder(root.right);
        }
        // System.out.println();

    }

    public static void InOrder(Node root) {
        // System.out.println("InOrder : ");
        if (root != null) {
            InOrder(root.left);
            System.out.print(root.data + " ");
            InOrder(root.right);
        }
        // System.out.println();

    }

    public static void postOrder(Node root) {
        // System.out.println("PostOrder : ");
        if (root != null) {
            postOrder(root.left);
            postOrder(root.right);
            System.out.print(root.data + " ");
        }
        // System.out.println();
    }
}
