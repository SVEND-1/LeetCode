package org.example.easy;

import java.util.Stack;

public class ValidParentheses {

    public boolean isValid(String s) {
        if(s.length() <= 1) return false;

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char current = s.charAt(i);

            if(current == '(' || current == '[' || current == '{'){
                stack.push(current);
                continue;
            }

            if(stack.isEmpty()) return false;

            char top = stack.pop();
            if(current == '}' && top != '{' ||
                    current == ')' && top != '(' ||
                    current == ']' && top != '['){
                return false;
            }
        }
        if(!stack.isEmpty()) return false;

        return true;
    }
}
