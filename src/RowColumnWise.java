import java.util.*;

/**
 * Adds the elements of a matrix row-wise and column-wise.
 */
public class RowColumnWise {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Row-wise and Column-wise addition.\n");
        System.out.print("Enter the no. of rows    : ");
        int m = scanner.nextInt();
        System.out.print("Enter the no. of columns : ");
        int n = scanner.nextInt();
        int[][] a = new int[m][n];
        System.out.println("Enter the elements of matrix : ");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(i + ", " + j + " : ");
                a[i][j] = scanner.nextInt();
            }
        }
        System.out.println("The matrix entered is : ");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
        // Row-wise addition
        System.out.println("Sum of elements of row");
        for (int i = 0; i < m; i++) {
            int sum = 0;
            for (int j = 0; j < n; j++) {
                sum += a[i][j];
            }
            System.out.println("#" + (i + 1) + " = " + sum);
        }
        System.out.println("Sum of elements of column");
        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = 0; j < m; j++) {
                sum += a[j][i];
            }
            System.out.println("#" + (i + 1) + " = " + sum);
        }
    }
}