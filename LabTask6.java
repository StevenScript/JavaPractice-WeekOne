import java.util.Random; // Importing the Random class to generate random numbers

public class LabTask6 {
    public static void main(String[] args) {
        // An array to store 100 random integers
        int[] numbers = new int[100];

        // Another array of size 10 to count the frequency of each number (0 to 9).
        int[] frequency = new int[10];

        // "Random" object to generate random numbers
        Random rand = new Random();

        // Generate random numbers between 0 and 9
        // stores them in the 'numbers' array.
        // For each random number generated, update the associated index in the 'frequency' array.
        for (int i = 0; i < 100; i++) {
            // This line generates a random number
            numbers[i] = rand.nextInt(10); // nextInt(10) generates numbers from 0 to 9

            // Increment the frequency for this random number
            frequency[numbers[i]]++;
        }

        // Print the frequency of each number from 0 to 9
        System.out.println("Number\tFrequency");

        for (int i = 0; i < 10; i++) {
            // Printing the number (represented by the index) and its frequency
            // If the number appeared more than 1 time, we print 'times'; otherwise, we print 'time'.
            if (frequency[i] == 1) {
                System.out.printf("%d\t%d time\n", i, frequency[i]);
            } else {
                System.out.printf("%d\t%d times\n", i, frequency[i]);
            }
        }
    }
}