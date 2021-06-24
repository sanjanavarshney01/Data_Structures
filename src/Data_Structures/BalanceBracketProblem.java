package couple;

import java.util.Stack;

public class BalanceBracketProblem {
    public static void main(String[] args) {
        BalanceBracketProblem obj =new BalanceBracketProblem();
        System.out.println(obj.isBalancedBrackets("{a+B}"));
    }
    public boolean isBalancedBrackets(String string) {
        Stack<Character> stack = new Stack();
        for (char ch : string.toCharArray()) {
            if (ch == '(' || ch == '{' || ch == '[' || ch == '<')
                stack.push(ch);
            else if (ch == ')' || ch == '}' || ch == ']' || ch == '>') {
                if (stack.isEmpty()){
                    System.out.println("enter a valid String");
                }
                    char top = stack.peek();
            }
            char top = 0;
            if ((ch == '(' && top != ')') ||
                    (ch == '{' && top != '}') ||
                    (ch == '[' && top != ']') ||
                    (ch == '<' && top != '>'))
                return false;
        }
        return false;
    }
}

