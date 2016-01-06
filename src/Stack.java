import java.util.Scanner;

/**
 * This class is an implementation of the Stack which follows
 * the LIFO (Last In First Out Principle).
 */
public class Stack {
    private int[] a;
    private int top;

    /**
     * Parameterized constructor.
     */
    public Stack(int n) {
        a = new int[n];
        top = -1;
    }

    /**
     * This method "pushes" a number to the top of the
     * Stack.
     */
    public void push(int p) {
        if (top + 1 == a.length) {
            System.out.println("Stack overflow.");
            return;
        }
        a[++top] = p;   // push the element onto the stack
    }

    public int pop() {
        if (top == -1) {
            System.out.println("Stack underflow.");
            return 0;
        }
        return a[top--];
    }

    public void display() {
        for (int i = top; i >= 0; i--) {
            System.out.print(a[i]);
            if (i != 0) {
                System.out.print(", ");
            }
        }
        System.out.println();
    }

     public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
         int n, p, ch;
         System.out.println("Enter size of the stack : ");
         n = scanner.nextInt();
         Stack stack = new Stack(n);
         while (true) {
             System.out.println("Menu:\n" +
                 "1. Push\n" +
                 "2. Pop\n" +
                 "3. Display\n" +
                 "4. Exit");
             System.out.print("Enter choice : ");
             ch = scanner.nextInt();
             switch (ch) {
                 case 1:
                     System.out.print("Enter element to push : ");
                     p = scanner.nextInt();
                     stack.push(p);
                     break;
                 case 2:
                     stack.pop();
                     break;
                 case 3:
                     System.out.print("The elements of the stack are : ");
                     stack.display();
                     break;
                 case 4:
                     return;
                 default:
                     System.out.print("Invalid input.");
             }
         }
     }
}