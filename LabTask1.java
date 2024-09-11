import java.util.Scanner;
// Importing the Scanner class allows us to take inputs

// Declaring the class where all the code will be written - In Java, every program needs to be inside a class!
public class LabTask1 {
    // The main method is the entry point of every Java application!
    // This is where the program starts
    public static void main(String[] args) {

        // Creating a Scanner object called 'input'
        // Allows us to take input from the keyboard (System.in)
        Scanner input = new Scanner(System.in);

        // Prompting the user to enter a single-digit number via a basic print statement, java version.
        System.out.println("Enter a single-digit number (0-9):");

        // The nextInt() method reads the next integer entered by the user.
        int number = input.nextInt();

        // Checks if the number is valid.
        if (number >= 0 && number <= 9) {

             // The switch statement compares the value of 'number' and matches it to a case.
            // Each case specifies a value that the variable in the switch statement can have.
            switch (number) {
                case 0:
                    System.out.println("Zero");
                    break;
                case 1:
                    System.out.println("One");
                    break;
                case 2:
                    System.out.println("Two");
                    break;
                case 3:
                    System.out.println("Three");
                    break;
                case 4:
                    System.out.println("Four");
                    break;
                case 5:
                    System.out.println("Five");
                    break;
                case 6:
                    System.out.println("Six");
                    break;
                case 7:
                    System.out.println("Seven");
                    break;
                case 8:
                    System.out.println("Eight");
                    break;
                case 9:
                    System.out.println("Nine");
                    break;
            }
        } else {
            System.out.println("Invalid number!");
        }
        // Closing the Scanner object to prevent resource leaks - considered best practice for Java
        input.close();
    }
}