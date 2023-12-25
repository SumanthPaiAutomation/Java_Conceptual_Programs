import java.util.Stack;

public class BalancedParanthesisChecker {

    public

    static

    boolean

    isBalanced(String expression)

    {
        Stack<Character> stack = new Stack<>();

        for (char c : expression.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                // Push opening parenthesis onto the stack
                stack.push(c);
            } else if (c == ')' || c == '}' || c == ']') {
                // Check for matching closing parenthesis
                if (stack.isEmpty() || !isMatchingPair(stack.pop(), c)) {
                    return false; // Not balanced
                }
            }
        }

        // All parentheses are balanced if the stack is empty at the end
        return stack.isEmpty();
    }

    private static boolean isMatchingPair(char opening, char closing)

    {
        return (opening == '(' && closing == ')') ||
                (opening == '{' && closing == '}') ||
                (opening == '[' && closing == ']');
    }

    public

    static

    void

    main(String[] args)

    {
        String expression1 = "({[]})";
        String expression2 = "({[)]}";

        System.out.println(expression1 + " is balanced: " + isBalanced(expression1));
        System.out.println(expression2 + " is balanced: " + isBalanced(expression2));
    }
}