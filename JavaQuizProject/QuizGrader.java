import java.util.Scanner;

public class QuizGrader {

    // Step 1: The Specifications Method
    public static void printSpecifications() {
        System.out.println("******************************************");
        System.out.println("Project: Student Quiz Grader (Protected)");
        System.out.println("Instructions: Enter up to 10 quiz scores.");
        System.out.println("Enter 999 at any time to exit early.");
        System.out.println("******************************************");
    }

    public static void main(String[] args) {
        printSpecifications();
        // the following code was inpired by the "using Data lesson" from the scanner
        // class,variables naming etc

        Scanner input = new Scanner(System.in);
        int[] grades = new int[10];
        int count = 0;
        double runningTotal = 0;
        int tempGrade = 0;

        // Step 2 & 3: Input with Error Handling (Lesson: Handling Exceptions)
        while (count < 10) {
            System.out.print("Enter Quiz Grade " + (count + 1) + " (or 999 to quit): ");
            /*
             * PLACEMENT: Added "The Security Guard" Logic which Chat GPT explain to me to
             * help me better understand throughout my research. also chapter 4
             * "The decision making process in java" was also super helpful because it shows
             * the importance of the "if"s "else" and more statements
             */

            try {
                tempGrade = input.nextInt(); // Try to get a number

                if (tempGrade == 999) {
                    break;
                }
                /*
                 * this is just beautiful because its the "try and catch" lol what it does is
                 * it's like a safety net
                 * try-catch block prevents the program from crashing
                 * if a user enters non-numeric data. input.next() is used
                 * to flush the invalid input from the Scanner's buffer.
                 */

                grades[count] = tempGrade;
                runningTotal += tempGrade;
                count++;

            } catch (Exception e) {
                // This runs if the user types text instead of a number
                System.out.println(
                        "UHH OH...That does'nt look like a number. Please enter a numeric grade. You got this!");
                input.next();
                // "try and catch" coming to the rescue!
                // Inspired by the "Inheritance & Exception Handling in Java" lesson i'm glad to
                // have learned this tool
            }
        }

        // Step 4: Printing the Summary
        System.out.println("\n--- Summary of Grades ---");
        for (int i = 0; i < count; i++) {
            System.out.println("Grade " + (i + 1) + ": " + grades[i]);
        }

        // Step 5: Computing the Average
        double average = (count > 0) ? (runningTotal / count) : 0;

        // again chapter 4 at work!
        if (average >= 90) {
            System.out.println("Average: " + average + " | Final Grade: A");
        } else if (average >= 80) {
            System.out.println("Average: " + average + " | Final Grade: B");
        } else if (average >= 70) {
            System.out.println("Average: " + average + " | Final Grade: C");
        } else if (average >= 60) {
            System.out.println("Average: " + average + " | Final Grade: D");
        } else {
            System.out.println("Average: " + average + " | Final Grade: F");
        }

        input.close();
        // I learned a lot plus it was my first Java project so i'm super glad hopefully
        // many more to come!
    }
}
