import java.util.*;

/**
 * This class demonstrates adding two arbitrary polynomials.
 */
public class PolynomialAddition {
    /**
     * The entry point.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println
                ("Enter the size (no. of terms)" +
                        " of two polynomials : ");
        System.out.print("1 : ");
        int l1 = scanner.nextInt();
        System.out.print("2 : ");
        int l2 = scanner.nextInt();
        int[] p1 = inputPolynomial(l1, scanner);
        int[] p2 = inputPolynomial(l2, scanner);
        int[] p3 = addPolynomials(p1, p2);
        displayPolynomial(p1);
        displayPolynomial(p2);
        displayPolynomial(p3);
    }

    /**
     * This method initializes and returns a polynomial.
     */
    public static int[] inputPolynomial
    (int l, Scanner scanner) {
        int[] p = new int[l];
        int[] c = new int[l];
        int deg = 0;
        for (int i = 0; i < l; i++) {
            System.out.println("#" + (i + 1));
            System.out.print("Coefficient : ");
            c[i] = scanner.nextInt();
            System.out.print("Power       : ");
            p[i] = scanner.nextInt();
            if (p[i] < 0) {
                System.out.println
                        ("Please enter only positive powers.");
                System.exit(0);
            }
            if (deg < p[i]) {
                deg = p[i];
            }
        }
        int[] pol = new int[deg + 1];
        for (int i = 0; i < l; i++) {
            pol[p[i]] += c[i];
        }
        return pol;
    }

    /**
     * This method adds two polynomials and
     * returns the sum.
     */
    public static int[] addPolynomials
    (int[] p1, int[] p2) {
        int s, l;
        if (p1.length < p2.length){
            s = p1.length;
            l = p2.length;
        } else {
            s = p2.length;
            l = p1.length;
        }
        int[] p = new int[l];
        for (int i = 0; i < s; i++) {
            p[i] = p1[i] + p2[i];
        }
        return p;
    }

    /**
     * This method displays a polynomial in
     * proper form.
     */
    public static void displayPolynomial(int[] p) {
        for (int i = p.length - 1; i >= 0; i--) {
            if (p[i] != 0) {
                if (i != p.length - 1) {
                    System.out.print("+ ");
                }
                System.out.print(p[i]);
                if (i != 0) {
                    System.out.print("x^" + i + " ");
                }
            }
        }
        System.out.println();
    }
}