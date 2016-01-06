import java.util.*;

/**
 * This class creates a square spiral matrix.
 */
public class SpiralMatrix {
    /**
     * The entry point.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print
                ("Enter the number of rows and columns : ");
        int n = scanner.nextInt();
        int[][] a = new int[n][n];
        int iT = 0, iB = n - 1, jL = 0, jR = n - 1;
        int i, j;
        int number = 1;
        while (iT <= iB && jL <= jR) {
            // down
            for (i = iT, j = jR; i <= iB; i++) {
                a[i][j] = number++;
            }
            jR--;
            // left
            for (i = iB, j = jR; j >= jL; j--) {
                a[i][j] = number++;
            }
            iB--;
            // up
            for (i = iB, j = jL; i >= iT; i--) {
                a[i][j] = number++;
            }
            jL++;
            // right
            for (i = iT, j = jL; j <= jR; j++) {
                a[i][j] = number++;
            }
            iT++;
        }
        // Display
        System.out.println("The required matrix is : ");
        for (i = 0; i < a.length; i++) {
            for (j = 0; j < a[i].length; j++) {
                System.out.printf("%3d", a[i][j]);
            }
            System.out.println();
        }
    }
}