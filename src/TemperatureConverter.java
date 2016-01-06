import java.io.*;
/**
 * A class that converts a value given in the Celsius scale to
 * Fahrenheit by taking input from the user.
 */
public class TemperatureConverter {
    /**
     * The main method that gets executed.
     */
    public static void main(String[] args)
            throws IOException {
        // java.io.BufferedReader is used to take input
        BufferedReader reader = new BufferedReader
                (new InputStreamReader(System.in));
        // Display the title
        System.out.println
                ("Temperature Converter : Celsius to Fahrenheit\n");
        // Prompt for input
        System.out.print
                ("Enter a temperature in the centigrade scale : ");
        // Accept the input
        double c = Double.parseDouble(reader.readLine());
        // Perform the calculation
        double f = ((c * 9.0) / 5.0) + 32.0; // as 180/100 = 9/5
        // Display the result
        System.out.println(
                "The temperature in Fahrenheit is : " + f
        );
    }
}