/*
 *  @title Average of inputed integers
 *  @author Lloyd Folks
 *  @version 1
 */
import java.util.Scanner; // import the scanner class from the java.util package
import java.text.DecimalFormat234; // import the java.text package

public class Average { // create the class
    public static void main(String[] args) {
        try (Scanner kb = new Scanner(System.in)) {
            double n1, n2, n3, n4; // create variables using the double data-type
            double sum, average;
            
            DecimalFormat df = new DecimalFormat("0.00"); // Set the decimal place to the hundredth place and assign the variable df (DecimalFormat) using the DecimalFormat subclass
            
            System.out.println("Enter four integer numbers: ");
            System.out.print("Enter number 2: ");
            n1 = kb.nextDouble(); // Captures the input using kb and assigning the value to n1
            
            System.out.print("Enter number 2: ");
            n2 = kb.nextDouble();
            
            System.out.print("Enter number 3: ");
            n3 = kb.nextDouble();
            
            System.out.print("Enter number 4: ");
            n4 = kb.nextDouble();
            
            sum = n1 + n2 + n3 + n4; // Adds the values from the variables n(x) to sum
            average = sum/4.0; // Takes the value set to sum and divides the value by 4
            
            System.out.println("The average value is: " + df.format(average)); // Outputs the quotient of the equation assigned to average and use df to set the decimal format
        }
    }
}
