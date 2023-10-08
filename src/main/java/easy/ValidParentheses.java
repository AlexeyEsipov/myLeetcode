package easy;

import java.util.Deque;
import java.util.LinkedList;

public class ValidParentheses {
    public boolean isValid(String s) {
        Deque<Character> stack = new LinkedList<>();
        char[] arr = s.toCharArray();
        for (char ch : arr) {


            if (ch == '(' || ch == '{' ||ch == '[') {
                stack.push(ch);
            } else if (!stack.isEmpty()
                    && ((ch == ')' && stack.peek() == '(')
                 || (ch == '}' && stack.peek() == '{')
                 || (ch == ']' && stack.peek() == '['))) {
                    stack.pop();
            } else {
                stack.push(ch);
            }
        }
        return stack.isEmpty();
    }
}
