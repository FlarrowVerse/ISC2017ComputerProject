import java.util.*;

/**
 * This class is an implementation of the Queue which follows
 * the FIFO (First In First Out Principle).
 */
public class Queue {
    private int[] a;
    private int front, rear;

    /**
     * Constructor for the Queue class.
     */
    public Queue(int n) {
        a = new int[n];
        front = rear = -1;
    }

    /**
     * Inserts an element at the end of the queue.
     */
    public void insert(int n) {
        if ((rear + 1) % a.length == front) {
            System.out.println("Queue overflow.");
            return;
        }
        if (rear == -1 && front == -1) {
            front = rear = 0;
        } else {
            rear++;
        }
        a[rear] = n;
    }

    /**
     * Deletes an element from the front of the queue.
     */
    public void delete() {
        if (front == -1) {
            System.out.println("Queue underflow.");
            return;
        }
        System.out.println("Deleted element : " + a[front]);
        if (front == rear) {
            front = rear = -1;  // reset
        } else {
            front++;
        }
    }

    /**
     * Displays the elements of the Queue.
     */
    public void display() {
        if (front == -1) {
            System.out.println("Queue empty");
            return;
        }
        for (int i = front; i <= rear; i++) {
            System.out.print(a[i]);
            if (i != rear) {
                System.out.print(", ");
            }
        }
        System.out.println();
    }

    /**
     * The entry point for the program.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n, p, ch;
        System.out.println("Enter size of the queue : ");
        n = scanner.nextInt();
        Queue queue = new Queue(n);
        while (true) {
            System.out.println("Menu:\n" +
                    "1. Insert\n" +
                    "2. Delete\n" +
                    "3. Display\n" +
                    "4. Exit");
            System.out.print("Enter choice : ");
            ch = scanner.nextInt();
            switch (ch) {
                case 1:
                    System.out.print("Enter element to insert : ");
                    p = scanner.nextInt();
                    queue.insert(p);
                    break;
                case 2:
                    queue.delete();
                    break;
                case 3:
                    System.out.print("The elements of the queue are : ");
                    queue.display();
                    break;
                case 4:
                    return;
                default:
                    System.out.print("Invalid input.");
            }
        }
    }
}