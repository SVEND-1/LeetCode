package org.example.interview;

import java.util.Stack;

public class Task3 {
    //Проверка сбалансированности скобок:
    //   – Задание: Напишите метод, который проверяет, правильно ли расставлены скобки в строке (например, (), [], {}).
    public static void main(String[] args) {
        String task1 = "[]{}{}[]()";
        if (checkBalancedBrackets1(task1)) {
            System.out.println("Правильно");
        } else {
            System.out.println("Не правильно");
        }

    }

    private static boolean checkBalancedBrackets1(String message) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < message.length(); i++) {
            char current = message.charAt(i);
            if(current == '[' || current == '{' || current == '('){
                stack.push(current);
            }
            else if(current == ']' || current == '}' || current == ')'){
                if(stack.isEmpty()){
                    return false;
                }

                char top = stack.pop();
                if((current == ')' && top != '(') ||
                        (current == '}' && top != '{') ||
                        (current == ']' && top != '[') ){
                    return false;
                }
            }
        }

        return true;
    }

}
