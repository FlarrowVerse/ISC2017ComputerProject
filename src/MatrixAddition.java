import java.util.*;

/**
 * This class inputs two M x N matrices and
 */
public class MatrixAddition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Matrix addition.\n");
        System.out.print("Enter the no. of rows    : ");
        int m = scanner.nextInt();
        System.out.print("Enter the no. of columns : ");
        int n = scanner.nextInt();
        int[][] a = new int[m][n];
        int[][] b = new int[m][n];
        int[][] c = new int[m][n];
        inputMatrix(a, "a", scanner);
        inputMatrix(b, "b", scanner);
        // Addition of the corresponding elements.
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                c[i][j] = a[i][j] + b[i][j];
            }
        }
        displayMatrix(a, "a");
        displayMatrix(b, "b");
        displayMatrix(c, "c (= a + b)");
    }

    public static void inputMatrix(int[][] a, String name, Scanner scanner) {
        System.out.println("Enter the elements of matrix '" + name + "'");
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(i + ", " + j + " : ");
                a[i][j] = scanner.nextInt();
            }
        }
    }

    public static void displayMatrix(int[][] a, String name) {
        System.out.println("The matrix '" + name + "' is : ");
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
}