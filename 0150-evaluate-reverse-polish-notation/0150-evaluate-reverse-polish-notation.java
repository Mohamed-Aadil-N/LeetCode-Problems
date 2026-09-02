import java.util.Stack;

class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        
        for (String token : tokens) {
            // Check if the token is an operator
            if (token.equals("+") || token.equals("-") || token.equals("*") || token.equals("/")) {
                // First pop gives the second operand (b)
                // Second pop gives the first operand (a)
                int b = stack.pop();
                int a = stack.pop();
                
                if (token.equals("+")) {
                    stack.push(a + b);
                } else if (token.equals("-")) {
                    stack.push(a - b);
                } else if (token.equals("*")) {
                    stack.push(a * b);
                } else {
                    stack.push(a / b);
                }
            } else {
                // Parse integer (handles positive, negative, and multi-digit strings)
                stack.push(Integer.parseInt(token));
            }
        }
        
        return stack.peek();
    }
}