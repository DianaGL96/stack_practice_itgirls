package ru.diana.stack_practice.util;
import java.util.Stack;

public class Check {
    public boolean CheckParent(String str) {
        if (str.isEmpty()) {
            return true;
        }
        Stack<Character> stack = new Stack();
        for (int i = 0; i < str.length(); i++) {
            char current = str.charAt(i);
            if (current == '{' || current == '[' || current == '(') {
                stack.push(current);
            }
            else if (current == '}' || current == ']' || current == ')') {
                if (stack.isEmpty()) {
                    return false;
                }
                char last = stack.peek();
                if (current == '}' && last == '{' || current == ')' && last == '(' || current == ']' && last == '[') {
                stack.pop();
                } else {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}
