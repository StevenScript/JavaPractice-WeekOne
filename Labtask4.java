import java.util.Scanner;

public class Labtask4 {
    public static void main(String[] args) {        
        Scanner input = new Scanner(System.in);

        // Variables //
        
        // to store the sum of all numbers entered
        int sum = 0;

        // Counts how many numbers were entered
        int count = 0;

        // Current number input by the user
        int number;

        // Print statement before starting main program loop
        // informs user that program will continue until the user enters -999
        System.out.println("Enter numbers to sum and calculate the average (Enter -999 to stop):");

        // Loop will continue reading user input numbers until -999 is entered
        while (true) {
            // Reads the next number - only accepts intergers
            number = input.nextInt();

            // Check if the number is -999
            if (number == -999) {
                break; // Exits the loop to end
            }

            // Adding the number to the sum variable
            sum += number;

            // Increase the count variable to keep track of how many numbers were entered
            count++;
        }

        // After exiting the loop, ensure we dont divide by zero and crash the program
        if (count > 0) {
            // Calculate the average using double used instead of float
            // Float could work here, as it would save memory
            // Double proveds a significant increase in prescision and accuracy in exchange for speed/memory usage
            double average = (double) sum / count;

            // Print statements
            System.out.println("Sum of the numbers: " + sum);

            
            System.out.println("Average of the numbers: " + average);
        } else {
            
            System.out.println("No numbers were entered.");
        }
        
        input.close();
    }
}