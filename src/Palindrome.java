import java.util.*;

/**
 * This class checks if a no. entered by the user
 * is a palindrome or not.
 */
public class Palindrome {
    /**
     * The entry point.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Palindrome checker\n");
        System.out.print("Enter a number to check : ");
        int n = scanner.nextInt();
        System.out.print("The given number is ");
        if (n == reverse(n)) {
            System.out.println("a palindrome");
        } else {
            System.out.println("not a palindrome");
        }
    }

    /**
     * This method checks if the number is a palindrome.
     */
    public static int reverse(int n) {
        int r = 0;
        // reverse the number
        while (n > 0) {
            r = r * 10 + n % 10;
            n /= 10;
        }
        return r;
    }
}