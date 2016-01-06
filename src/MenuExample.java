import java.io.*;

/**
 * This class prints a menu of supported calculations i.e.:
 *  1. Distance calculation
 *  2. Energy calculation
 *  3. Final velocity calculation
 * After the user inputs the appropriate choice number, the program
 * prompts the user to provide the values for the necessary parameters.
 * Then it calculates the result and displays it.
 */
public class MenuExample {

    /**
     * The entry point for the program.
     */
    public static void main(String[] args) throws IOException {
        // BufferedReader will be used to take input.
        BufferedReader reader = new BufferedReader
                (new InputStreamReader(System.in));
        // The menu and the corresponding instruction
        System.out.println("--------Calculation program--------\n");
        System.out.println("1. Distance calculation.");
        System.out.println("2. Energy calculation.");
        System.out.println("3. Final velocity calculation.\n");
        System.out.print("Enter your choice : ");
        // choice input
        int choice = Integer.parseInt(reader.readLine());
        // Variable declarations
        double u, v, a, t, S, m, c, E;
        switch (choice) {
            case 1:     // Distance calculation
                System.out.print("Enter the initial velocity (u) : ");
                u = Double.parseDouble(reader.readLine());
                System.out.print("Enter the acceleration     (a) : ");
                a = Double.parseDouble(reader.readLine());
                System.out.print("Enter the time             (t) : ");
                t = Double.parseDouble(reader.readLine());
                // S = u-t plus half a-t-squared
                S = u * t + (1.0 / 2.0) * a * Math.pow(t, 2);
                System.out.println("The distance travelled in time "
                        + t + " is = " + S);
                break;
            case 2:     // Energy calculation
                System.out.print("Enter the mass (m) : ");
                m = Double.parseDouble(reader.readLine());
                System.out.print("Enter the speed of light" +
                        " (or '0' to use default value) (c) : ");
                c = Double.parseDouble(reader.readLine());
                c = (c == 0) ? 299792458 : c;   // 299,792,458 m/s
                E = m * Math.pow(c, 2);         // E = m-c-squared
                System.out.println("Energy liberated (E) = " + E);
                break;
            case 3:     // Final velocity calculation
                System.out.print("Enter the initial velocity   (u) : ");
                u = Double.parseDouble(reader.readLine());
                System.out.print("Enter the acceleration       (a) : ");
                a = Double.parseDouble(reader.readLine());
                System.out.print("Enter the distance travelled (S) : ");
                S = Double.parseDouble(reader.readLine());
                // root over u-squared plus 2-a-S
                v = Math.sqrt(Math.pow(u, 2) + 2 * a * S);
                System.out.println("The final velocity attained = " + v);
                break;
            default:    // Unknown choice
                System.out.println("Absurd input.");
        }
    }
}