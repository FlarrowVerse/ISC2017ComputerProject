import java.util.*;

/**
 * This class inputs an array of user-given
 * size, sorts it using bubble-sort method
 * and searches an element using linear search.
 */
public class SortAndSearch {
    /**
     * The entry point.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println
                ("Array sorting and searching\n");
        System.out.print
                ("Enter the size of the array (x) : ");
        int x = scanner.nextInt();
        int[] a = new int[x];
        // input all the elements
        for (int i = 0; i < x; i++) {
            System.out.print((i + 1) + " : ");
            a[i] = scanner.nextInt();
        }
        display(a);
        bubbleSort(a);
        display(a);
        System.out.print("Enter an element to search for : ");
        int n = scanner.nextInt();
        search(a, n);
    }

    /**
     * Helper to display the array.
     */
    public static void display(int[] a) {
        System.out.println
                ("The elements of the array are : ");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }

    /**
     * Sorts a given array using bubble sort technique.
     */
    public static void bubbleSort(int[] a) {
        int n = a.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (a[j] > a[j + 1]) {
                    // swap
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }
    }

    /**
     * Searches for a given element linearly.
     */
    public static void search(int[] a, int e) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] == e) {
                System.out.println("Element '" + e
                        + "' found at " + i);
            }
        }
    }
}