
public class CreateStackUsingArray {

    static final int max = 100;
    int stack[] = new int[max];
    int top;

    CreateStackUsingArray() {
        top = -1;
    }

    public void push(int x) {
        if (top <= max - 1) {
            stack[++top] = x;
        } else {
            System.out.println("Stack overflow");
        }
    }

    public void pop() {
        if (top < 0) {
            System.out.println("Stack underflow");
        } else {
            int p = stack[top--];
            System.out.println("Element is pop from the stack " + p);
        }
    }

    public void isEmpty() {
        if (top == -1) {
            System.out.println("stack is Empty");
        } else {
            System.out.println("Stack is not Empty");
        }
    }

    public void peek() {
        if (top == -1) {
            System.out.println("Stack underflow");
        } else {
            int no = stack[top];
            System.out.println("Peek Element is stack in the " + no);
        }
    }

    public static void main(String[] args) {
        CreateStackUsingArray s = new CreateStackUsingArray();
        s.push(10);
        s.push(20);
        s.push(30);
        s.push(40);

        s.peek();

        s.isEmpty();

        s.pop();

        System.out.println(5 / 2);

    }

}
