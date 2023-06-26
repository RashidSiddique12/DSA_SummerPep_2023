import java.util.Stack;

public class BasicOpration {
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        // to add element in the stack
        s.push(5);
        s.push(10);
        s.push(14);
        // to see which one is on the top
        System.out.println("Peek Element : " + s.peek());
        s.push(15);
        s.push(19);
        s.push(20);
        int smallest = 100;

        // to check element is in the stack or not
        while (!s.isEmpty()) {
            // to pop element from the stack
            int no = s.pop();
            if (no < smallest) {
                smallest = no;
            }
        }
        System.out.println("Smallest Element : " + smallest);
        System.out.println("Does it have in the Stack " + s.search(20));
    }

}
