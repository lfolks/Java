/*
 *  @title Average of inputed integers
 *  @author Lloyd Folks
 *  @version 2
 */
import java.util.Scanner;
import java.text.DecimalFormat;

public class Averages {
    public static void main(String[] args) {
        try (Scanner kb = new Scanner(System.in)) {
            DecimalFormat df = new DecimalFormat("0.00");
            
            System.out.print("Enter the number of integers: ");
            int count = kb.nextInt(); // Captures the number of integers the user wants to enter
            
            double sum = 0;
            for (int i = 1; i <= count; i++) {
                System.out.print("Enter number " + i + ": ");
                sum += kb.nextDouble(); // Adds each entered number to the sum
            }
            
            double average = sum / count; // Calculates the average
            
            System.out.println("The average value is: " + df.format(average));
        }
    }
}
