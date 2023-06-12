import java.util.Scanner;
import java.util.Stack;

public class ParenthesisChecker {
    public static boolean check(String str) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == '[' || ch == '{' || ch == '(') {
                stack.push(ch);
            } else {
                if (stack.isEmpty())
                    return false;

                char top = stack.pop();
                if (ch == '}' && top != '{' || ch == ']' && top != '[' || ch == ')' && top != '(') {
                    return false;
                }
            }
        }
        return stack.isEmpty();

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        // String str = "{([])}";
        System.out.println(check(str));
    }

}
