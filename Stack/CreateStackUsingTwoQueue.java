import java.util.LinkedList;
import java.util.Queue;

public class CreateStackUsingTwoQueue {

    public static void push(Queue<Integer> q, int i) {
        Queue<Integer> q1 = new LinkedList<>();
        while (!q.isEmpty()) {
            q1.offer(q.poll());
        }
        q.offer(i);
        while (!q1.isEmpty()) {
            q.offer(q1.poll());
        }
    }

    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        System.out.println("Size of Queue : " + q.size());

        for (int i = 1; i < 6; i++) {
            push(q, i);
            System.out.println(i + " is Push in Queue");
        }
        System.out.println("Peek of Stack : " + q.peek());
        System.out.println("Size of Queue : " + q.size());
        System.out.println(q.poll() + " is Pop from the Queue");
        System.out.println(q.poll() + " is Pop from the Queue");
        System.out.println(q.poll() + " is Pop from the Queue");
        System.out.println("Size of Queue : " + q.size());
        System.out.println("Peek of Stack : " + q.peek());

    }
}
