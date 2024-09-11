import java.util.Scanner;

public class LabTask2 {
    public static void main(String[] args) {
        // Creating a Scanner object called 'input' to take input from the user
        Scanner input = new Scanner(System.in);

        // Prompting the user to enter five integers
        System.out.println(" Enter the first integer:");
        int num1 = input.nextInt(); // Reads the interger

        System.out.println("Enter the second integer:");
        int num2 = input.nextInt();

        System.out.println("Enter the third integer:");
        int num3 = input.nextInt();

        System.out.println("Enter the fourth integer:");
        int num4 = input.nextInt();

        System.out.println("Enter the fifth integer:");
        int num5 = input.nextInt();

        // To start, set the first number is the largest
        // Largest, a variable, will be updated anytime we encounter a larger number
        int largest = num1;

        // Checking if next number is larger than the current 'largest'
        if (num2 > largest) {
            largest = num2; // If larger, we update 'largest' with this value
        }

        // Continue for each number provided
        if (num3 > largest) {
            largest = num3; 
        }
        
        if (num4 > largest) {
            largest = num4;
        }
        if (num5 > largest) {
            largest = num5; 
        }

        // Printing the "largest" variable
        System.out.println("The largest number is: " + largest);

        input.close();
    }
}
