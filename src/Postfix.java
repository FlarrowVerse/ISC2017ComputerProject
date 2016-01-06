import java.util.Scanner;

/**
 * This class provides the functionality to
 */
public class Postfix {
    private char[] stack;
    private int top;

    /**
     * Creates a new Postfix object with the length of the internal Stack
     * specified.
     *
     * @param length The maximum size of the stack.
     */
    public Postfix(int length) {
        top = 0;
        stack = new char[length];
    }

    /**
     * Adds a character to the top of the Stack, if overflow didn't occur.
     *
     * @param c The character to push.
     */
    public void push(char c) {
        if (top == stack.length - 1) {
            System.out.println("Stack Overflow");
        }
        stack[++top] = c;
    }

    /**
     * Returns the character at the top of the Stack, if any. Otherwise, it
     * returns 0.
     *
     * @return The character at the top of the Stack.
     */
    public char pop() {
        if (top == 0) return 0;
        return stack[top--];
    }

    /**
     * Returns the precedence of the given operator. Multiplication and
     * division have highest precedence, followed by addition and subtraction.
     * The open parentheses has lowest precedence.
     * <p>
     * If the character is unrecognised, the precedence is 0.
     *
     * @param c The operator whose precedence is sought.
     * @return The precedence of the operator.
     */
    private static int precedence(char c) {
        switch (c) {
            case '(':
                return 1;
            case '+':
            case '-':
                return 2;
            case '*':
            case '/':
                return 3;
        }
        return 0;
    }

    /**
     * The entry point for the program.
     *
     * @param args The command-line arguments.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an expression in infix notation : ");
        String a = scanner.nextLine() + ")";
        String b = "";
        Postfix postfix = new Postfix(a.length());
        for (int i = 0; i < a.length(); i++) {
            char c = a.charAt(i);
            // Open parentheses
            if (c == '(') {
                postfix.push(c);
                continue;
            }
            // Operands are single-lettered
            if (Character.isAlphabetic(c)) {
                b += c;
            }
            // Closing parentheses
            if (c == ')') {
                char ch = postfix.pop();
                while (ch != '(' && ch != 0) {
                    b += ch;
                    ch = postfix.pop();
                }
            }
            // Operator handling
            if ("+-*/".indexOf(c) > -1) {   //i.e operator present
                char d = postfix.pop();
                int p = precedence(c);
                int q = precedence(d);
                while (d != 0 && p <= q) {
                    b += d;
                    d = postfix.pop();
                }
                if (d != 0)
                    postfix.push(d);
                postfix.push(c);
            }
        }
        System.out.println(b);
    }
}
