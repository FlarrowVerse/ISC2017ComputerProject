import java.util.*;

/**
 * This class prints all Automorphic numbers
 * in a range.
 */
public class Automorphic {
    /**
     * The entry point.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println
                ("Automorphic numbers in a range.\n");
        System.out.print("Enter the lower limit (x) : ");
        int x = scanner.nextInt();
        System.out.print("Enter the upper limit (y) : ");
        int y = scanner.nextInt();
        // scan all nos from x to y
        for (int i = x; i <= y; i++) {
            if (isAutomorphic(i)) {
                System.out.println(i);
            }
        }
    }

    /**
     * Returns true if a number is automorphic.
     */
    public static boolean isAutomorphic(int n) {
        // square, copy and divisor.
        int sq = n * n, cp = n, div = 1;
        while (cp > 0) {
            div *= 10;
            cp /= 10;
        }
        return sq % div == n;
    }
}
