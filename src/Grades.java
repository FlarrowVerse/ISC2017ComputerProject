import java.util.*;

/**
 * A class to input 3 marks and calculate the grade.
 */
public class Grades {
    /**
     * The entry point.
     */
    public static void main(String[] args) {
        // To take input
        Scanner scanner = new Scanner(System.in);
        System.out.println("Grade Calculator\n");
        System.out.println("Enter marks of 3 subjects :");
        // Array helps in easy storage
        int[] marks = new int[3];   // for 3 subjects
        for (int i = 0; i < marks.length; i++) {
            int mark = scanner.nextInt();
            // Making sure that user enters proper marks
            while (mark < 0 || mark > 100) {
                mark = scanner.nextInt();
                System.out.println
                        ("Invalid value. Re-enter marks");
            }
            marks[i] = mark;
        }
        double sum = 0, average;
        // total summation
        for (int mark : marks) {
            sum += mark;
        }
        average = sum / marks.length;
        System.out.println("The average marks is : " + average);
        // Grade calculation
        String grade;
        if (average >= 90) {
            grade = "A+";
        } else if (average >= 80 && average < 90) {
            grade = "A";
        } else if (average >= 70 && average < 80) {
            grade = "B";
        } else if (average >= 60 && average < 70) {
            grade = "C";
        } else if (average >= 40 && average < 60) {
            grade = "D";
        } else {
            grade = "Fail";
        }
        System.out.println("The overall grade is : " + grade);
    }
}