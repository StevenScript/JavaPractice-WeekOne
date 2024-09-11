import java.util.Scanner;

public class LabTask5 {
    public static void main(String[] args) {
        // Create a Scanner object to take input from the user
        Scanner input = new Scanner(System.in);

        // Enter two numbers
        System.out.println("Enter two numbers (e.g., 30.52 50.80):");
        double num1 = input.nextDouble(); // Reading the first number
        double num2 = input.nextDouble(); // Reading the second number

        // Prompt the user to enter an operator
        System.out.println("Enter an operator (+, -, *, /):");
        char operator = input.next().charAt(0); // Reading the operator (as a character)

        // Variable to store the result of the operation
        double result;

        // Switch statement to perform the correct operation based on the operator entered
        switch (operator) {
            case '+':
                result = num1 + num2;
                // Print the result in the format: num1 + num2 = result
                System.out.printf("%.2f + %.2f = %.2f\n", num1, num2, result);
                break;

            case '-':
                result = num1 - num2;
                System.out.printf("%.2f - %.2f = %.2f\n", num1, num2, result);
                break;

            case '*':
                result = num1 * num2;
                System.out.printf("%.2f * %.2f = %.2f\n", num1, num2, result);
                break;

            case '/':                
                if (num2 != 0) {
                    result = num1 / num2;                    
                    System.out.printf("%.2f / %.2f = %.2f\n", num1, num2, result);
                } else {
                    System.out.println("Error! Division by zero is not allowed.");
                }
                break;

            default:
                System.out.println("Invalid operator! Please enter one of the following: +, -, *, /.");
                break;
        }

        
        input.close();
 }
}