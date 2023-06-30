import java.util.Stack;

public class MakeQueueUsingStack {

    public static int pop(Stack<Integer> s) {
        Stack<Integer> s1 = new Stack<>();
        while (!s.isEmpty()) {
            s1.push(s.pop());
        }

        int ans = s1.pop();
        while (!s1.isEmpty()) {
            s.push(s1.pop());
        }

        return ans;
    }

    public static int peek(Stack<Integer> s) {
        Stack<Integer> s1 = new Stack<>();
        while (!s.isEmpty()) {
            s1.push(s.pop());
        }

        int ans = s1.peek();
        while (!s1.isEmpty()) {
            s.push(s1.pop());
        }

        return ans;
    }

    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();

        for (int i = 0; i < 6; i++) {
            s.push(i);
            System.out.println("Push : " + i);
        }
        System.out.println("Size of Stack : " + s.size());
        System.out.println("Pop : " + pop(s));
        System.out.println("Size of Stack : " + s.size());
        System.out.println("Peek : " + peek(s));
        System.out.println("Size of Stack : " + s.size());
    }
}
