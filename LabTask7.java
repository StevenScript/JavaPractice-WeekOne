import java.util.Scanner;

public class LabTask7 {    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Declare a variable for user's menu choice
        int choice;

        // Use a do-while loop to keep showing the menu until user selects "Exit"
        do {
            System.out.println("Menu:");
            System.out.println("1. Convert Decimal to Binary");
            System.out.println("2. Convert Binary to Decimal");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            // Use switch-case

            switch (choice) {
                // Decimal to Binary conversion
                case 1:                    
                    System.out.print("Enter a decimal number: ");
                    int decimal = scanner.nextInt();

                    // Convert decimal to binary using Integer.toBinaryString()
                    String binary = Integer.toBinaryString(decimal);
                    System.out.println("Binary representation: " + binary);
                    break;

                // Binary to Decimal conversion
                case 2:                    
                    System.out.print("Enter a binary number: ");
                    // Read the binary number as a string (to avoid leading zero issues)
                    String binaryInput = scanner.next();
                    try {
                        // Convert binary to decimal using Integer.parseInt() with radix 2
                        // radix refers to the base of a number system, in this case it is base 2 AKA Binary.
                        int decimalValue = Integer.parseInt(binaryInput, 2);
                        System.out.println("Decimal representation: " + decimalValue);
                    } catch (NumberFormatException e) {
                        System.out.println("Invalid binary number.");
                    }
                    break;

                case 3:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice! Please select again.");
            }

            System.out.println(); // For spacing
        } while (choice != 3); // Continues the loop until the user chooses to exit via 3.

        scanner.close();
    }
}
