public class LabTask3 {
        public static void main(String[] args) {
            // Starting money invested/Starting balance (called the principal)
            double principal = 1000.0;
    
            // The interest rate is 5%
            double rate = 0.05;
    
            // This line prints the table header: "Year" and "Amount on deposit"
            // %-5s means the "Year" column is left-aligned and takes up 5 spaces
            // %20s means the "Amount on deposit" column is right-aligned and takes up 20 spaces
            System.out.printf("%-5s %20s\n", "Year", "Amount on deposit");
    
            // This loop repeats 10 times, once for each year (from 1 to 10)
            // It calculates the new amount in the account at the end of each year
            for (int year = 1; year <= 10; year++) {
                // Updating the principal (balance) by multiplying it by (1 + rate)
                principal = principal * (1 + rate);
    
                // This line prints the year and the amount on deposit at the end of that year
                // %-5d prints the year (as an integer) in a left-aligned format
                // %20.2f prints the balance, rounded to 2 decimal places, right-aligned over 20 spaces
                System.out.printf("%-5d %20.2f\n", year, principal);
            }
        }
    }
