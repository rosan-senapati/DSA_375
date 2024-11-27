import java.util.Stack;

public class A_42 {
    public static void main(String[] args) {
        String s = "()[]{}";
        Stack<Character> stack = new Stack<>();
        // System.out.println(s.length());
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '[') {
                stack.push(s.charAt(i));
            } else {
                if (stack.isEmpty())
                    break;
                char ch = s.charAt(i);
                char top = stack.peek();
                if (ch == ')' && top != '(')
                    break;
                else if (ch == '}' && top != '{')
                    break;
                else if (ch == ']' && top != '[')
                    break;
                else
                    stack.pop();
            }
        }
        if (stack.size() == 0) {
            System.out.println("Valid");
        } else {
            System.out.println("False");
        }
    }
}
