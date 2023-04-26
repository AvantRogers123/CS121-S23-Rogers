package Activity32;

public class BalancedBrackets {
    public static void main(String[] args) {
        import java.util.Stack;

        public class BalancedBrackets {
            public static boolean isBalanced(String str) {
                Stack<Character> stack = new Stack<Character>();

                for (int i = 0; i < str.length(); i++) {
                    char ch = str.charAt(i);
                    if (ch == '(' || ch == '{' || ch == '[') {
                        stack.push(ch);
                    } else if (ch == ')' || ch == '}' || ch == ']') {
                        if (stack.isEmpty()) {
                            return false;
                        }
                        char top = stack.pop();
                        if ((top == '(' && ch != ')') || (top == '{' && ch != '}') || (top == '[' && ch != ']')) {
                            return false;

                    }
                return stack.isEmpty();

}
